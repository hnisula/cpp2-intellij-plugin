package org.hnisula.cpp2plugin

import com.intellij.lang.Language

object Cpp2Language : Language("Cpp2") {
    private fun readResolve(): Any = Cpp2Language
}