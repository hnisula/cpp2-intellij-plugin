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
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return File(b, l + 1);
  }

  /* ********************************************************** */
  // IDENTIFIER ':' IDENTIFIER? ('=' Expression)?
  public static boolean Assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && Assignment_2(b, l + 1);
    r = r && Assignment_3(b, l + 1);
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean Assignment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_2")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // ('=' Expression)?
  private static boolean Assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_3")) return false;
    Assignment_3_0(b, l + 1);
    return true;
  }

  // '=' Expression
  private static boolean Assignment_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | NUMBER_LITERAL | STRING_LITERAL
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NUMBER_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (Statement|COMMENT|Assignment)*
  static boolean File(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File")) return false;
    while (true) {
      int c = current_position_(b);
      if (!File_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "File", c)) break;
    }
    return true;
  }

  // Statement|COMMENT|Assignment
  private static boolean File_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File_0")) return false;
    boolean r;
    r = Statement(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = Assignment(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // !(IDENTIFIER | NUMBER_LITERAL)
  static boolean Recovery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Recovery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !Recovery_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER | NUMBER_LITERAL
  private static boolean Recovery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Recovery_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NUMBER_LITERAL);
    return r;
  }

  /* ********************************************************** */
  // Assignment ";"
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Assignment(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, STATEMENT, r);
    return r;
  }

}
