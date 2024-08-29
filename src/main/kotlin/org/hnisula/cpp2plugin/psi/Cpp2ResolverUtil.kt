package org.hnisula.cpp2plugin.psi

import com.intellij.model.Symbol
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.Cpp2SymbolDeclaration
import org.hnisula.cpp2plugin.Cpp2SymbolReference

class Cpp2ResolverUtil {
    companion object {
        private fun findIdentifierDeclInScope(identifier: String, scope: PsiElement): PsiElement? { // TODO: Have a scope element class?
            val decls = Cpp2PsiUtil.getDeclsInScope(scope)

            for (decl in decls) {
                if (decl.identifier == identifier) {
                    return decl.declaringElement
                }
            }

             return null
        }

        // TODO: Rename to "...InRootScope"?
        fun findQualifiedIdentifierDeclInScope(identifiers: Collection<String>, scope: PsiElement): Cpp2SymbolDeclaration? {
            var currentScope: PsiElement? = scope

            for (identifier in identifiers) {
                if (currentScope == null) {
                    return null
                }

                currentScope = findIdentifierDeclInScope(identifier, currentScope)
            }
            
            return null
//            return if (currentScope is Cpp2SymbolDeclaration) {
//                currentScope
//            } else {
//                null
//            }
        }

        fun resolveReference(element: PsiElement, identifiers: List<String>): MutableCollection<out Symbol> {
            val symbols = mutableListOf<Symbol>()
            var parentScope = Cpp2PsiUtil.getContext(element)

            // Travel up parent scopes and try to resolve the reference in each scope
            while (parentScope != null) {
                val symbol = findSymbolInScope(parentScope, identifiers, 0)

                if (symbol != null) {
                    symbols.add(symbol)
                    break
                }

                parentScope = parentScope.context
            }

            return symbols
        }

        private fun findSymbolInScope(scope: PsiElement, identifiers: List<String>, identifierIndex: Int): Symbol? {
            val scopeDecls = scope.ownDeclarations.mapNotNull { it as? Cpp2SymbolDeclaration }

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

        private fun isLastIdentifier(index: Int, identifiers: List<String>): Boolean {
            return index == identifiers.size - 1
        }
    }
}