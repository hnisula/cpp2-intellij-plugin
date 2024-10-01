package org.hnisula.cpp2plugin

import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.psi.PsiElement

interface Cpp2Scope : PsiElement {
    override fun getOwnDeclarations(): Collection<PsiSymbolDeclaration>
}