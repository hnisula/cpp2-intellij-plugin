package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.psi.util.childrenOfType

open class Cpp2PsiFuncDeclaration(node: ASTNode) : ASTWrapperPsiElement(node), Cpp2PsiScope {
    override fun getOwnDeclarations(): MutableCollection<out PsiSymbolDeclaration> {
//        val paramList = node.psi.childrenOfType<Cpp2ParamList>()
        val decls = mutableListOf<PsiSymbolDeclaration>()
        val stmtBlock = node.psi.childrenOfType<Cpp2StmtBlock>().firstOrNull()
        
        if (stmtBlock != null) {
            decls.addAll(stmtBlock.getOwnDeclarations())
        }
        
        return decls
    }

}