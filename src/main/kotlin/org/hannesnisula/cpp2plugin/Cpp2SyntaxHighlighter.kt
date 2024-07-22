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
        val TEST_COLOR: TextAttributesKey = createTextAttributesKey("TYPE_SPECIFIER", DefaultLanguageHighlighterColors.STRING)
        val TEST_COLOR2: TextAttributesKey = createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.KEYWORD)
        val COMMENT: TextAttributesKey = createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    }
    
    override fun getHighlightingLexer(): Lexer = Cpp2LexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            Cpp2Types.TYPE_SPECIFIER -> pack(TEST_COLOR)
            Cpp2Types.IDENTIFIER_WORD -> pack(TEST_COLOR2)
            Cpp2Types.COMMENT -> pack(COMMENT)
            else -> emptyArray()
        }
    }
}