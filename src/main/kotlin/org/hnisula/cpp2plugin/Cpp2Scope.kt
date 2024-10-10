package org.hnisula.cpp2plugin

import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.psi.Cpp2PsiUtil

interface Cpp2Scope : PsiElement {
    override fun getOwnDeclarations(): Collection<PsiSymbolDeclaration>
    
    val isAnonymous: Boolean
    val isGlobal: Boolean
    
    fun getScopeName(): String
    
    fun getGloballyScopedIdentifier(): List<String> {
        // TODO: Redundant and annoying to evaluate value in other subclasses?
        if (isGlobal) {
            return listOf()
        }
        
        val scopeName = getScopeName();
        val parentQualifiedScoped = Cpp2PsiUtil.getParentScope(this)?.getGloballyScopedIdentifier()
        val resultList = mutableListOf<String>()
        
        if (parentQualifiedScoped != null) {
            resultList.addAll(parentQualifiedScoped)
        }

        resultList.add(scopeName)
        return resultList
    }
}