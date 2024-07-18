// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.hannesnisula.cpp2plugin.psi.impl.*;

public interface Cpp2Types {

  IElementType ASSIGNMENT = new Cpp2ElementType("ASSIGNMENT");
  IElementType EXPRESSION = new Cpp2ElementType("EXPRESSION");
  IElementType STATEMENT = new Cpp2ElementType("STATEMENT");

  IElementType COLON = new Cpp2TokenType(":");
  IElementType COMMENT = new Cpp2TokenType("COMMENT");
  IElementType EQ = new Cpp2TokenType("=");
  IElementType IDENTIFIER = new Cpp2TokenType("IDENTIFIER");
  IElementType LEFT_BRACE = new Cpp2TokenType("{");
  IElementType NUMBER_LITERAL = new Cpp2TokenType("NUMBER_LITERAL");
  IElementType RIGHT_BRACE = new Cpp2TokenType("}");
  IElementType SEMICOLON = new Cpp2TokenType(";");
  IElementType STRING_LITERAL = new Cpp2TokenType("STRING_LITERAL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGNMENT) {
        return new Cpp2AssignmentImpl(node);
      }
      else if (type == EXPRESSION) {
        return new Cpp2ExpressionImpl(node);
      }
      else if (type == STATEMENT) {
        return new Cpp2StatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
