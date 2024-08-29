package org.hnisula.cpp2plugin

import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.util.containers.addIfNotNull
import org.hnisula.cpp2plugin.psi.Cpp2PsiUtil

class Cpp2SymbolReference(
    private val identifiers: List<String>,
    private val element: PsiElement,
    private val isGlobal: Boolean
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
            val symbol = findSymbolInScope(parentScope, 0)
            
            if (symbol != null) {
                symbols.add(symbol)
                break
            }
            
            parentScope = parentScope.context
        }
        
        return symbols
    }
    
    private fun findSymbolInScope(scope: PsiElement, identifierIndex: Int): Symbol? {
        val scopeDecls = scope.ownDeclarations.mapNotNull { it as? Cpp2SymbolDeclaration }
        
        for (decl in scopeDecls) {
            if (identifiers[identifierIndex] == decl.identifier) {
                if (isLastIdentifier(identifierIndex)) {
                    return decl.symbol
                } else {
                    return findSymbolInScope(decl.getDeclaringElement(), identifierIndex + 1)
                }
            }
        }
        
        return null
    }
    
    private fun isLastIdentifier(index: Int): Boolean {
        return index == identifiers.size - 1
    }
}