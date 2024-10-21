package org.hnisula.cpp2plugin.psi

import com.intellij.psi.tree.TokenSet

interface Cpp2TokenSets {
    companion object {
        val IDENTIFIERS: TokenSet = TokenSet.create(Cpp2Types.IDENTIFIER_WORD) // TODO: What should I use here, really? What is it for?
        val COMMENTS: TokenSet = TokenSet.create(Cpp2Types.LINE_COMMENT, Cpp2Types.BLOCK_COMMENT)
    }
}