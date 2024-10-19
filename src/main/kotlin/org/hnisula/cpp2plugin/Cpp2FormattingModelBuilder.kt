package org.hnisula.cpp2plugin

import com.intellij.formatting.*

class Cpp2FormattingModelBuilder : FormattingModelBuilder {
    override fun createModel(formattingContext: FormattingContext): FormattingModel {
        val rootBlock = Cpp2Block(
            formattingContext.node,
            null,
            Indent.getSmartIndent(Indent.Type.CONTINUATION)
        )
        return FormattingModelProvider.createFormattingModelForPsiFile(
            formattingContext.containingFile, rootBlock, formattingContext.codeStyleSettings
        )
    }
}