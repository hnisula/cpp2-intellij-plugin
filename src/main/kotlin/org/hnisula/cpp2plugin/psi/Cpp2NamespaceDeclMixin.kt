package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.Cpp2NamedDeclaration
import org.hnisula.cpp2plugin.Cpp2Scope

open class Cpp2NamespaceDeclMixin(node: ASTNode) : ASTWrapperPsiElement(node), Cpp2NamedDeclaration, Cpp2Scope {
    override val identifier: String
        get() = name!!

    override fun getName(): String? = node.firstChildNode.text

    override fun getOwnDeclarations(): Collection<PsiSymbolDeclaration> {
        val blockStart = node.lastChildNode.findChildByType(Cpp2Types.LEFT_BRACE)

        if (blockStart == null) {
            throw IllegalStateException("Type declaration must have a block")
        }

        var stmtIt = blockStart.treeNext
        val decls = mutableListOf<PsiSymbolDeclaration>()
        
        while (stmtIt.elementType != Cpp2Types.RIGHT_BRACE) {
            if (stmtIt.psi is Cpp2NamedDeclaration) {
                decls.add(stmtIt.psi as PsiSymbolDeclaration)
            }
            
            stmtIt = stmtIt.treeNext
        }
        
        return decls;
    }

    override val isAnonymous: Boolean
        get() = false
    override val isGlobal: Boolean
        get() = false

    override fun getScopeName(): String = identifier

    override fun getDeclaringElement(): PsiElement = this

    override fun getRangeInDeclaringElement(): TextRange = node.firstChildNode.psi.textRangeInParent

    override fun getSymbol(): Symbol = Cpp2PsiUtil.getSymbol(this)

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }
}