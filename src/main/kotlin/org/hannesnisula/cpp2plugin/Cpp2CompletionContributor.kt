package org.hannesnisula.cpp2plugin

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext
import org.hannesnisula.cpp2plugin.psi.Cpp2Types

class Cpp2CompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(Cpp2Types.IDENTIFIER_WORD), // Not working as expected, it seems. Only for lexemes but very few?
            object: CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    result: CompletionResultSet
                ) {
                    result.addElement(LookupElementBuilder.create("Hello"))
                }
            })
    }
}