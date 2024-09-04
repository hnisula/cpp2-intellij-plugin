package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.util.childrenOfType
import org.hnisula.cpp2plugin.Cpp2SymbolDeclaration

open class Cpp2PsiNamespaceDeclaration(node: ASTNode) : ASTWrapperPsiElement(node), Cpp2PsiDeclaration, Cpp2PsiScope {
    override val symbolDeclaration: Cpp2SymbolDeclaration
        get() = Cpp2SymbolDeclaration(node.firstChildNode.text, this)

    override fun getOwnDeclarations(): MutableCollection<out PsiSymbolDeclaration> {
        val stmtBlock = node.psi.childrenOfType<Cpp2RootStmtBlock>().firstOrNull()
        
        return stmtBlock!!.getOwnDeclarations()
    }

    override fun getDeclaringElement(): PsiElement = node.psi.firstChild

    override fun getRangeInDeclaringElement(): TextRange = node.psi.firstChild.textRangeInParent

    override fun getSymbol(): Symbol = symbolDeclaration.symbol
}