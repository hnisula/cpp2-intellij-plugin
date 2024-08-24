package org.hnisula.cpp2plugin

import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.psi.Cpp2PsiUtil
import org.hnisula.cpp2plugin.psi.Cpp2ResolverUtil

class Cpp2SymbolReference(
    private val identifiers: Collection<String>,
    private val element: PsiElement,
    private val isGlobal: Boolean = false
) : PsiSymbolReference {
    override fun getElement(): PsiElement {
        return element
    }

    override fun getRangeInElement(): TextRange {
        return TextRange(0, element.textLength)
    }

    override fun resolveReference(): MutableCollection<out Symbol> {
        val symbols = mutableListOf<Symbol>()
        var parentScope = Cpp2PsiUtil.getContext(element)
        
        // Travel up parent scopes and try to resolve the reference in each scope
        while (parentScope != null) {
            val identifierDeclElement = Cpp2ResolverUtil.findQualifiedIdentifierDeclInScope(identifiers, parentScope)
            
            if (identifierDeclElement == null) {
                parentScope = Cpp2PsiUtil.getContext(parentScope)
                continue
            }
            
            symbols.add(identifierDeclElement.symbol)
        }
        
        return symbols
    }
}