// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.hannesnisula.cpp2plugin.psi.impl.*;

public interface Cpp2Types {

  IElementType ADD_EXPR = new Cpp2ElementType("ADD_EXPR");
  IElementType AND_EXPR = new Cpp2ElementType("AND_EXPR");
  IElementType ARG = new Cpp2ElementType("ARG");
  IElementType ASSIGN = new Cpp2ElementType("ASSIGN");
  IElementType BIT_AND_EXPR = new Cpp2ElementType("BIT_AND_EXPR");
  IElementType BIT_OR_EXPR = new Cpp2ElementType("BIT_OR_EXPR");
  IElementType BIT_XOR_EXPR = new Cpp2ElementType("BIT_XOR_EXPR");
  IElementType DECL = new Cpp2ElementType("DECL");
  IElementType DIV_EXPR = new Cpp2ElementType("DIV_EXPR");
  IElementType EQ_EXPR = new Cpp2ElementType("EQ_EXPR");
  IElementType EXPR = new Cpp2ElementType("EXPR");
  IElementType FOR_LOOP = new Cpp2ElementType("FOR_LOOP");
  IElementType FUNC_CALL = new Cpp2ElementType("FUNC_CALL");
  IElementType FUNC_DECL = new Cpp2ElementType("FUNC_DECL");
  IElementType FUNC_EXPR = new Cpp2ElementType("FUNC_EXPR");
  IElementType FUNC_PARAMS = new Cpp2ElementType("FUNC_PARAMS");
  IElementType FUNC_SIGNATURE = new Cpp2ElementType("FUNC_SIGNATURE");
  IElementType GTEQ_EXPR = new Cpp2ElementType("GTEQ_EXPR");
  IElementType GT_EXPR = new Cpp2ElementType("GT_EXPR");
  IElementType ID_SCOPED = new Cpp2ElementType("ID_SCOPED");
  IElementType LEFT_SHIFT_EXPR = new Cpp2ElementType("LEFT_SHIFT_EXPR");
  IElementType LITERAL = new Cpp2ElementType("LITERAL");
  IElementType LTEQ_EXPR = new Cpp2ElementType("LTEQ_EXPR");
  IElementType LT_EXPR = new Cpp2ElementType("LT_EXPR");
  IElementType MOD_EXPR = new Cpp2ElementType("MOD_EXPR");
  IElementType MUL_EXPR = new Cpp2ElementType("MUL_EXPR");
  IElementType NAMED_DECL = new Cpp2ElementType("NAMED_DECL");
  IElementType NEQ_EXPR = new Cpp2ElementType("NEQ_EXPR");
  IElementType OR_EXPR = new Cpp2ElementType("OR_EXPR");
  IElementType PARAM_DECL = new Cpp2ElementType("PARAM_DECL");
  IElementType PARAM_KIND = new Cpp2ElementType("PARAM_KIND");
  IElementType RETURN_EXPR = new Cpp2ElementType("RETURN_EXPR");
  IElementType RIGHT_SHIFT_EXPR = new Cpp2ElementType("RIGHT_SHIFT_EXPR");
  IElementType SCOPE = new Cpp2ElementType("SCOPE");
  IElementType STMT = new Cpp2ElementType("STMT");
  IElementType STMT_BLOCK = new Cpp2ElementType("STMT_BLOCK");
  IElementType SUBSCRIPT_EXPR = new Cpp2ElementType("SUBSCRIPT_EXPR");
  IElementType SUB_EXPR = new Cpp2ElementType("SUB_EXPR");
  IElementType TEMPLATE_DECL = new Cpp2ElementType("TEMPLATE_DECL");
  IElementType TEMPLATE_DEF = new Cpp2ElementType("TEMPLATE_DEF");
  IElementType TEMPLATE_PARAM_DECL = new Cpp2ElementType("TEMPLATE_PARAM_DECL");
  IElementType TYPE_ID = new Cpp2ElementType("TYPE_ID");
  IElementType TYPE_ID_SCOPED = new Cpp2ElementType("TYPE_ID_SCOPED");
  IElementType TYPE_SPECIFIER = new Cpp2ElementType("TYPE_SPECIFIER");
  IElementType VAR_DECL = new Cpp2ElementType("VAR_DECL");

  IElementType AND = new Cpp2TokenType("&");
  IElementType ANDAND = new Cpp2TokenType("&&");
  IElementType ARROW = new Cpp2TokenType("->");
  IElementType ASTERISK = new Cpp2TokenType("*");
  IElementType COLON = new Cpp2TokenType(":");
  IElementType COLONCOLON = new Cpp2TokenType("::");
  IElementType COMMENT = new Cpp2TokenType("COMMENT");
  IElementType CONST = new Cpp2TokenType("const");
  IElementType COPY = new Cpp2TokenType("copy");
  IElementType DO = new Cpp2TokenType("do");
  IElementType DOTDOTDOT = new Cpp2TokenType("...");
  IElementType EQ = new Cpp2TokenType("=");
  IElementType EQEQ = new Cpp2TokenType("==");
  IElementType EXP = new Cpp2TokenType("^");
  IElementType FOR = new Cpp2TokenType("for");
  IElementType FORWARD = new Cpp2TokenType("forward");
  IElementType GT = new Cpp2TokenType(">");
  IElementType GTEQ = new Cpp2TokenType(">=");
  IElementType GTGT = new Cpp2TokenType(">>");
  IElementType IDENTIFIER_WORD = new Cpp2TokenType("IDENTIFIER_WORD");
  IElementType IN = new Cpp2TokenType("in");
  IElementType INOUT = new Cpp2TokenType("inout");
  IElementType LEFT_BRACE = new Cpp2TokenType("{");
  IElementType LEFT_PARENTHESIS = new Cpp2TokenType("(");
  IElementType LT = new Cpp2TokenType("<");
  IElementType LTEQ = new Cpp2TokenType("<=");
  IElementType LTLT = new Cpp2TokenType("<<");
  IElementType MINUS = new Cpp2TokenType("-");
  IElementType MINUSMINUS = new Cpp2TokenType("--");
  IElementType MODULO = new Cpp2TokenType("%");
  IElementType MOVE = new Cpp2TokenType("move");
  IElementType NEQ = new Cpp2TokenType("!=");
  IElementType NUMBER_LITERAL = new Cpp2TokenType("NUMBER_LITERAL");
  IElementType OR = new Cpp2TokenType("|");
  IElementType OROR = new Cpp2TokenType("||");
  IElementType OUT = new Cpp2TokenType("out");
  IElementType PLUS = new Cpp2TokenType("+");
  IElementType PLUSPLUS = new Cpp2TokenType("++");
  IElementType RETURN = new Cpp2TokenType("return");
  IElementType RIGHT_BRACE = new Cpp2TokenType("}");
  IElementType RIGHT_PARENTHESIS = new Cpp2TokenType(")");
  IElementType SEMICOLON = new Cpp2TokenType(";");
  IElementType SLASH = new Cpp2TokenType("/");
  IElementType STRING_LITERAL = new Cpp2TokenType("STRING_LITERAL");
  IElementType UNDERSCORE = new Cpp2TokenType("_");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD_EXPR) {
        return new Cpp2AddExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new Cpp2AndExprImpl(node);
      }
      else if (type == ARG) {
        return new Cpp2ArgImpl(node);
      }
      else if (type == ASSIGN) {
        return new Cpp2AssignImpl(node);
      }
      else if (type == BIT_AND_EXPR) {
        return new Cpp2BitAndExprImpl(node);
      }
      else if (type == BIT_OR_EXPR) {
        return new Cpp2BitOrExprImpl(node);
      }
      else if (type == BIT_XOR_EXPR) {
        return new Cpp2BitXorExprImpl(node);
      }
      else if (type == DECL) {
        return new Cpp2DeclImpl(node);
      }
      else if (type == DIV_EXPR) {
        return new Cpp2DivExprImpl(node);
      }
      else if (type == EQ_EXPR) {
        return new Cpp2EqExprImpl(node);
      }
      else if (type == FOR_LOOP) {
        return new Cpp2ForLoopImpl(node);
      }
      else if (type == FUNC_CALL) {
        return new Cpp2FuncCallImpl(node);
      }
      else if (type == FUNC_DECL) {
        return new Cpp2FuncDeclImpl(node);
      }
      else if (type == FUNC_EXPR) {
        return new Cpp2FuncExprImpl(node);
      }
      else if (type == FUNC_PARAMS) {
        return new Cpp2FuncParamsImpl(node);
      }
      else if (type == FUNC_SIGNATURE) {
        return new Cpp2FuncSignatureImpl(node);
      }
      else if (type == GTEQ_EXPR) {
        return new Cpp2GteqExprImpl(node);
      }
      else if (type == GT_EXPR) {
        return new Cpp2GtExprImpl(node);
      }
      else if (type == ID_SCOPED) {
        return new Cpp2IdScopedImpl(node);
      }
      else if (type == LEFT_SHIFT_EXPR) {
        return new Cpp2LeftShiftExprImpl(node);
      }
      else if (type == LITERAL) {
        return new Cpp2LiteralImpl(node);
      }
      else if (type == LTEQ_EXPR) {
        return new Cpp2LteqExprImpl(node);
      }
      else if (type == LT_EXPR) {
        return new Cpp2LtExprImpl(node);
      }
      else if (type == MOD_EXPR) {
        return new Cpp2ModExprImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new Cpp2MulExprImpl(node);
      }
      else if (type == NAMED_DECL) {
        return new Cpp2NamedDeclImpl(node);
      }
      else if (type == NEQ_EXPR) {
        return new Cpp2NeqExprImpl(node);
      }
      else if (type == OR_EXPR) {
        return new Cpp2OrExprImpl(node);
      }
      else if (type == PARAM_DECL) {
        return new Cpp2ParamDeclImpl(node);
      }
      else if (type == PARAM_KIND) {
        return new Cpp2ParamKindImpl(node);
      }
      else if (type == RETURN_EXPR) {
        return new Cpp2ReturnExprImpl(node);
      }
      else if (type == RIGHT_SHIFT_EXPR) {
        return new Cpp2RightShiftExprImpl(node);
      }
      else if (type == SCOPE) {
        return new Cpp2ScopeImpl(node);
      }
      else if (type == STMT) {
        return new Cpp2StmtImpl(node);
      }
      else if (type == STMT_BLOCK) {
        return new Cpp2StmtBlockImpl(node);
      }
      else if (type == SUBSCRIPT_EXPR) {
        return new Cpp2SubscriptExprImpl(node);
      }
      else if (type == SUB_EXPR) {
        return new Cpp2SubExprImpl(node);
      }
      else if (type == TEMPLATE_DECL) {
        return new Cpp2TemplateDeclImpl(node);
      }
      else if (type == TEMPLATE_DEF) {
        return new Cpp2TemplateDefImpl(node);
      }
      else if (type == TEMPLATE_PARAM_DECL) {
        return new Cpp2TemplateParamDeclImpl(node);
      }
      else if (type == TYPE_ID) {
        return new Cpp2TypeIdImpl(node);
      }
      else if (type == TYPE_ID_SCOPED) {
        return new Cpp2TypeIdScopedImpl(node);
      }
      else if (type == TYPE_SPECIFIER) {
        return new Cpp2TypeSpecifierImpl(node);
      }
      else if (type == VAR_DECL) {
        return new Cpp2VarDeclImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
