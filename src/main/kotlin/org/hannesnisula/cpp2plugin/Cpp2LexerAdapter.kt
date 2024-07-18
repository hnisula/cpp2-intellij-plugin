package org.hannesnisula.cpp2plugin

import org.hannesnisula.cpp2plugin.Cpp2Lexer
import com.intellij.lexer.FlexAdapter

class Cpp2LexerAdapter : FlexAdapter(Cpp2Lexer(null)) {
}