package org.hnisula.cpp2plugin

import com.intellij.lexer.FlexAdapter

class Cpp2LexerAdapter : FlexAdapter(Cpp2Lexer(null)) {
}