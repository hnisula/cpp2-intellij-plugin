package org.hnisula.cpp2plugin.psi

import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.childrenOfType
import com.intellij.psi.util.elementType
import org.hnisula.cpp2plugin.Cpp2SymbolDeclaration
import org.hnisula.cpp2plugin.Cpp2SymbolReference
import org.hnisula.cpp2plugin.psi.impl.Cpp2FuncDeclImpl
import org.hnisula.cpp2plugin.psi.impl.Cpp2ParamImpl

class Cpp2PsiUtil {
    companion object {
        private val Cpp2AliasDeclTypes = arrayOf(
            Cpp2ObjAliasDecl::class.java,
            Cpp2TypeAliasDecl::class.java,
            Cpp2FuncAliasDecl::class.java,
            Cpp2NamespaceAliasDecl::class.java
        )
        private val Cpp2DeclTypesTEST = arrayOf(Cpp2ValueDecl::class.java)
        private val Cpp2DeclTypes = arrayOf(
            Cpp2ValueDecl::class.java,
            Cpp2FuncDecl::class.java,
            Cpp2TypeDecl::class.java,
            Cpp2NamespaceDecl::class.java,
            *Cpp2AliasDeclTypes
        )
        private val Cpp2ScopeTypes = arrayOf(
            Cpp2File::class.java,
            Cpp2NamespaceDecl::class.java,
            Cpp2TypeDecl::class.java,
            Cpp2FuncDecl::class.java,
            // TODO: Add branches, loops, blocks, etc
        )

        @JvmStatic
        fun getContext(element: PsiElement): PsiElement? {
            return PsiTreeUtil.getParentOfType(element, *Cpp2ScopeTypes)
        }

        @JvmStatic
        fun getDeclsInScope(scopeElement: PsiElement): Collection<Cpp2SymbolDeclaration> {
//            return PsiTreeUtil.getChildrenOfAnyType(scopeElement, *Cpp2DeclTypes)
//            return PsiTreeUtil.getChildrenOfAnyType(scopeElement, Cpp2ValueDecl::class.java)
//            val t = PsiTreeUtil.getChildrenOfAnyType(scopeElement, Cpp2ValueDecl::class.java)
            return emptyList()
        }

        @JvmStatic
        fun getDeclsInFuncScope(funcDeclElement: Cpp2FuncDeclImpl): Collection<Cpp2SymbolDeclaration> {
            val decls = mutableListOf<Cpp2SymbolDeclaration>()

            decls.addAll(getDeclsInParamList(funcDeclElement)) // TODO: FIX THESE 2
            decls.addAll(getDeclsInStmtBlock(funcDeclElement))

            return decls
        }

        @JvmStatic
        fun getDeclsInParamList(paramListElement: PsiElement): Collection<Cpp2SymbolDeclaration> {
            val decls = mutableListOf<Cpp2SymbolDeclaration>()
            var paramElements = PsiTreeUtil.getChildrenOfAnyType(paramListElement, Cpp2ParamImpl::class.java)
//            var variadicElements = PsiTreeUtil.getChildrenOfAnyType(paramListElement, Cpp2VariadicParam::class.java)

            for (paramElement in paramElements) {
//                decls.add(paramElement.valueDecl)
            }

            return decls
        }

        @JvmStatic
        fun getDeclsInStmtBlock(stmtBlockElement: PsiElement): Collection<Cpp2SymbolDeclaration> {
            val decls = mutableListOf<Cpp2SymbolDeclaration>()
//            var valueDecls = PsiTreeUtil.getChildrenOfAnyType(stmtBlockElement, Cpp2ValueDecl::class.java)
            var valueDecls = listOf<PsiElement>()

            for (valueDecl in valueDecls) {
//                decls.add(valueDecl.)
            }

            return decls
        }

        // Shared

        @JvmStatic
        fun getOwnDeclarations(element: PsiElement): Collection<PsiSymbolDeclaration> {
            if (element::class.java !in Cpp2ScopeTypes) return emptyList()

            return element.children.asSequence()
                .filter { it::class.java in Cpp2DeclTypes }
                .map { it as PsiSymbolDeclaration }
                .toList()
        }

        @JvmStatic
        fun getOwnReferences(element: Cpp2Identifier): Collection<PsiSymbolReference> {
            val identifiers = getScopesNames(element.scope) + element.lastChild.text
            val isGlobalScope = isGlobalScope(element.scope)
            val references = mutableListOf<Cpp2SymbolReference>()

            for (i in identifiers.indices) {
                references.add(Cpp2SymbolReference(identifiers.subList(0, i + 1), element, isGlobalScope))
            }

            return references
        }

        private fun getScopesNames(scopeElement: Cpp2Scope?): Collection<String> {
            if (scopeElement == null) return emptyList()
            return scopeElement.childrenOfType<PsiElement>()
                .filter { it.elementType == Cpp2Types.IDENTIFIER_WORD }
                .map { it.text }
        }

        private fun isGlobalScope(element: Cpp2Scope?): Boolean {
            if (element == null) return false
            return element.firstChild.firstChild.text == "::"
        }
    }
}