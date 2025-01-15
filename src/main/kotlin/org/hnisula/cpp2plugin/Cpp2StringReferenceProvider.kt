package org.hnisula.cpp2plugin

import com.intellij.model.Symbol
import com.intellij.model.psi.PsiExternalReferenceHost
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.model.psi.PsiSymbolReferenceHints
import com.intellij.model.psi.PsiSymbolReferenceProvider
import com.intellij.model.search.SearchRequest
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.TextRange
import com.intellij.psi.util.elementType
import org.hnisula.cpp2plugin.psi.Cpp2StringReference
import org.hnisula.cpp2plugin.psi.Cpp2Types

class Cpp2StringReferenceProvider : PsiSymbolReferenceProvider {
    private val regex: Regex = Regex("\\(([^)$]*)\\)\\$")

    override fun getReferences(
        element: PsiExternalReferenceHost, hints: PsiSymbolReferenceHints
    ): MutableCollection<out PsiSymbolReference> {
        if (element.elementType != Cpp2Types.STRING) {
            return mutableListOf()
        }

        val captures = getCaptureRanges(element.text)
        
        if (captures.isEmpty()) {
            return mutableListOf()
        }
        return captures.map { Cpp2StringReference(element.node, it) }.toMutableList()
    }

    override fun getSearchRequests(project: Project, target: Symbol): MutableCollection<out SearchRequest> {
        TODO("Not yet implemented")
    }

    private fun getCaptureRanges(text: String): List<TextRange> {
        val matches = regex.findAll(text)
        val t = matches.toList()
        return matches.map { TextRange(it.groups[1]!!.range.first, it.groups[1]!!.range.last + 1) }.toList()
    }
}