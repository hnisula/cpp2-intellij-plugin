package org.hnisula.cpp2plugin

import com.intellij.lang.Commenter

// TODO: Implement SelfManagingCommenter instead for better removal of block comments
class Cpp2Commenter : Commenter {
    override fun getLineCommentPrefix(): String = "//"

    override fun getBlockCommentPrefix(): String = "/*"

    override fun getBlockCommentSuffix(): String = "*/"

    override fun getCommentedBlockCommentPrefix(): String? = null

    override fun getCommentedBlockCommentSuffix(): String? = null
}