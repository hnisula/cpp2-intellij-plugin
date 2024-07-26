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
      FUNC_CALL, FUNC_EXPR, GTEQ_EXPR, GT_EXPR,
      ID, LEFT_SHIFT_EXPR, LITERAL, LTEQ_EXPR,
      LT_EXPR, MOD_EXPR, MUL_EXPR, NEQ_EXPR,
      OR_EXPR, RETURN_EXPR, RIGHT_SHIFT_EXPR, SUB_EXPR),
  };

  /* ********************************************************** */
  // param_kind? id
  public static boolean arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = arg_0(b, l + 1);
    r = r && id(b, l + 1);
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
  // id '=' expr
  public static boolean assign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, ASSIGN, r);
    return r;
  }

  /* ********************************************************** */
  // func_decl | var_decl
  public static boolean decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = func_decl(b, l + 1);
    if (!r) r = var_decl(b, l + 1);
    exit_section_(b, m, DECL, r);
    return r;
  }

  /* ********************************************************** */
  // (stmt | named_decl | for_loop | COMMENT)*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    while (true) {
      int c = current_position_(b);
      if (!file_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file", c)) break;
    }
    return true;
  }

  // stmt | named_decl | for_loop | COMMENT
  private static boolean file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0")) return false;
    boolean r;
    r = stmt(b, l + 1);
    if (!r) r = named_decl(b, l + 1);
    if (!r) r = for_loop(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // 'for' id 'do' '(' arg* ')' (stmt_block)
  public static boolean for_loop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_loop")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_LOOP, null);
    r = consumeToken(b, FOR);
    p = r; // pin = 1
    r = r && report_error_(b, id(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, DO, LEFT_PARENTHESIS)) && r;
    r = p && report_error_(b, for_loop_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    r = p && for_loop_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // arg*
  private static boolean for_loop_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_loop_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_loop_4", c)) break;
    }
    return true;
  }

  // (stmt_block)
  private static boolean for_loop_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_loop_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' func_expr
  public static boolean func_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_decl")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && func_expr(b, l + 1);
    exit_section_(b, m, FUNC_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // '(' param_decl* ')'
  public static boolean func_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_params")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && func_params_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, FUNC_PARAMS, r);
    return r;
  }

  // param_decl*
  private static boolean func_params_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_params_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!param_decl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_params_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // func_params ('->' id)?
  public static boolean func_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_signature")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = func_params(b, l + 1);
    r = r && func_signature_1(b, l + 1);
    exit_section_(b, m, FUNC_SIGNATURE, r);
    return r;
  }

  // ('->' id)?
  private static boolean func_signature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_signature_1")) return false;
    func_signature_1_0(b, l + 1);
    return true;
  }

  // '->' id
  private static boolean func_signature_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_signature_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARROW);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_WORD decl
  public static boolean named_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_decl")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_WORD);
    r = r && decl(b, l + 1);
    exit_section_(b, m, NAMED_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // param_kind? IDENTIFIER_WORD
  public static boolean param_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_DECL, "<param decl>");
    r = param_decl_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER_WORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // param_kind?
  private static boolean param_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_decl_0")) return false;
    param_kind(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'in' | 'copy' | 'inout' | 'out' | 'move' | 'forward'
  public static boolean param_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_kind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_KIND, "<param kind>");
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, COPY);
    if (!r) r = consumeToken(b, INOUT);
    if (!r) r = consumeToken(b, OUT);
    if (!r) r = consumeToken(b, MOVE);
    if (!r) r = consumeToken(b, FORWARD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RETURN expr
  public static boolean return_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_expr")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, RETURN_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // (type_id '::')+
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

  // type_id '::'
  private static boolean scope_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_id(b, l + 1);
    r = r && consumeToken(b, COLONCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (named_decl | assign | return_expr) ";"
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    if (!nextTokenIs(b, "<stmt>", IDENTIFIER_WORD, RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = stmt_0(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // named_decl | assign | return_expr
  private static boolean stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_0")) return false;
    boolean r;
    r = named_decl(b, l + 1);
    if (!r) r = assign(b, l + 1);
    if (!r) r = return_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '{' (stmt | COMMENT)* '}'
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

  // (stmt | COMMENT)*
  private static boolean stmt_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt_block_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_block_1", c)) break;
    }
    return true;
  }

  // stmt | COMMENT
  private static boolean stmt_block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_block_1_0")) return false;
    boolean r;
    r = stmt(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // '<' template_param_decl+ '>'
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

  // template_param_decl+
  private static boolean template_decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_decl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_param_decl(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!template_param_decl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "template_decl_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '<' (type_id_scoped | id | NUMBER_LITERAL | STRING_LITERAL)* '>'
  public static boolean template_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_def")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && template_def_1(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, TEMPLATE_DEF, r);
    return r;
  }

  // (type_id_scoped | id | NUMBER_LITERAL | STRING_LITERAL)*
  private static boolean template_def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_def_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!template_def_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "template_def_1", c)) break;
    }
    return true;
  }

  // type_id_scoped | id | NUMBER_LITERAL | STRING_LITERAL
  private static boolean template_def_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_def_1_0")) return false;
    boolean r;
    r = type_id_scoped(b, l + 1);
    if (!r) r = id(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_WORD '...'? (':' IDENTIFIER_WORD)?
  public static boolean template_param_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_param_decl")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_WORD);
    r = r && template_param_decl_1(b, l + 1);
    r = r && template_param_decl_2(b, l + 1);
    exit_section_(b, m, TEMPLATE_PARAM_DECL, r);
    return r;
  }

  // '...'?
  private static boolean template_param_decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_param_decl_1")) return false;
    consumeToken(b, DOTDOTDOT);
    return true;
  }

  // (':' IDENTIFIER_WORD)?
  private static boolean template_param_decl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_param_decl_2")) return false;
    template_param_decl_2_0(b, l + 1);
    return true;
  }

  // ':' IDENTIFIER_WORD
  private static boolean template_param_decl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_param_decl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, IDENTIFIER_WORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_WORD template_def?
  public static boolean type_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_id")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_WORD);
    r = r && type_id_1(b, l + 1);
    exit_section_(b, m, TYPE_ID, r);
    return r;
  }

  // template_def?
  private static boolean type_id_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_id_1")) return false;
    template_def(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // scope? type_id
  public static boolean type_id_scoped(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_id_scoped")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_id_scoped_0(b, l + 1);
    r = r && type_id(b, l + 1);
    exit_section_(b, m, TYPE_ID_SCOPED, r);
    return r;
  }

  // scope?
  private static boolean type_id_scoped_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_id_scoped_0")) return false;
    scope(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (const | '*')*  type_id_scoped
  public static boolean type_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPECIFIER, "<type specifier>");
    r = type_specifier_0(b, l + 1);
    r = r && type_id_scoped(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (const | '*')*
  private static boolean type_specifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specifier_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_specifier_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_specifier_0", c)) break;
    }
    return true;
  }

  // const | '*'
  private static boolean type_specifier_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specifier_0_0")) return false;
    boolean r;
    r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, ASTERISK);
    return r;
  }

  /* ********************************************************** */
  // (':' type_specifier ('=' expr)?) | (':' '=' expr)
  public static boolean var_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_decl")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_decl_0(b, l + 1);
    if (!r) r = var_decl_1(b, l + 1);
    exit_section_(b, m, VAR_DECL, r);
    return r;
  }

  // ':' type_specifier ('=' expr)?
  private static boolean var_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_decl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type_specifier(b, l + 1);
    r = r && var_decl_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' expr)?
  private static boolean var_decl_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_decl_0_2")) return false;
    var_decl_0_2_0(b, l + 1);
    return true;
  }

  // '=' expr
  private static boolean var_decl_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_decl_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' '=' expr
  private static boolean var_decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_decl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, EQ);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
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
  // 10: ATOM(func_call)
  // 11: ATOM(id)
  // 12: ATOM(func_expr)
  // 13: ATOM(literal)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = func_call(b, l + 1);
    if (!r) r = id(b, l + 1);
    if (!r) r = func_expr(b, l + 1);
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
      else if (g < 9 && consumeTokenSmart(b, ASTERISK)) {
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
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // (id | type_id_scoped) '(' (expr)* ')'
  public static boolean func_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_call")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = func_call_0(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && func_call_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, FUNC_CALL, r);
    return r;
  }

  // id | type_id_scoped
  private static boolean func_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_call_0")) return false;
    boolean r;
    r = id(b, l + 1);
    if (!r) r = type_id_scoped(b, l + 1);
    return r;
  }

  // (expr)*
  private static boolean func_call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_call_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!func_call_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_call_2", c)) break;
    }
    return true;
  }

  // (expr)
  private static boolean func_call_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_call_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // scope? IDENTIFIER_WORD ('[' expr ']')?
  public static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER_WORD);
    r = r && id_2(b, l + 1);
    exit_section_(b, m, ID, r);
    return r;
  }

  // scope?
  private static boolean id_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_0")) return false;
    scope(b, l + 1);
    return true;
  }

  // ('[' expr ']')?
  private static boolean id_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_2")) return false;
    id_2_0(b, l + 1);
    return true;
  }

  // '[' expr ']'
  private static boolean id_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "[");
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // func_signature '=' (stmt | stmt_block)
  public static boolean func_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_expr")) return false;
    if (!nextTokenIsSmart(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = func_signature(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && func_expr_2(b, l + 1);
    exit_section_(b, m, FUNC_EXPR, r);
    return r;
  }

  // stmt | stmt_block
  private static boolean func_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_expr_2")) return false;
    boolean r;
    r = stmt(b, l + 1);
    if (!r) r = stmt_block(b, l + 1);
    return r;
  }

  // NUMBER_LITERAL | STRING_LITERAL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    if (!nextTokenIsSmart(b, NUMBER_LITERAL, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeTokenSmart(b, NUMBER_LITERAL);
    if (!r) r = consumeTokenSmart(b, STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
