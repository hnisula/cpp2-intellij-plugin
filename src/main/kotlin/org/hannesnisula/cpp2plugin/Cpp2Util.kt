package org.hannesnisula.cpp2plugin

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import org.hannesnisula.cpp2plugin.psi.Cpp2Decl

class Cpp2Util {
    companion object {
        @JvmStatic
        fun findDecls(project: Project, key: String): List<Cpp2Decl> {
            val decls = ArrayList<Cpp2Decl>()
            val virtualFiles = FileTypeIndex.getFiles(Cpp2FileType, GlobalSearchScope.allScope(project))

            for (virtualFile in virtualFiles) {
                val cpp2File = PsiManager.getInstance(project).findFile(virtualFile) ?: continue
                val cpp2Decls = PsiTreeUtil.findChildrenOfType(cpp2File, Cpp2Decl::class.java)

                for (decl in cpp2Decls) {
                    if (decl.nameIdentifier?.text == key) // TODO: Fix here?
                        decls.add(decl)
                }
            }

            return decls
        }
    }
}