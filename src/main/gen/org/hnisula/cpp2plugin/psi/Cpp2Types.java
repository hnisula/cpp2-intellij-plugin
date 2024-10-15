// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.hnisula.cpp2plugin.psi.impl.*;

public interface Cpp2Types {

  IElementType ADD_EXPR = new Cpp2ElementType("ADD_EXPR");
  IElementType AND_EXPR = new Cpp2ElementType("AND_EXPR");
  IElementType ARG = new Cpp2ElementType("ARG");
  IElementType ASSIGN = new Cpp2ElementType("ASSIGN");
  IElementType BIT_AND_EXPR = new Cpp2ElementType("BIT_AND_EXPR");
  IElementType BIT_OR_EXPR = new Cpp2ElementType("BIT_OR_EXPR");
  IElementType BIT_XOR_EXPR = new Cpp2ElementType("BIT_XOR_EXPR");
  IElementType COMMENT = new Cpp2ElementType("COMMENT");
  IElementType DEREF_EXPR = new Cpp2ElementType("DEREF_EXPR");
  IElementType DIV_EXPR = new Cpp2ElementType("DIV_EXPR");
  IElementType DO_WHILE_LOOP = new Cpp2ElementType("DO_WHILE_LOOP");
  IElementType EQ_EXPR = new Cpp2ElementType("EQ_EXPR");
  IElementType EXPR = new Cpp2ElementType("EXPR");
  IElementType FILE_WRAPPER = new Cpp2ElementType("FILE_WRAPPER");
  IElementType FOR_LOOP = new Cpp2ElementType("FOR_LOOP");
  IElementType FUNC_ALIAS_DECL = new Cpp2ElementType("FUNC_ALIAS_DECL");
  IElementType FUNC_CALL = new Cpp2ElementType("FUNC_CALL");
  IElementType FUNC_DECL = new Cpp2ElementType("FUNC_DECL");
  IElementType GTEQ_EXPR = new Cpp2ElementType("GTEQ_EXPR");
  IElementType GT_EXPR = new Cpp2ElementType("GT_EXPR");
  IElementType IDENTIFIER = new Cpp2ElementType("IDENTIFIER");
  IElementType IF_BRANCH = new Cpp2ElementType("IF_BRANCH");
  IElementType LEFT_SHIFT_EXPR = new Cpp2ElementType("LEFT_SHIFT_EXPR");
  IElementType LIST_EXPR = new Cpp2ElementType("LIST_EXPR");
  IElementType LITERAL = new Cpp2ElementType("LITERAL");
  IElementType LTEQ_EXPR = new Cpp2ElementType("LTEQ_EXPR");
  IElementType LT_EXPR = new Cpp2ElementType("LT_EXPR");
  IElementType MEMBER_ACCESS = new Cpp2ElementType("MEMBER_ACCESS");
  IElementType MEMBER_DECL = new Cpp2ElementType("MEMBER_DECL");
  IElementType MOD_EXPR = new Cpp2ElementType("MOD_EXPR");
  IElementType MUL_EXPR = new Cpp2ElementType("MUL_EXPR");
  IElementType NAMESPACE_ALIAS_DECL = new Cpp2ElementType("NAMESPACE_ALIAS_DECL");
  IElementType NAMESPACE_DECL = new Cpp2ElementType("NAMESPACE_DECL");
  IElementType NEQ_EXPR = new Cpp2ElementType("NEQ_EXPR");
  IElementType NEXT_STMT = new Cpp2ElementType("NEXT_STMT");
  IElementType OBJ_ALIAS_DECL = new Cpp2ElementType("OBJ_ALIAS_DECL");
  IElementType OR_EXPR = new Cpp2ElementType("OR_EXPR");
  IElementType PARAM = new Cpp2ElementType("PARAM");
  IElementType PARAM_LIST = new Cpp2ElementType("PARAM_LIST");
  IElementType PAREN_EXPR = new Cpp2ElementType("PAREN_EXPR");
  IElementType Q_IDENTIFIER = new Cpp2ElementType("Q_IDENTIFIER");
  IElementType RETURN_STMT = new Cpp2ElementType("RETURN_STMT");
  IElementType RETURN_TYPE = new Cpp2ElementType("RETURN_TYPE");
  IElementType RIGHT_SHIFT_EXPR = new Cpp2ElementType("RIGHT_SHIFT_EXPR");
  IElementType ROOT_STMTS = new Cpp2ElementType("ROOT_STMTS");
  IElementType ROOT_STMT_BLOCK = new Cpp2ElementType("ROOT_STMT_BLOCK");
  IElementType STMT_BLOCK = new Cpp2ElementType("STMT_BLOCK");
  IElementType SUBSCRIPT_EXPR = new Cpp2ElementType("SUBSCRIPT_EXPR");
  IElementType SUB_EXPR = new Cpp2ElementType("SUB_EXPR");
  IElementType TEMPLATE = new Cpp2ElementType("TEMPLATE");
  IElementType TEMPLATE_DECL = new Cpp2ElementType("TEMPLATE_DECL");
  IElementType THIS_PARAM = new Cpp2ElementType("THIS_PARAM");
  IElementType TYPE_ALIAS_DECL = new Cpp2ElementType("TYPE_ALIAS_DECL");
  IElementType TYPE_DECL = new Cpp2ElementType("TYPE_DECL");
  IElementType TYPE_SPECIFIER = new Cpp2ElementType("TYPE_SPECIFIER");
  IElementType USING_NAMESPACE = new Cpp2ElementType("USING_NAMESPACE");
  IElementType VALUE_DECL = new Cpp2ElementType("VALUE_DECL");
  IElementType VARIADIC_PARAM = new Cpp2ElementType("VARIADIC_PARAM");
  IElementType WHILE_LOOP = new Cpp2ElementType("WHILE_LOOP");

  IElementType AND = new Cpp2TokenType("&");
  IElementType ANDAND = new Cpp2TokenType("&&");
  IElementType ARROW = new Cpp2TokenType("->");
  IElementType BLOCK_COMMENT = new Cpp2TokenType("BLOCK_COMMENT");
  IElementType BOOL_LITERAL = new Cpp2TokenType("BOOL_LITERAL");
  IElementType BREAK = new Cpp2TokenType("break");
  IElementType COLON = new Cpp2TokenType(":");
  IElementType COLONCOLON = new Cpp2TokenType("::");
  IElementType COMMA = new Cpp2TokenType(",");
  IElementType CONST = new Cpp2TokenType("const");
  IElementType CONTINUE = new Cpp2TokenType("continue");
  IElementType COPY = new Cpp2TokenType("copy");
  IElementType DEREF = new Cpp2TokenType("DEREF");
  IElementType DO = new Cpp2TokenType("do");
  IElementType DOT = new Cpp2TokenType(".");
  IElementType DOTDOTDOT = new Cpp2TokenType("...");
  IElementType ELSE = new Cpp2TokenType("else");
  IElementType EQ = new Cpp2TokenType("=");
  IElementType EQEQ = new Cpp2TokenType("==");
  IElementType EXP = new Cpp2TokenType("^");
  IElementType FINAL = new Cpp2TokenType("final");
  IElementType FLOAT_LITERAL = new Cpp2TokenType("FLOAT_LITERAL");
  IElementType FOR = new Cpp2TokenType("for");
  IElementType FORWARD = new Cpp2TokenType("forward");
  IElementType GT = new Cpp2TokenType(">");
  IElementType GTEQ = new Cpp2TokenType(">=");
  IElementType GTGT = new Cpp2TokenType(">>");
  IElementType IDENTIFIER_WORD = new Cpp2TokenType("IDENTIFIER_WORD");
  IElementType IF = new Cpp2TokenType("if");
  IElementType IN = new Cpp2TokenType("in");
  IElementType INOUT = new Cpp2TokenType("inout");
  IElementType INT_LITERAL = new Cpp2TokenType("INT_LITERAL");
  IElementType LEFT_BRACE = new Cpp2TokenType("{");
  IElementType LEFT_PARENTHESIS = new Cpp2TokenType("(");
  IElementType LINE_COMMENT = new Cpp2TokenType("LINE_COMMENT");
  IElementType LT = new Cpp2TokenType("<");
  IElementType LTEQ = new Cpp2TokenType("<=");
  IElementType LTLT = new Cpp2TokenType("<<");
  IElementType METAFUNCTION = new Cpp2TokenType("METAFUNCTION");
  IElementType MINUS = new Cpp2TokenType("-");
  IElementType MINUSMINUS = new Cpp2TokenType("--");
  IElementType MODULO = new Cpp2TokenType("%");
  IElementType MOVE = new Cpp2TokenType("move");
  IElementType MUL = new Cpp2TokenType("MUL");
  IElementType NAMESPACE = new Cpp2TokenType("namespace");
  IElementType NAMESPACE_REF = new Cpp2TokenType("namespace_ref");
  IElementType NEQ = new Cpp2TokenType("!=");
  IElementType NEWLINE = new Cpp2TokenType("\\n");
  IElementType NEXT = new Cpp2TokenType("next");
  IElementType OR = new Cpp2TokenType("|");
  IElementType OROR = new Cpp2TokenType("||");
  IElementType OUT = new Cpp2TokenType("out");
  IElementType OVERRIDE = new Cpp2TokenType("override");
  IElementType PLUS = new Cpp2TokenType("+");
  IElementType PLUSPLUS = new Cpp2TokenType("++");
  IElementType PRIVATE = new Cpp2TokenType("private");
  IElementType PROTECTED = new Cpp2TokenType("protected");
  IElementType PUBLIC = new Cpp2TokenType("public");
  IElementType RETURN = new Cpp2TokenType("return");
  IElementType RIGHT_BRACE = new Cpp2TokenType("}");
  IElementType RIGHT_PARENTHESIS = new Cpp2TokenType(")");
  IElementType SEMICOLON = new Cpp2TokenType(";");
  IElementType SLASH = new Cpp2TokenType("/");
  IElementType STRING_LITERAL = new Cpp2TokenType("STRING_LITERAL");
  IElementType THIS = new Cpp2TokenType("this");
  IElementType TYPE_WORD = new Cpp2TokenType("type");
  IElementType UNDERSCORE = new Cpp2TokenType("_");
  IElementType USING = new Cpp2TokenType("using");
  IElementType VIRTUAL = new Cpp2TokenType("virtual");
  IElementType WHILE = new Cpp2TokenType("while");

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
      else if (type == COMMENT) {
        return new Cpp2CommentImpl(node);
      }
      else if (type == DEREF_EXPR) {
        return new Cpp2DerefExprImpl(node);
      }
      else if (type == DIV_EXPR) {
        return new Cpp2DivExprImpl(node);
      }
      else if (type == DO_WHILE_LOOP) {
        return new Cpp2DoWhileLoopImpl(node);
      }
      else if (type == EQ_EXPR) {
        return new Cpp2EqExprImpl(node);
      }
      else if (type == FILE_WRAPPER) {
        return new Cpp2FileWrapperImpl(node);
      }
      else if (type == FOR_LOOP) {
        return new Cpp2ForLoopImpl(node);
      }
      else if (type == FUNC_ALIAS_DECL) {
        return new Cpp2FuncAliasDeclImpl(node);
      }
      else if (type == FUNC_CALL) {
        return new Cpp2FuncCallImpl(node);
      }
      else if (type == FUNC_DECL) {
        return new Cpp2FuncDeclImpl(node);
      }
      else if (type == GTEQ_EXPR) {
        return new Cpp2GteqExprImpl(node);
      }
      else if (type == GT_EXPR) {
        return new Cpp2GtExprImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new Cpp2IdentifierImpl(node);
      }
      else if (type == IF_BRANCH) {
        return new Cpp2IfBranchImpl(node);
      }
      else if (type == LEFT_SHIFT_EXPR) {
        return new Cpp2LeftShiftExprImpl(node);
      }
      else if (type == LIST_EXPR) {
        return new Cpp2ListExprImpl(node);
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
      else if (type == MEMBER_ACCESS) {
        return new Cpp2MemberAccessImpl(node);
      }
      else if (type == MEMBER_DECL) {
        return new Cpp2MemberDeclImpl(node);
      }
      else if (type == MOD_EXPR) {
        return new Cpp2ModExprImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new Cpp2MulExprImpl(node);
      }
      else if (type == NAMESPACE_ALIAS_DECL) {
        return new Cpp2NamespaceAliasDeclImpl(node);
      }
      else if (type == NAMESPACE_DECL) {
        return new Cpp2NamespaceDeclImpl(node);
      }
      else if (type == NEQ_EXPR) {
        return new Cpp2NeqExprImpl(node);
      }
      else if (type == NEXT_STMT) {
        return new Cpp2NextStmtImpl(node);
      }
      else if (type == OBJ_ALIAS_DECL) {
        return new Cpp2ObjAliasDeclImpl(node);
      }
      else if (type == OR_EXPR) {
        return new Cpp2OrExprImpl(node);
      }
      else if (type == PARAM) {
        return new Cpp2ParamImpl(node);
      }
      else if (type == PARAM_LIST) {
        return new Cpp2ParamListImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new Cpp2ParenExprImpl(node);
      }
      else if (type == Q_IDENTIFIER) {
        return new Cpp2QIdentifierImpl(node);
      }
      else if (type == RETURN_STMT) {
        return new Cpp2ReturnStmtImpl(node);
      }
      else if (type == RETURN_TYPE) {
        return new Cpp2ReturnTypeImpl(node);
      }
      else if (type == RIGHT_SHIFT_EXPR) {
        return new Cpp2RightShiftExprImpl(node);
      }
      else if (type == ROOT_STMTS) {
        return new Cpp2RootStmtsImpl(node);
      }
      else if (type == ROOT_STMT_BLOCK) {
        return new Cpp2RootStmtBlockImpl(node);
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
      else if (type == TEMPLATE) {
        return new Cpp2TemplateImpl(node);
      }
      else if (type == TEMPLATE_DECL) {
        return new Cpp2TemplateDeclImpl(node);
      }
      else if (type == THIS_PARAM) {
        return new Cpp2ThisParamImpl(node);
      }
      else if (type == TYPE_ALIAS_DECL) {
        return new Cpp2TypeAliasDeclImpl(node);
      }
      else if (type == TYPE_DECL) {
        return new Cpp2TypeDeclImpl(node);
      }
      else if (type == TYPE_SPECIFIER) {
        return new Cpp2TypeSpecifierImpl(node);
      }
      else if (type == USING_NAMESPACE) {
        return new Cpp2UsingNamespaceImpl(node);
      }
      else if (type == VALUE_DECL) {
        return new Cpp2ValueDeclImpl(node);
      }
      else if (type == VARIADIC_PARAM) {
        return new Cpp2VariadicParamImpl(node);
      }
      else if (type == WHILE_LOOP) {
        return new Cpp2WhileLoopImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
