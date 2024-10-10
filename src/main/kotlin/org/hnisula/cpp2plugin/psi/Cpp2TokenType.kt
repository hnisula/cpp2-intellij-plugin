package org.hnisula.cpp2plugin.psi

import com.intellij.psi.tree.IElementType
import org.hnisula.cpp2plugin.Cpp2Language
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class Cpp2TokenType(@NotNull @NonNls debugName: String) : IElementType(debugName, Cpp2Language) {
    override fun toString(): String {
        return "Cpp2TokenType." + super.toString()
    }
}