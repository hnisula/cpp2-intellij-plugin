package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.Cpp2Reference

open class Cpp2IdentifierMixin(node: ASTNode) : ASTWrapperPsiElement(node), Cpp2Reference {
    override fun getElement(): PsiElement {
        return node.psi
    }

    override fun getRangeInElement(): TextRange {
        return TextRange(0, text.length)
    }

    override fun resolveReference(): MutableCollection<out Symbol> {
        val scopeInfo = Cpp2PsiUtil.getScopeInfo(node.psi)
        return Cpp2PsiUtil.resolveReference(this, name, scopeInfo.scopeIdentifiers, scopeInfo.isGlobalScope)
    }

    override fun getOwnReferences(): MutableCollection<out PsiSymbolReference> {
        return mutableListOf(this)
    }
    
    override fun getName(): String {
        return node.text
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }
}
