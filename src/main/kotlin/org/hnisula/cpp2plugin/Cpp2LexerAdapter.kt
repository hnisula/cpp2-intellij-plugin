package org.hnisula.cpp2plugin

import org.hnisula.cpp2plugin.Cpp2Lexer
import com.intellij.lexer.FlexAdapter

class Cpp2LexerAdapter : FlexAdapter(org.hnisula.cpp2plugin.Cpp2Lexer(null)) {
}