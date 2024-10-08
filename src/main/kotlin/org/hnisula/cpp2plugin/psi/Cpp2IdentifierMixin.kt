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
        val scopeInfo = getScopeInfo()
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

    private data class ScopeInfo(val scopeIdentifiers: MutableList<String>, val isGlobalScope: Boolean)
    
    private fun getScopeInfo(): ScopeInfo {
        if (node !is Cpp2QIdentifier) {
            return ScopeInfo(mutableListOf(), false)
        }

        val scopeIdentifiers = mutableListOf<String>()
        var siblingIt = node.psi.prevSibling
        var isGlobalScope = false

        while (siblingIt != null) {
            if (siblingIt is Cpp2Identifier) {
                scopeIdentifiers.add(0, siblingIt.text)
            }

            if (siblingIt.prevSibling == null && siblingIt.text == "::") {
                isGlobalScope = true
            }

            siblingIt = siblingIt.prevSibling
        }
        
        return ScopeInfo(scopeIdentifiers, isGlobalScope)
    }
}
