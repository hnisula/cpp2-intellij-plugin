package org.hnisula.cpp2plugin

import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.lang.tree.util.children
import com.intellij.openapi.util.TextRange
import com.intellij.psi.TokenType
import org.hnisula.cpp2plugin.psi.Cpp2File
import org.hnisula.cpp2plugin.psi.Cpp2Types

class Cpp2Block(
    private val myNode: ASTNode, private val myParent: Cpp2Block?, private val myIndent: Indent
) : ASTBlock {
    override fun getTextRange(): TextRange = myNode.textRange

    override fun getSubBlocks(): MutableList<Block> {
        if (myNode.psi is Cpp2File) {
            // Skip file wrapper element and create block of its root_stmts
            if (myNode.firstChildNode?.firstChildNode != null) {
                // Does this really work?
                return getRootStmtsBlocks(myNode.firstChildNode.firstChildNode)
            }
        } else if (myNode.elementType == Cpp2Types.FUNC_DECL) {
            return getFuncDeclSubBlocks(myNode)
        } else if (myNode.elementType == Cpp2Types.STMT_BLOCK) {
            return getStmtBlockSubBlocks(myNode)
        }

        return mutableListOf()
    }

    override fun getWrap(): Wrap? = null

    override fun getIndent(): Indent = myIndent

    override fun getAlignment(): Alignment? = null

    override fun getSpacing(child1: Block?, child2: Block): Spacing? = null

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        if (myNode.elementType == Cpp2Types.STMT_BLOCK) {
            return ChildAttributes(Indent.getNormalIndent(), null)
        }
        
        return ChildAttributes(Indent.getNoneIndent(), null)
    }

    override fun isIncomplete(): Boolean = false

    override fun isLeaf(): Boolean = myNode?.firstChildNode == null

    override fun getNode(): ASTNode? = myNode

    private fun isWhitespaceOrEmpty(node: ASTNode): Boolean {
        return node.elementType == TokenType.WHITE_SPACE || node.text.isEmpty()
    }

    private fun getRootStmtsBlocks(node: ASTNode): MutableList<Block> {
        val childBlocks = mutableListOf<Block>()

        for (child in node.children()) {
            if (isWhitespaceOrEmpty(child)) {
                continue
            }
            childBlocks.add(Cpp2Block(child, this, Indent.getNoneIndent()))
        }
        return childBlocks
    }


    private fun getStmtBlockSubBlocks(node: ASTNode): MutableList<Block> {
        val subBlocks = mutableListOf<Block>()
        var childNodeIt = node.firstChildNode

        subBlocks.add(Cpp2Block(childNodeIt, this, Indent.getNoneIndent()))
        childNodeIt = nextNonWhitespace(childNodeIt)
        
        while (childNodeIt != null) {
            if (isWhitespaceOrEmpty(childNodeIt) || childNodeIt.elementType == Cpp2Types.LEFT_BRACE || childNodeIt.elementType == Cpp2Types.RIGHT_BRACE) {
                childNodeIt = nextNonWhitespace(childNodeIt)
                continue
            }
            subBlocks.add(Cpp2Block(childNodeIt, this, Indent.getNormalIndent()))
            childNodeIt = nextNonWhitespace(childNodeIt)
        }
        
        if (node.lastChildNode.elementType == Cpp2Types.RIGHT_BRACE) {
            subBlocks.add(Cpp2Block(node.lastChildNode, this, Indent.getNoneIndent()))
        }
        
        return subBlocks
    }

    private fun getFuncDeclSubBlocks(node: ASTNode): MutableList<Block> {
        val subBlocks = mutableListOf<Block>()
        var childNodeIt = node.firstChildNode

        // TODO: Reconsider not just using a loop instead. Unless, some specific settings apply to these differently

        // Identifier
        subBlocks.add(Cpp2Block(childNodeIt, this, Indent.getNoneIndent()))
        childNodeIt = nextNonWhitespace(childNodeIt)

        // :
        subBlocks.add(Cpp2Block(childNodeIt, this, Indent.getNoneIndent()))
        childNodeIt = nextNonWhitespace(childNodeIt)

        // Template decl?
        if (childNodeIt.elementType == Cpp2Types.TEMPLATE_DECL) {
            subBlocks.add(Cpp2Block(childNodeIt, this, Indent.getNoneIndent()))
            childNodeIt = nextNonWhitespace(childNodeIt)
        }

        // Param list
        subBlocks.add(Cpp2Block(childNodeIt, this, Indent.getNoneIndent()))
        childNodeIt = nextNonWhitespace(childNodeIt)

        // Return type?
        if (childNodeIt.elementType == Cpp2Types.RETURN_TYPE) {
            subBlocks.add(Cpp2Block(childNodeIt, this, Indent.getNoneIndent()))
            childNodeIt = nextNonWhitespace(childNodeIt)
        }

        // =
        subBlocks.add(Cpp2Block(childNodeIt, this, Indent.getNoneIndent()))
        childNodeIt = nextNonWhitespace(childNodeIt)

        // Statement block?
        if (childNodeIt.elementType == Cpp2Types.STMT_BLOCK) {
            subBlocks.add(Cpp2Block(childNodeIt, this, Indent.getNoneIndent()))
        } else if (childNodeIt.elementType == Cpp2Types.EXPR) {
            subBlocks.add(Cpp2Block(childNodeIt, this, Indent.getNoneIndent()))
        }

        return subBlocks
    }
    
    private fun nextNonWhitespace(node: ASTNode): ASTNode? {
        var nextNode = node.treeNext
        while (nextNode != null && isWhitespaceOrEmpty(nextNode)) {
            nextNode = nextNode.treeNext
        }
        return nextNode
    }
}