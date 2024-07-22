// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.hannesnisula.cpp2plugin.psi.impl.*;

public interface Cpp2Types {

  IElementType ANY_IDENTIFIER = new Cpp2ElementType("ANY_IDENTIFIER");
  IElementType EXPRESSION = new Cpp2ElementType("EXPRESSION");
  IElementType FUNCTION_DEFINITION = new Cpp2ElementType("FUNCTION_DEFINITION");
  IElementType IDENTIFIER = new Cpp2ElementType("IDENTIFIER");
  IElementType PARAMETER_DECLARATION = new Cpp2ElementType("PARAMETER_DECLARATION");
  IElementType RETURN_EXPRESSION = new Cpp2ElementType("RETURN_EXPRESSION");
  IElementType SCOPE = new Cpp2ElementType("SCOPE");
  IElementType SCOPED_IDENTIFIER = new Cpp2ElementType("SCOPED_IDENTIFIER");
  IElementType STATEMENT = new Cpp2ElementType("STATEMENT");
  IElementType STATEMENT_BLOCK = new Cpp2ElementType("STATEMENT_BLOCK");
  IElementType TEMPLATE_DECLARATION = new Cpp2ElementType("TEMPLATE_DECLARATION");
  IElementType TEMPLATE_DEFINITION = new Cpp2ElementType("TEMPLATE_DEFINITION");
  IElementType TEMPLATE_PARAM_DECLARATION = new Cpp2ElementType("TEMPLATE_PARAM_DECLARATION");
  IElementType TYPE_IDENTIFIER = new Cpp2ElementType("TYPE_IDENTIFIER");
  IElementType TYPE_SPECIFIER = new Cpp2ElementType("TYPE_SPECIFIER");
  IElementType VAR_DECLARATION = new Cpp2ElementType("VAR_DECLARATION");
  IElementType VAR_DEFINITION = new Cpp2ElementType("VAR_DEFINITION");

  IElementType ARROW = new Cpp2TokenType("->");
  IElementType ASTERISK = new Cpp2TokenType("*");
  IElementType COLON = new Cpp2TokenType(":");
  IElementType COLONCOLON = new Cpp2TokenType("::");
  IElementType COMMENT = new Cpp2TokenType("COMMENT");
  IElementType CONST = new Cpp2TokenType("const");
  IElementType COPY = new Cpp2TokenType("copy");
  IElementType DOTDOTDOT = new Cpp2TokenType("...");
  IElementType EQ = new Cpp2TokenType("=");
  IElementType FORWARD = new Cpp2TokenType("forward");
  IElementType GT = new Cpp2TokenType(">");
  IElementType IDENTIFIER_WORD = new Cpp2TokenType("IDENTIFIER_WORD");
  IElementType IN = new Cpp2TokenType("in");
  IElementType INOUT = new Cpp2TokenType("inout");
  IElementType LEFT_BRACE = new Cpp2TokenType("{");
  IElementType LEFT_PARENTHESIS = new Cpp2TokenType("(");
  IElementType LT = new Cpp2TokenType("<");
  IElementType MOVE = new Cpp2TokenType("move");
  IElementType NUMBER_LITERAL = new Cpp2TokenType("NUMBER_LITERAL");
  IElementType OUT = new Cpp2TokenType("out");
  IElementType RETURN = new Cpp2TokenType("RETURN");
  IElementType RIGHT_BRACE = new Cpp2TokenType("}");
  IElementType RIGHT_PARENTHESIS = new Cpp2TokenType(")");
  IElementType SEMICOLON = new Cpp2TokenType(";");
  IElementType STRING_LITERAL = new Cpp2TokenType("STRING_LITERAL");
  IElementType UNDERSCORE = new Cpp2TokenType("_");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANY_IDENTIFIER) {
        return new Cpp2AnyIdentifierImpl(node);
      }
      else if (type == EXPRESSION) {
        return new Cpp2ExpressionImpl(node);
      }
      else if (type == FUNCTION_DEFINITION) {
        return new Cpp2FunctionDefinitionImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new Cpp2IdentifierImpl(node);
      }
      else if (type == PARAMETER_DECLARATION) {
        return new Cpp2ParameterDeclarationImpl(node);
      }
      else if (type == RETURN_EXPRESSION) {
        return new Cpp2ReturnExpressionImpl(node);
      }
      else if (type == SCOPE) {
        return new Cpp2ScopeImpl(node);
      }
      else if (type == SCOPED_IDENTIFIER) {
        return new Cpp2ScopedIdentifierImpl(node);
      }
      else if (type == STATEMENT) {
        return new Cpp2StatementImpl(node);
      }
      else if (type == STATEMENT_BLOCK) {
        return new Cpp2StatementBlockImpl(node);
      }
      else if (type == TEMPLATE_DECLARATION) {
        return new Cpp2TemplateDeclarationImpl(node);
      }
      else if (type == TEMPLATE_DEFINITION) {
        return new Cpp2TemplateDefinitionImpl(node);
      }
      else if (type == TEMPLATE_PARAM_DECLARATION) {
        return new Cpp2TemplateParamDeclarationImpl(node);
      }
      else if (type == TYPE_IDENTIFIER) {
        return new Cpp2TypeIdentifierImpl(node);
      }
      else if (type == TYPE_SPECIFIER) {
        return new Cpp2TypeSpecifierImpl(node);
      }
      else if (type == VAR_DECLARATION) {
        return new Cpp2VarDeclarationImpl(node);
      }
      else if (type == VAR_DEFINITION) {
        return new Cpp2VarDefinitionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
