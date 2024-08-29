package org.hnisula.cpp2plugin

import com.intellij.model.Pointer
import com.intellij.model.Symbol
import java.util.Objects

class Cpp2Symbol(private val identifier: String) : Symbol {
    override fun createPointer(): Pointer<out Symbol> {
        return Pointer.hardPointer(this)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false

        val otherSymbol = other as Cpp2Symbol
        return identifier == otherSymbol.identifier
    }

    override fun hashCode(): Int {
//        return identifier.hashCode()
        return Objects.hash(identifier)
    }
}   