package org.hnisula.cpp2plugin.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.childrenOfType
import org.hnisula.cpp2plugin.Cpp2SymbolDeclaration

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
            val declElements = scopeElement.childrenOfType<Cpp2PsiDeclaration>()
            return declElements.map { it.symbolDeclaration }
        }
    }
}