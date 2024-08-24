package org.hnisula.cpp2plugin

//class Cpp2Util {
//    companion object {
//        @JvmStatic
//        fun findDecls(project: Project, key: String): List<Cpp2Decl> {
//            val decls = ArrayList<Cpp2Decl>()
//            val virtualFiles = FileTypeIndex.getFiles(Cpp2FileType, GlobalSearchScope.allScope(project))
//
//            for (virtualFile in virtualFiles) {
//                val cpp2File = PsiManager.getInstance(project).findFile(virtualFile) ?: continue
//                val cpp2Decls = PsiTreeUtil.findChildrenOfType(cpp2File, Cpp2Decl::class.java)
//
//                for (decl in cpp2Decls) {
//                    if (decl.nameIdentifier?.text == key) // TODO: Fix here?
//                        decls.add(decl)
//                }
//            }
//
//            return decls
//            return emptyList()
//        }
//    }
//}