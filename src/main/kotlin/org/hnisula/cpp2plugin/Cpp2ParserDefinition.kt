package org.hnisula.cpp2plugin

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.hnisula.cpp2plugin.parser.Cpp2Parser
import org.hnisula.cpp2plugin.psi.Cpp2File
import org.hnisula.cpp2plugin.psi.Cpp2TokenSets
import org.hnisula.cpp2plugin.psi.Cpp2Types

class Cpp2ParserDefinition : ParserDefinition {
    companion object {
        @JvmField val FILE: IFileElementType = IFileElementType(Cpp2Language)
    }
    
    override fun createLexer(project: Project?): Lexer = Cpp2LexerAdapter()

    override fun createParser(project: Project?): PsiParser = Cpp2Parser()

    override fun getFileNodeType(): IFileElementType = FILE

//    override fun getCommentTokens(): TokenSet = Cpp2TokenSets.COMMENTS
    override fun getCommentTokens(): TokenSet = TokenSet.create()
    
    override fun getStringLiteralElements(): TokenSet = Cpp2TokenSets.IDENTIFIERS

    override fun createElement(node: ASTNode?): PsiElement = Cpp2Types.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = Cpp2File(viewProvider)
}