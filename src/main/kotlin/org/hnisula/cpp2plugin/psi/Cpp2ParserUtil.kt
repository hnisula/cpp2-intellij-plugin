package org.hnisula.cpp2plugin.psi

import com.intellij.lang.PsiBuilder
import com.intellij.psi.tree.IElementType

open class Cpp2ParserUtil : com.intellij.lang.parser.GeneratedParserUtilBase() {
    companion object {
        private val MUL_LOOKAHEADS: Set<IElementType> = setOf(
            Cpp2Types.IDENTIFIER_WORD,
            Cpp2Types.BOOL_LITERAL,
            Cpp2Types.INT_LITERAL,
            Cpp2Types.FLOAT_LITERAL,
            Cpp2Types.STRING_LITERAL,
            Cpp2Types.CHAR_LITERAL,
            Cpp2Types.LEFT_PARENTHESIS
        )
        
        @JvmStatic
        fun mulDerefDisambiguator(builder: PsiBuilder, level: Int): Boolean {
            return MUL_LOOKAHEADS.contains(builder.lookAhead(1))
        }
    }
}