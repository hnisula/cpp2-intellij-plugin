package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.psi.util.childrenOfType

open class Cpp2PsiFile(node: ASTNode) : ASTWrapperPsiElement(node), Cpp2PsiScope {
    override fun getOwnDeclarations(): MutableCollection<out PsiSymbolDeclaration> {
        val decls = mutableListOf<PsiSymbolDeclaration>()
        val declElements = node.psi.childrenOfType<Cpp2PsiDeclaration>()

        for (element in declElements) {
            decls.add(element.symbolDeclaration)
        }

        return decls
    }
}