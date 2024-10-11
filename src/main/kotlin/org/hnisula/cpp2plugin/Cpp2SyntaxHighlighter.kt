package org.hnisula.cpp2plugin

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.hnisula.cpp2plugin.psi.Cpp2Types

class Cpp2SyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        private val LINE_COMMENT: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("CPP2_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        private val BLOCK_COMMENT: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "CPP2_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT
        )
        private val BOOL_LITERAL: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "CPP2_BOOL_LITERAL", DefaultLanguageHighlighterColors.KEYWORD
        )
        private val NUMERIC_LITERAL: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "CPP2_NUMERIC_LITERAL", DefaultLanguageHighlighterColors.NUMBER
        )
        private val STRING_LITERAL: TextAttributesKey = TextAttributesKey.createTextAttributesKey(
            "CPP2_STRING_LITERAL", DefaultLanguageHighlighterColors.STRING
        )

        val COMMENT_KEYS: Array<TextAttributesKey> = arrayOf(LINE_COMMENT, BLOCK_COMMENT)
        val BOOL_LITERAL_KEYS: Array<TextAttributesKey> = arrayOf(BOOL_LITERAL)
        val NUMERIC_LITERAL_EYS: Array<TextAttributesKey> = arrayOf(NUMERIC_LITERAL)
        val STRING_LITERAL_KEYS: Array<TextAttributesKey> = arrayOf(STRING_LITERAL)
    }

    override fun getHighlightingLexer(): Lexer = Cpp2LexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        if (tokenType == Cpp2Types.LINE_COMMENT || tokenType == Cpp2Types.BLOCK_COMMENT) {
            return COMMENT_KEYS
        } else if (tokenType == Cpp2Types.BOOL_LITERAL) {
            return BOOL_LITERAL_KEYS
        } else if (tokenType == Cpp2Types.FLOAT_LITERAL || tokenType == Cpp2Types.INT_LITERAL) {
            return NUMERIC_LITERAL_EYS
        } else if (tokenType == Cpp2Types.STRING_LITERAL) {
            return STRING_LITERAL_KEYS
        } else {
            return emptyArray()
        }
    }
}