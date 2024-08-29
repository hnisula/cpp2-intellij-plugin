package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.Cpp2SymbolReference

open class Cpp2PsiIdentifier(node: ASTNode) : ASTWrapperPsiElement(node), Cpp2PsiReference {
    override fun getElement(): PsiElement = this

    override fun getRangeInElement(): TextRange = textRange

    override fun resolveReference(): MutableCollection<out Symbol> {
        val scopeInfo = getScopeInfo()
        return Cpp2ResolverUtil.resolveReference(this, scopeInfo.scopeIdentifiers + text)
    }

    override fun getOwnReferences(): MutableCollection<out PsiSymbolReference> {
        val scopeInfo = getScopeInfo()
        return mutableListOf(Cpp2SymbolReference(scopeInfo.scopeIdentifiers + text, this, scopeInfo.isGlobalScope))
    }
    
    override fun getName(): String {
        return getIdentifier().text
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    private fun getIdentifier(): PsiElement {
        return node.psi.firstChild
    }
    
    private data class ScopeInfo(val scopeIdentifiers: MutableList<String>, val isGlobalScope: Boolean)
    
    private fun getScopeInfo(): ScopeInfo {
        val scopeIdentifiers = mutableListOf<String>()
        var isGlobalScope = false
        var siblingIt = node.psi.prevSibling

        while (siblingIt != null) {
            if (siblingIt is Cpp2PsiIdentifier) {
                scopeIdentifiers.add(siblingIt.text)
            }

            if (siblingIt.prevSibling == null && siblingIt.text == "::") {
                isGlobalScope = true
            }

            siblingIt = siblingIt.prevSibling
        }
        
        return ScopeInfo(scopeIdentifiers, isGlobalScope)
    }
}