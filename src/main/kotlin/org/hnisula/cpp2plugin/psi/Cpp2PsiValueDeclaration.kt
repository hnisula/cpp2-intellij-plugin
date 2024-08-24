package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.Symbol
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.Cpp2SymbolDeclaration

open class Cpp2PsiValueDeclaration(node: ASTNode) : ASTWrapperPsiElement(node), Cpp2PsiDeclaration {
    companion object {
        fun extractIdentifier(element: ASTWrapperPsiElement): String {
            return element.firstChild.text
        }
    }
    
    override fun getDeclaringElement(): PsiElement = node.psi

    override fun getRangeInDeclaringElement(): TextRange = node.psi.textRange

    override fun getSymbol(): Symbol {
        TODO("Not yet implemented")
    }
}