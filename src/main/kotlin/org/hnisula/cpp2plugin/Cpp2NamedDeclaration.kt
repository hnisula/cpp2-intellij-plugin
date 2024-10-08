package org.hnisula.cpp2plugin

import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.psi.PsiNamedElement

interface Cpp2NamedDeclaration : Cpp2Declaration, PsiSymbolDeclaration, PsiNamedElement {
    val identifier: String
}