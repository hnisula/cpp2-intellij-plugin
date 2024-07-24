package org.hannesnisula.cpp2plugin.psi

import com.intellij.psi.tree.TokenSet

interface Cpp2TokenSets {
    companion object {
        val IDENTIFIERS: TokenSet = TokenSet.create(Cpp2Types.ID)
//        val COMMENTS: TokenSet = TokenSet.create(Cpp2Types.COMMENT)
    }
}