package org.hnisula.cpp2plugin.psi

import com.intellij.lang.tree.util.children
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import org.hnisula.cpp2plugin.Cpp2FileType

class Cpp2ElementFactory {
    companion object {
        @JvmStatic
        fun createExpression(project: Project, code: String): PsiElement {
            val dummyFile = PsiFileFactory.getInstance(project)
                .createFileFromText("dummy.cpp2", Cpp2FileType, wrapExprCode(code)) as Cpp2File
            return extractExpr(dummyFile)
        }

        @JvmStatic
        private fun wrapExprCode(code: String): String {
            return EXPR_WRAPPER_FILE_START + code + EXPR_WRAPPER_FILE_END
        }

        @JvmStatic
        private fun extractExpr(file: Cpp2File): Cpp2Expr {
            return file.node.firstChildNode.firstChildNode.firstChildNode.children()
                .toList()[4].firstChildNode.psi.nextSibling.firstChild.nextSibling.nextSibling as Cpp2Expr
        }

        private const val EXPR_WRAPPER_FILE_START = "main:()={x="
        private const val EXPR_WRAPPER_FILE_END = ";}"
    }
}