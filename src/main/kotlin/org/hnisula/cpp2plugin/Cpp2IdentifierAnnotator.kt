package org.hnisula.cpp2plugin

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.psi.Cpp2FuncDecl
import org.hnisula.cpp2plugin.psi.Cpp2Identifier
import org.hnisula.cpp2plugin.psi.Cpp2TypeDecl

class Cpp2IdentifierAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element !is Cpp2Identifier) {
            return
        }

        if (element.parent is Cpp2FuncDecl) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION).range(element)
                .textAttributes(DefaultLanguageHighlighterColors.FUNCTION_DECLARATION).create()
        } else if (element.parent is Cpp2TypeDecl) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION).range(element)
                .textAttributes(DefaultLanguageHighlighterColors.CLASS_NAME).create()
        } else {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION).range(element)
                .textAttributes(DefaultLanguageHighlighterColors.IDENTIFIER).create()
        }
    }
}