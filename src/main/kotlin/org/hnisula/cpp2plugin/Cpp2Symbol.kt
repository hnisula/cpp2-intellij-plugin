package org.hnisula.cpp2plugin

import com.intellij.model.Pointer
import com.intellij.model.Symbol

class Cpp2Symbol(private val declaringElement: Cpp2SymbolDeclaration) : Symbol {
    override fun createPointer(): Pointer<out Symbol> {
        return Pointer.hardPointer(this)
    }
    
    val identifier: String
        get() = declaringElement.identifier
}