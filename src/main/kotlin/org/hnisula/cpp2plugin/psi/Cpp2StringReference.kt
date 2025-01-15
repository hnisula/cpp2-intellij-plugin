package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.Symbol
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.Cpp2Reference

class Cpp2StringReference(node: ASTNode, private val textRangeInString: TextRange) : ASTWrapperPsiElement(node),
    Cpp2Reference {
    override fun getElement(): PsiElement = node.psi

    override fun getRangeInElement(): TextRange = textRangeInString

    override fun resolveReference(): MutableCollection<out Symbol> {
        // TEST: Assume all code parts of an interpolated strings are references
        val identifier = rangeInElement.substring(node.text)

        val scopeInfo = Cpp2PsiUtil.getScopeInfo(node.psi)
        return Cpp2PsiUtil.resolveReference(this, identifier, scopeInfo.scopeIdentifiers, scopeInfo.isGlobalScope)
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }
}