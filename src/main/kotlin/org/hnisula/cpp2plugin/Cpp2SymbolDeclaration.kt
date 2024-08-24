package org.hnisula.cpp2plugin

import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement

class Cpp2SymbolDeclaration(private val declarationIdentifier: String, protected val element: PsiElement) :
    PsiSymbolDeclaration {
    override fun getDeclaringElement(): PsiElement = element

    override fun getRangeInDeclaringElement(): TextRange = element.textRange

    override fun getSymbol(): Symbol {
        return Cpp2Symbol(this)
    }
    
    val identifier: String
        get() = declarationIdentifier
}