package org.hnisula.cpp2plugin.psi

import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.navigation.SymbolNavigationService
import com.intellij.openapi.project.Project
import com.intellij.platform.backend.navigation.NavigationTarget
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.parentOfTypes
import org.hnisula.cpp2plugin.Cpp2NamedDeclaration
import org.hnisula.cpp2plugin.Cpp2Reference
import org.hnisula.cpp2plugin.Cpp2Scope
import org.hnisula.cpp2plugin.Cpp2Symbol

class Cpp2PsiUtil {
    companion object {
        @JvmStatic
        fun getNavigationTargets(element: PsiElement, project: Project): MutableCollection<out NavigationTarget> {
            return mutableListOf(SymbolNavigationService.getInstance().psiElementNavigationTarget(element))
        }

        @JvmStatic
        fun getContext(element: PsiElement): PsiElement? {
            return getParentScope(element)
        }

        @JvmStatic
        fun getParentScope(element: PsiElement): Cpp2Scope? {
            return element.parentOfTypes(Cpp2Scope::class)
        }

        @JvmStatic
        fun generateAnonScopeName(element: PsiElement): String {
            val numPrevAnonScopes = getNumPrevAnonScopes(element)
            return "anon_scope_$numPrevAnonScopes"
        }

        @JvmStatic
        private fun getNumPrevAnonScopes(element: PsiElement): Int {
            var numPrevAnonScopes = 0
            var prevIt = element.prevSibling

            while (prevIt != null) {
                if (prevIt is Cpp2Scope && prevIt.isAnonymous) {
                    numPrevAnonScopes++
                }
                prevIt = prevIt.prevSibling
            }

            return numPrevAnonScopes
        }

        @JvmStatic
        fun getDeclarations(scope: PsiElement): Collection<PsiSymbolDeclaration> {
            val t = PsiTreeUtil.getChildrenOfType(scope, Cpp2NamedDeclaration::class.java) ?: return emptyList()

            return t.mapNotNull { it }
        }

        @JvmStatic
        fun resolveReference(
            element: Cpp2Reference, identifier: String, scopeIdentifiers: List<String>, isGlobalScope: Boolean
        ): MutableCollection<out Symbol> {
            val symbols = mutableListOf<Symbol>()
            var parentScope = getContext(element)
            val allIdentifiers = scopeIdentifiers + identifier

            // First try to resolve in local scope, if not referring to global scope from the outset
            if (!isGlobalScope) {
                // Traverse up parent scopes and try to resolve the reference in each scope
                while (parentScope != null) {
                    val symbol = findSymbolInScope(parentScope, allIdentifiers, 0)

                    if (symbol != null) {
                        symbols.add(symbol)
                        break
                    }

                    parentScope = parentScope.context
                }
            }

            // TODO: Secondly try to resolve in global scope

            return symbols
        }

        @JvmStatic
        private fun findSymbolInScope(scope: PsiElement, identifiers: List<String>, identifierIndex: Int): Symbol? {
            val scopeDecls = scope.ownDeclarations.mapNotNull { it as? Cpp2NamedDeclaration }

            for (decl in scopeDecls) {
                if (identifiers[identifierIndex] == decl.identifier) {
                    if (isLastIdentifier(identifierIndex, identifiers)) {
                        return decl.symbol
                    } else {
                        return findSymbolInScope(decl.getDeclaringElement(), identifiers, identifierIndex + 1)
                    }
                }
            }

            return null
        }

        @JvmStatic
        private fun isLastIdentifier(index: Int, identifiers: List<String>): Boolean {
            return index == identifiers.size - 1
        }

        @JvmStatic
        fun getSymbol(element: Cpp2NamedDeclaration): Symbol {
            val parentScope =
                getParentScope(element) ?: throw IllegalStateException("Type declaration must have a parent scope")

            return Cpp2Symbol(element.identifier, parentScope.getGloballyScopedIdentifier(), element)
        }
    }
}