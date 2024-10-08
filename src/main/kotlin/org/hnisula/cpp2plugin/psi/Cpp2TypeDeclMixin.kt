package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.Cpp2NamedDeclaration
import org.hnisula.cpp2plugin.Cpp2Scope

open class Cpp2TypeDeclMixin(node: ASTNode) : ASTWrapperPsiElement(node), Cpp2NamedDeclaration, Cpp2Scope {
    override val identifier: String
        get() = name!!

    override fun getName(): String? = node.firstChildNode.text

    override fun getDeclaringElement(): PsiElement {
        return this
    }

    override fun getRangeInDeclaringElement(): TextRange {
        return node.firstChildNode.psi.textRangeInParent
    }

    override fun getSymbol(): Symbol = Cpp2PsiUtil.getSymbol(this)

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getOwnDeclarations(): Collection<PsiSymbolDeclaration> {
        val blockStart = node.findChildByType(Cpp2Types.LEFT_BRACE)
        
        if (blockStart == null) {
            throw IllegalStateException("Type declaration must have a block")
        }
        
        var memberDeclIt = blockStart.treeNext
        val memberDecls = mutableListOf<PsiSymbolDeclaration>()
        
        while (memberDeclIt.elementType != Cpp2Types.RIGHT_BRACE) {
            if (memberDeclIt.elementType == Cpp2Types.MEMBER_DECL) {
                var memberDeclNode = memberDeclIt.firstChildNode

                if (memberDeclNode.elementType == Cpp2Types.MEMBER_ACCESS) {
                    memberDeclNode = memberDeclNode.treeNext
                }

                if (memberDeclNode.elementType != Cpp2Types.COMMENT && memberDeclNode.psi is Cpp2NamedDeclaration) {
                    memberDecls.add(memberDeclNode.psi as PsiSymbolDeclaration)
                }
            }
            
            memberDeclIt = memberDeclIt.treeNext
        }
        
        return memberDecls
    }

    override val isAnonymous: Boolean
        get() = false
    override val isGlobal: Boolean
        get() = false

    override fun getScopeName(): String {
        return name!!
    }
}
