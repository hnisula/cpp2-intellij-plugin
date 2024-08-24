package org.hnisula.cpp2plugin.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.hnisula.cpp2plugin.Cpp2FileType
import org.hnisula.cpp2plugin.Cpp2Language
import org.jetbrains.annotations.NotNull

class Cpp2File(@NotNull viewProvider: FileViewProvider) : PsiFileBase(viewProvider, Cpp2Language) {
    override fun getFileType(): FileType = Cpp2FileType
    
    override fun toString(): String = "Cpp2 File"
}