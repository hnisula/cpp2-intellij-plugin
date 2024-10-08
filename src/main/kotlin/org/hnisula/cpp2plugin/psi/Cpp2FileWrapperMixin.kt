package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.psi.PsiSymbolDeclaration
import org.hnisula.cpp2plugin.Cpp2Scope

open class Cpp2FileWrapperMixin(node: ASTNode) : ASTWrapperPsiElement(node), Cpp2Scope {
    override fun getOwnDeclarations(): Collection<PsiSymbolDeclaration> {
        return Cpp2PsiUtil.getDeclarations(this.firstChild)
    }

    override val isAnonymous: Boolean
        get() = true
    override val isGlobal: Boolean
        get() = true

    override fun getScopeName(): String {
        return ""
    }
}