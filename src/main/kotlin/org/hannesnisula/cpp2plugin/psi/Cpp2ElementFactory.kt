package org.hannesnisula.cpp2plugin.psi

import com.intellij.lang.ASTNode
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import org.hannesnisula.cpp2plugin.Cpp2FileType

class Cpp2ElementFactory {
    companion object {
        @JvmStatic
        fun createIdentifier(project: Project, name: String): ASTNode {
            val dummyFile = PsiFileFactory.getInstance(project).createFileFromText("dummy.cpp2", Cpp2FileType, name)
            return dummyFile.firstChild.node
        }
    }
}