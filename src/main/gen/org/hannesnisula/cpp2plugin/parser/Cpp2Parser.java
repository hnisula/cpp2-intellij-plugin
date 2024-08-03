// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.hannesnisula.cpp2plugin.psi.Cpp2Types.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class Cpp2Parser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ADD_EXPR, AND_EXPR, BIT_AND_EXPR, BIT_OR_EXPR,
      BIT_XOR_EXPR, DIV_EXPR, EQ_EXPR, EXPR,
      FUNC_CALL, GTEQ_EXPR, GT_EXPR, LEFT_SHIFT_EXPR,
      LITERAL, LTEQ_EXPR, LT_EXPR, LVALUE,
      MOD_EXPR, MUL_EXPR, NEQ_EXPR, OR_EXPR,
      RIGHT_SHIFT_EXPR, SUBSCRIPT_EXPR, SUB_EXPR),
  };

  /* ********************************************************** */
  // param_kind? expr
  public static boolean arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = arg_0(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // param_kind?
  private static boolean arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_0")) return false;
    param_kind(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // lvalue '=' expr ';'
  public static boolean assign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lvalue(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ASSIGN, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_WORD ':' ((type '=' expr) | type | ('=' expr)) ';'
  public static boolean decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DECL, null);
    r = consumeTokens(b, 0, IDENTIFIER_WORD, COLON);
    r = r && decl_2(b, l + 1);
    p = r; // pin = 3
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (type '=' expr) | type | ('=' expr)
  private static boolean decl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_2_0(b, l + 1);
    if (!r) r = type(b, l + 1);
    if (!r) r = decl_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type '=' expr
  private static boolean decl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' expr
  private static boolean decl_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(';')
  static boolean decl_recovery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_recovery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr ';'
  static boolean expr_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (func_decl | stmt | stmt_block | comment)*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    while (true) {
      int c = current_position_(b);
      if (!file_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file", c)) break;
    }
    return true;
  }

  // func_decl | stmt | stmt_block | comment
  private static boolean file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0")) return false;
    boolean r;
    r = func_decl(b, l + 1);
    if (!r) r = stmt(b, l + 1);
    if (!r) r = stmt_block(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // 'for' expr ('next' expr)? 'do' param_list stmt_block
  public static boolean for_loop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_loop")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && expr(b, l + 1, -1);
    r = r && for_loop_2(b, l + 1);
    r = r && consumeToken(b, DO);
    r = r && param_list(b, l + 1);
    r = r && stmt_block(b, l + 1);
    exit_section_(b, m, FOR_LOOP, r);
    return r;
  }

  // ('next' expr)?
  private static boolean for_loop_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_loop_2")) return false;
    for_loop_2_0(b, l + 1);
    return true;
  }

  // 'next' expr
  private static boolean for_loop_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_loop_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEXT);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_WORD ':' template_decl? param_list return_type? (('='? expr ';') | ('=' stmt_block))
  public static boolean func_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_decl")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNC_DECL, null);
    r = consumeTokens(b, 0, IDENTIFIER_WORD, COLON);
    r = r && func_decl_2(b, l + 1);
    r = r && param_list(b, l + 1);
    p = r; // pin = param_list
    r = r && report_error_(b, func_decl_4(b, l + 1));
    r = p && func_decl_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // template_decl?
  private static boolean func_decl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_decl_2")) return false;
    template_decl(b, l + 1);
    return true;
  }

  // return_type?
  private static boolean func_decl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_decl_4")) return false;
    return_type(b, l + 1);
    return true;
  }

  // ('='? expr ';') | ('=' stmt_block)
  private static boolean func_decl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_decl_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = func_decl_5_0(b, l + 1);
    if (!r) r = func_decl_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '='? expr ';'
  private static boolean func_decl_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_decl_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = func_decl_5_0_0(b, l + 1);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // '='?
  private static boolean func_decl_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_decl_5_0_0")) return false;
    consumeToken(b, EQ);
    return true;
  }

  // '=' stmt_block
  private static boolean func_decl_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_decl_5_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && stmt_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // param_kind? ((IDENTIFIER_WORD (':' ('_' | type))?) | (IDENTIFIER_WORD '...'))
  public static boolean param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM, "<param>");
    r = param_0(b, l + 1);
    r = r && param_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // param_kind?
  private static boolean param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_0")) return false;
    param_kind(b, l + 1);
    return true;
  }

  // (IDENTIFIER_WORD (':' ('_' | type))?) | (IDENTIFIER_WORD '...')
  private static boolean param_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_1_0(b, l + 1);
    if (!r) r = param_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER_WORD (':' ('_' | type))?
  private static boolean param_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_WORD);
    r = r && param_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' ('_' | type))?
  private static boolean param_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_1_0_1")) return false;
    param_1_0_1_0(b, l + 1);
    return true;
  }

  // ':' ('_' | type)
  private static boolean param_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && param_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '_' | type
  private static boolean param_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_1_0_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, UNDERSCORE);
    if (!r) r = type(b, l + 1);
    return r;
  }

  // IDENTIFIER_WORD '...'
  private static boolean param_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER_WORD, DOTDOTDOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'in' | 'copy' | 'inout' | 'out' | 'move' | 'forward'
  static boolean param_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_kind")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, COPY);
    if (!r) r = consumeToken(b, INOUT);
    if (!r) r = consumeToken(b, OUT);
    if (!r) r = consumeToken(b, MOVE);
    if (!r) r = consumeToken(b, FORWARD);
    return r;
  }

  /* ********************************************************** */
  // '(' ((this_param | param) (',' param)*)? ')'
  public static boolean param_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && param_list_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, PARAM_LIST, r);
    return r;
  }

  // ((this_param | param) (',' param)*)?
  private static boolean param_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_1")) return false;
    param_list_1_0(b, l + 1);
    return true;
  }

  // (this_param | param) (',' param)*
  private static boolean param_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_list_1_0_0(b, l + 1);
    r = r && param_list_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // this_param | param
  private static boolean param_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_1_0_0")) return false;
    boolean r;
    r = this_param(b, l + 1);
    if (!r) r = param(b, l + 1);
    return r;
  }

  // (',' param)*
  private static boolean param_list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!param_list_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "param_list_1_0_1", c)) break;
    }
    return true;
  }

  // ',' param
  private static boolean param_list_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'const' | '*'
  static boolean qualifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifier")) return false;
    boolean r;
    r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, "*");
    return r;
  }

  /* ********************************************************** */
  // '->' ('_' | type)
  public static boolean return_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_type")) return false;
    if (!nextTokenIs(b, ARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARROW);
    r = r && return_type_1(b, l + 1);
    exit_section_(b, m, RETURN_TYPE, r);
    return r;
  }

  // '_' | type
  private static boolean return_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_type_1")) return false;
    boolean r;
    r = consumeToken(b, UNDERSCORE);
    if (!r) r = type(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (IDENTIFIER_WORD template? '::')+
  public static boolean scope(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scope_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!scope_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "scope", c)) break;
    }
    exit_section_(b, m, SCOPE, r);
    return r;
  }

  // IDENTIFIER_WORD template? '::'
  private static boolean scope_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_WORD);
    r = r && scope_0_1(b, l + 1);
    r = r && consumeToken(b, COLONCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // template?
  private static boolean scope_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_0_1")) return false;
    template(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // func_decl | decl | assign | expr_stmt | for_loop | comment
  static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    r = func_decl(b, l + 1);
    if (!r) r = decl(b, l + 1);
    if (!r) r = assign(b, l + 1);
    if (!r) r = expr_stmt(b, l + 1);
    if (!r) r = for_loop(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // '{' stmt* '}'
  public static boolean stmt_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_block")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && stmt_block_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, STMT_BLOCK, r);
    return r;
  }

  // stmt*
  private static boolean stmt_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '<' (type)* '>'
  public static boolean template(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && template_1(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, TEMPLATE, r);
    return r;
  }

  // (type)*
  private static boolean template_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!template_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "template_1", c)) break;
    }
    return true;
  }

  // (type)
  private static boolean template_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '<' ((IDENTIFIER_WORD (':' (TYPE_WORD | type))?) | (IDENTIFIER_WORD '...' (':' TYPE_WORD)?))+ '>'
  public static boolean template_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_decl")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && template_decl_1(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, TEMPLATE_DECL, r);
    return r;
  }

  // ((IDENTIFIER_WORD (':' (TYPE_WORD | type))?) | (IDENTIFIER_WORD '...' (':' TYPE_WORD)?))+
  private static boolean template_decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_decl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_decl_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!template_decl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "template_decl_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (IDENTIFIER_WORD (':' (TYPE_WORD | type))?) | (IDENTIFIER_WORD '...' (':' TYPE_WORD)?)
  private static boolean template_decl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_decl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_decl_1_0_0(b, l + 1);
    if (!r) r = template_decl_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER_WORD (':' (TYPE_WORD | type))?
  private static boolean template_decl_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_decl_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_WORD);
    r = r && template_decl_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' (TYPE_WORD | type))?
  private static boolean template_decl_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_decl_1_0_0_1")) return false;
    template_decl_1_0_0_1_0(b, l + 1);
    return true;
  }

  // ':' (TYPE_WORD | type)
  private static boolean template_decl_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_decl_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && template_decl_1_0_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TYPE_WORD | type
  private static boolean template_decl_1_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_decl_1_0_0_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, TYPE_WORD);
    if (!r) r = type(b, l + 1);
    return r;
  }

  // IDENTIFIER_WORD '...' (':' TYPE_WORD)?
  private static boolean template_decl_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_decl_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER_WORD, DOTDOTDOT);
    r = r && template_decl_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' TYPE_WORD)?
  private static boolean template_decl_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_decl_1_0_1_2")) return false;
    template_decl_1_0_1_2_0(b, l + 1);
    return true;
  }

  // ':' TYPE_WORD
  private static boolean template_decl_1_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_decl_1_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, TYPE_WORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // this_param_kind? 'this'
  static boolean this_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "this_param")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = this_param_0(b, l + 1);
    r = r && consumeToken(b, THIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // this_param_kind?
  private static boolean this_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "this_param_0")) return false;
    this_param_kind(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'virtual' | 'override' | 'final' | param_kind
  static boolean this_param_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "this_param_kind")) return false;
    boolean r;
    r = consumeToken(b, VIRTUAL);
    if (!r) r = consumeToken(b, OVERRIDE);
    if (!r) r = consumeToken(b, FINAL);
    if (!r) r = param_kind(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // qualifier* scope? IDENTIFIER_WORD template?
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = type_0(b, l + 1);
    r = r && type_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER_WORD);
    r = r && type_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // qualifier*
  private static boolean type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qualifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_0", c)) break;
    }
    return true;
  }

  // scope?
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    scope(b, l + 1);
    return true;
  }

  // template?
  private static boolean type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_3")) return false;
    template(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: BINARY(or_expr)
  // 1: BINARY(and_expr)
  // 2: BINARY(bit_or_expr)
  // 3: BINARY(bit_xor_expr)
  // 4: BINARY(bit_and_expr)
  // 5: BINARY(eq_expr) BINARY(neq_expr)
  // 6: BINARY(lt_expr) BINARY(gt_expr) BINARY(lteq_expr) BINARY(gteq_expr)
  // 7: BINARY(left_shift_expr) BINARY(right_shift_expr)
  // 8: BINARY(add_expr) BINARY(sub_expr)
  // 9: BINARY(mul_expr) BINARY(div_expr) BINARY(mod_expr)
  // 10: ATOM(func_call) BINARY(subscript_expr)
  // 11: ATOM(lvalue)
  // 12: ATOM(literal)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = func_call(b, l + 1);
    if (!r) r = lvalue(b, l + 1);
    if (!r) r = literal(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, OROR)) {
        r = expr(b, l, 0);
        exit_section_(b, l, m, OR_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, ANDAND)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, AND_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, OR)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, BIT_OR_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, EXP)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, BIT_XOR_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, AND)) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, BIT_AND_EXPR, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, EQEQ)) {
        r = expr(b, l, 5);
        exit_section_(b, l, m, EQ_EXPR, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, NEQ)) {
        r = expr(b, l, 5);
        exit_section_(b, l, m, NEQ_EXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, LT)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, LT_EXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, GT)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, GT_EXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, LTEQ)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, LTEQ_EXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, GTEQ)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, GTEQ_EXPR, r, true, null);
      }
      else if (g < 7 && consumeTokenSmart(b, LTLT)) {
        r = expr(b, l, 7);
        exit_section_(b, l, m, LEFT_SHIFT_EXPR, r, true, null);
      }
      else if (g < 7 && consumeTokenSmart(b, GTGT)) {
        r = expr(b, l, 7);
        exit_section_(b, l, m, RIGHT_SHIFT_EXPR, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, PLUS)) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, ADD_EXPR, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, MINUS)) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, SUB_EXPR, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, MUL)) {
        r = expr(b, l, 9);
        exit_section_(b, l, m, MUL_EXPR, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, SLASH)) {
        r = expr(b, l, 9);
        exit_section_(b, l, m, DIV_EXPR, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, MODULO)) {
        r = expr(b, l, 9);
        exit_section_(b, l, m, MOD_EXPR, r, true, null);
      }
      else if (g < 10 && consumeTokenSmart(b, "[")) {
        r = report_error_(b, expr(b, l, 10));
        r = consumeToken(b, "]") && r;
        exit_section_(b, l, m, SUBSCRIPT_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // scope? IDENTIFIER_WORD template? '(' arg* ')'
  public static boolean func_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_call")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = func_call_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER_WORD);
    r = r && func_call_2(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && func_call_4(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, FUNC_CALL, r);
    return r;
  }

  // scope?
  private static boolean func_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_call_0")) return false;
    scope(b, l + 1);
    return true;
  }

  // template?
  private static boolean func_call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_call_2")) return false;
    template(b, l + 1);
    return true;
  }

  // arg*
  private static boolean func_call_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_call_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_call_4", c)) break;
    }
    return true;
  }

  // scope? IDENTIFIER_WORD(DEREF | ('[' expr ']' | ('.' IDENTIFIER_WORD)))*
  public static boolean lvalue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lvalue")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lvalue_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER_WORD);
    r = r && lvalue_2(b, l + 1);
    exit_section_(b, m, LVALUE, r);
    return r;
  }

  // scope?
  private static boolean lvalue_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lvalue_0")) return false;
    scope(b, l + 1);
    return true;
  }

  // (DEREF | ('[' expr ']' | ('.' IDENTIFIER_WORD)))*
  private static boolean lvalue_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lvalue_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!lvalue_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lvalue_2", c)) break;
    }
    return true;
  }

  // DEREF | ('[' expr ']' | ('.' IDENTIFIER_WORD))
  private static boolean lvalue_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lvalue_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DEREF);
    if (!r) r = lvalue_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' expr ']' | ('.' IDENTIFIER_WORD)
  private static boolean lvalue_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lvalue_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lvalue_2_0_1_0(b, l + 1);
    if (!r) r = lvalue_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' expr ']'
  private static boolean lvalue_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lvalue_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "[");
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' IDENTIFIER_WORD
  private static boolean lvalue_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lvalue_2_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ".");
    r = r && consumeToken(b, IDENTIFIER_WORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // BOOL_LITERAL | INT_LITERAL | FLOAT_LITERAL | STRING_LITERAL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeTokenSmart(b, BOOL_LITERAL);
    if (!r) r = consumeTokenSmart(b, INT_LITERAL);
    if (!r) r = consumeTokenSmart(b, FLOAT_LITERAL);
    if (!r) r = consumeTokenSmart(b, STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
