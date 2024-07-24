package org.hannesnisula.cpp2plugin

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.hannesnisula.cpp2plugin.psi.Cpp2Types

class Cpp2SyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val KEYWORD: TextAttributesKey = createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val IDENTIFIER: TextAttributesKey = createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
        val COMMENT: TextAttributesKey = createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val NUMBER_LITERAL: TextAttributesKey = createTextAttributesKey("NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val STRING_LITERAL: TextAttributesKey = createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING)
    }
    
    override fun getHighlightingLexer(): Lexer = Cpp2LexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            Cpp2Types.FOR,
            Cpp2Types.DO -> pack(KEYWORD)
            Cpp2Types.IDENTIFIER_WORD -> pack(IDENTIFIER)
            Cpp2Types.NUMBER_LITERAL -> pack(NUMBER_LITERAL)
            Cpp2Types.STRING_LITERAL -> pack(STRING_LITERAL)
            Cpp2Types.COMMENT -> pack(COMMENT)
            else -> emptyArray()
        }
    }
}