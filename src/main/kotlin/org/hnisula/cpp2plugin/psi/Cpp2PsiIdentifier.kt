//package org.hnisula.cpp2plugin.psi
//
//import com.intellij.extapi.psi.ASTWrapperPsiElement
//import com.intellij.lang.ASTNode
//import com.intellij.model.psi.PsiSymbolReference
//import com.intellij.psi.PsiElement
//import com.intellij.psi.util.PsiTreeUtil
//import com.intellij.psi.util.childrenOfType
//import com.intellij.psi.util.elementType
//import org.hnisula.cpp2plugin.Cpp2SymbolReference
//import org.hnisula.cpp2plugin.psi.impl.Cpp2ScopeImpl
//
//open class Cpp2PsiIdentifier(node: ASTNode) : ASTWrapperPsiElement(node) {
//    override fun getOwnReferences(): MutableCollection<out PsiSymbolReference> {
//        val identifiers = getScopeIdentifiers()
//        identifiers.add(getIdentifier())
//        val references = mutableListOf<Cpp2SymbolReference>()
//
//        for (i in identifiers.indices) {
//            references.add(Cpp2SymbolReference(identifiers[i], identifiers.subList(0, i + 1).map { it.text }))
//        }
//
//        return references
//    }
//
//    private fun getScopeIdentifiers(): MutableList<PsiElement> {
//        val scopeElement = PsiTreeUtil.getChildOfType(node.psi, Cpp2ScopeImpl::class.java)
//        
//        if (scopeElement == null) {
//            return mutableListOf()
//        }
//        
//        return scopeElement.childrenOfType<PsiElement>()
//            .filter { it.elementType == Cpp2Types.IDENTIFIER_WORD }
//            .toMutableList()
//    }
//
//    private fun getIdentifier(): PsiElement {
//        return node.psi.lastChild
//    }
//}