package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.Cpp2SymbolDeclaration

class Cpp2PsiValueDecl(node: ASTNode) : ASTWrapperPsiElement(node) {
    companion object {
        fun extractIdentifier(element: ASTWrapperPsiElement): String {
            return element.firstChild.text
        }
    }
    
    val symbolDeclaration: Cpp2SymbolDeclaration = Cpp2SymbolDeclaration(node.psi.firstChild.text, node.psi)
}