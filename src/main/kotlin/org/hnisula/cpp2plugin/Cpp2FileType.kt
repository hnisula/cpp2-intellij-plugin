package org.hnisula.cpp2plugin

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object Cpp2FileType : LanguageFileType(Cpp2Language) {
    override fun getName(): String = "Cpp2 File"
    override fun getDescription(): String = "Cpp2 language file"
    override fun getDefaultExtension(): String = "cpp2"
    override fun getIcon(): Icon = Cpp2Icons.FILE
}