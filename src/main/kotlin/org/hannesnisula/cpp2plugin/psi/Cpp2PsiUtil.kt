package org.hannesnisula.cpp2plugin.psi

class Cpp2PsiUtil {
    fun getIdentifier(element: Cpp2Decl): String? {
        val identifierNode = element.node.findChildByType(Cpp2Types.IDENTIFIER_WORD)
        return identifierNode?.text
    }
}