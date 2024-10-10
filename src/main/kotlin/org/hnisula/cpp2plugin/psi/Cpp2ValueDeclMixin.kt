package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.Symbol
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.Cpp2NamedDeclaration
import org.hnisula.cpp2plugin.Cpp2Symbol

open class Cpp2ValueDeclMixin(node: ASTNode) : ASTWrapperPsiElement(node), Cpp2NamedDeclaration {
    override val identifier: String
        get() = name!!

    override fun getName(): String? = node.firstChildNode.text

    override fun getDeclaringElement(): PsiElement {
        return this
    }

    override fun getRangeInDeclaringElement(): TextRange {
        return node.firstChildNode.psi.textRangeInParent
    }

    override fun getSymbol(): Symbol = Cpp2PsiUtil.getSymbol(this)

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

}