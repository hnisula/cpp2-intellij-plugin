package org.hnisula.cpp2plugin.psi

import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.psi.PsiElement

interface Cpp2PsiScope : PsiElement {
    override fun getOwnDeclarations(): MutableCollection<out PsiSymbolDeclaration>
}