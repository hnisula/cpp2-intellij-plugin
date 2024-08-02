package org.hannesnisula.cpp2plugin.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import org.hannesnisula.cpp2plugin.Cpp2Util

open class Cpp2Reference(element: PsiElement, textRange: TextRange) :
    PsiReferenceBase<PsiElement>(element, textRange), PsiPolyVariantReference {
    val identifier: String = element.text.substring(textRange.startOffset..textRange.endOffset)

    override fun resolve(): PsiElement? {
        return multiResolve(false).firstOrNull()?.element
    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val project = myElement.project
        val props = Cpp2Util.findDecls(project, identifier)
        val results = ArrayList<PsiElementResolveResult>()
        
        for (prop in props) {
            results.add(PsiElementResolveResult(prop))
        }
        
        return results.toTypedArray()
    }
}