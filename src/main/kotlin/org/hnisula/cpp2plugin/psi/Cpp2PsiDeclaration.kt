package org.hnisula.cpp2plugin.psi

import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.Cpp2SymbolDeclaration

interface Cpp2PsiDeclaration : PsiElement, PsiSymbolDeclaration {
    val symbolDeclaration: Cpp2SymbolDeclaration
}
