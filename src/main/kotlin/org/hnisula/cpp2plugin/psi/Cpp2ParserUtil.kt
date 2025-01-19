package org.hnisula.cpp2plugin.psi

import com.intellij.lang.PsiBuilder
import com.intellij.psi.tree.IElementType

open class Cpp2ParserUtil : com.intellij.lang.parser.GeneratedParserUtilBase() {
    companion object {
        private val TERM_TYPES: Set<IElementType> = setOf(
            Cpp2Types.IDENTIFIER_WORD,
            Cpp2Types.BOOL_LITERAL,
            Cpp2Types.INT_LITERAL,
            Cpp2Types.FLOAT_LITERAL,
//            Cpp2Types.STRING_LITERAL,
            Cpp2Types.CHAR_LITERAL,
            Cpp2Types.LEFT_PARENTHESIS
        )
        
        @JvmStatic
        fun binaryOpTermLookhead(builder: PsiBuilder, level: Int): Boolean {
            return TERM_TYPES.contains(builder.lookAhead(1))
        }
    }
}