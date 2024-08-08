package org.hannesnisula.cpp2plugin.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import com.intellij.psi.util.PsiTreeUtil
import org.hannesnisula.cpp2plugin.psi.impl.Cpp2FuncDeclImpl
import org.hannesnisula.cpp2plugin.psi.impl.Cpp2NamespaceDeclImpl
import org.hannesnisula.cpp2plugin.psi.impl.Cpp2TypeDeclImpl

class Cpp2PsiUtil {
    companion object {
        // Cpp2Decl
        @JvmStatic
        fun getIdentifierString(element: Cpp2Decl): String? {
            return getNameIdentifier(element)?.text
        }

        @JvmStatic
        fun getNameIdentifier(element: Cpp2Decl): PsiElement? {
            return element.node.findChildByType(Cpp2Types.IDENTIFIER_WORD)?.psi
        }

        @JvmStatic
        fun setName(element: Cpp2Decl, newName: String): PsiElement {
            val identifierNode = element.node.findChildByType(Cpp2Types.IDENTIFIER_WORD)

            identifierNode?.replaceChild(identifierNode, Cpp2ElementFactory.createIdentifier(element.project, newName))

            return element
        }

        // Cpp2Lvalue
        @JvmStatic
        fun getIdentifierString(element: Cpp2Lvalue): String? {
            return getNameIdentifier(element)?.text
        }

        @JvmStatic
        fun getNameIdentifier(element: Cpp2Lvalue): PsiElement? {
            return element.node.findChildByType(Cpp2Types.IDENTIFIER_WORD)?.psi
        }

        @JvmStatic
        fun getReferences(element: Cpp2Lvalue): Array<PsiReference> {
            val textRange = TextRange(0, element.textLength - 1)
            return arrayOf(Cpp2Reference(element.originalElement, textRange))
        }

        @JvmStatic
        fun getContext(element: PsiElement): PsiElement? {
            val parentScopeTypes = arrayOf(
                Cpp2NamespaceDeclImpl::class.java,
                Cpp2TypeDeclImpl::class.java,
                Cpp2FuncDeclImpl::class.java,
                Cpp2File::class.java
            )
            return PsiTreeUtil.getParentOfType(element, *parentScopeTypes)
        }
    }
}