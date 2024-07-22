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
  // ParameterKind? Identifier
  public static boolean Argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT, "<argument>");
    r = Argument_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ParameterKind?
  private static boolean Argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Argument_0")) return false;
    ParameterKind(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Identifier | NUMBER_LITERAL | STRING_LITERAL
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = Identifier(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (Statement | FunctionDefinition | ForLoop | COMMENT)*
  static boolean File(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File")) return false;
    while (true) {
      int c = current_position_(b);
      if (!File_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "File", c)) break;
    }
    return true;
  }

  // Statement | FunctionDefinition | ForLoop | COMMENT
  private static boolean File_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File_0")) return false;
    boolean r;
    r = Statement(b, l + 1);
    if (!r) r = FunctionDefinition(b, l + 1);
    if (!r) r = ForLoop(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // 'for' Identifier 'do' '(' Argument* ')' (StatementBlock)
  public static boolean ForLoop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_LOOP, null);
    r = consumeToken(b, FOR);
    p = r; // pin = 1
    r = r && report_error_(b, Identifier(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, DO, LEFT_PARENTHESIS)) && r;
    r = p && report_error_(b, ForLoop_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    r = p && ForLoop_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Argument*
  private static boolean ForLoop_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Argument(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForLoop_4", c)) break;
    }
    return true;
  }

  // (StatementBlock)
  private static boolean ForLoop_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StatementBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' ParameterDeclaration* ')' ('->' ('_' | TypeSpecifier))? '=' (Statement | StatementBlock)
  public static boolean FunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && FunctionDefinition_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && FunctionDefinition_3(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && FunctionDefinition_5(b, l + 1);
    exit_section_(b, m, FUNCTION_DEFINITION, r);
    return r;
  }

  // ParameterDeclaration*
  private static boolean FunctionDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ParameterDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDefinition_1", c)) break;
    }
    return true;
  }

  // ('->' ('_' | TypeSpecifier))?
  private static boolean FunctionDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_3")) return false;
    FunctionDefinition_3_0(b, l + 1);
    return true;
  }

  // '->' ('_' | TypeSpecifier)
  private static boolean FunctionDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARROW);
    r = r && FunctionDefinition_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '_' | TypeSpecifier
  private static boolean FunctionDefinition_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_3_0_1")) return false;
    boolean r;
    r = consumeToken(b, UNDERSCORE);
    if (!r) r = TypeSpecifier(b, l + 1);
    return r;
  }

  // Statement | StatementBlock
  private static boolean FunctionDefinition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_5")) return false;
    boolean r;
    r = Statement(b, l + 1);
    if (!r) r = StatementBlock(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Scope? IDENTIFIER_WORD ('[' Expression ']')?
  public static boolean Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER_WORD);
    r = r && Identifier_2(b, l + 1);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  // Scope?
  private static boolean Identifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_0")) return false;
    Scope(b, l + 1);
    return true;
  }

  // ('[' Expression ']')?
  private static boolean Identifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_2")) return false;
    Identifier_2_0(b, l + 1);
    return true;
  }

  // '[' Expression ']'
  private static boolean Identifier_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ParameterKind? VarDeclaration
  public static boolean ParameterDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_DECLARATION, "<parameter declaration>");
    r = ParameterDeclaration_0(b, l + 1);
    r = r && VarDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ParameterKind?
  private static boolean ParameterDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDeclaration_0")) return false;
    ParameterKind(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'in' | 'copy' | 'inout' | 'out' | 'move' | 'forward'
  public static boolean ParameterKind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterKind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_KIND, "<parameter kind>");
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
  // RETURN Expression
  public static boolean ReturnExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnExpression")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, RETURN_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // (TypeIdentifier '::')+
  public static boolean Scope(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scope")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Scope_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Scope_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Scope", c)) break;
    }
    exit_section_(b, m, SCOPE, r);
    return r;
  }

  // TypeIdentifier '::'
  private static boolean Scope_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scope_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeIdentifier(b, l + 1);
    r = r && consumeToken(b, COLONCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (VarDeclaration | VarDefinition | VarAssignment | ReturnExpression) ";"
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    if (!nextTokenIs(b, "<statement>", IDENTIFIER_WORD, RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = Statement_0(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // VarDeclaration | VarDefinition | VarAssignment | ReturnExpression
  private static boolean Statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement_0")) return false;
    boolean r;
    r = VarDeclaration(b, l + 1);
    if (!r) r = VarDefinition(b, l + 1);
    if (!r) r = VarAssignment(b, l + 1);
    if (!r) r = ReturnExpression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '{' (Statement | COMMENT)* '}'
  public static boolean StatementBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementBlock")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && StatementBlock_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, STATEMENT_BLOCK, r);
    return r;
  }

  // (Statement | COMMENT)*
  private static boolean StatementBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StatementBlock_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StatementBlock_1", c)) break;
    }
    return true;
  }

  // Statement | COMMENT
  private static boolean StatementBlock_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementBlock_1_0")) return false;
    boolean r;
    r = Statement(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // '<' TemplateParamDeclaration+ '>'
  public static boolean TemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDeclaration")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TemplateDeclaration_1(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, TEMPLATE_DECLARATION, r);
    return r;
  }

  // TemplateParamDeclaration+
  private static boolean TemplateDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateParamDeclaration(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!TemplateParamDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateDeclaration_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '<' (IDENTIFIER_WORD | NUMBER_LITERAL | STRING_LITERAL)* '>'
  public static boolean TemplateDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDefinition")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TemplateDefinition_1(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, TEMPLATE_DEFINITION, r);
    return r;
  }

  // (IDENTIFIER_WORD | NUMBER_LITERAL | STRING_LITERAL)*
  private static boolean TemplateDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDefinition_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TemplateDefinition_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateDefinition_1", c)) break;
    }
    return true;
  }

  // IDENTIFIER_WORD | NUMBER_LITERAL | STRING_LITERAL
  private static boolean TemplateDefinition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDefinition_1_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER_WORD);
    if (!r) r = consumeToken(b, NUMBER_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_WORD '...'? (':' IDENTIFIER_WORD)?
  public static boolean TemplateParamDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParamDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_WORD);
    r = r && TemplateParamDeclaration_1(b, l + 1);
    r = r && TemplateParamDeclaration_2(b, l + 1);
    exit_section_(b, m, TEMPLATE_PARAM_DECLARATION, r);
    return r;
  }

  // '...'?
  private static boolean TemplateParamDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParamDeclaration_1")) return false;
    consumeToken(b, DOTDOTDOT);
    return true;
  }

  // (':' IDENTIFIER_WORD)?
  private static boolean TemplateParamDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParamDeclaration_2")) return false;
    TemplateParamDeclaration_2_0(b, l + 1);
    return true;
  }

  // ':' IDENTIFIER_WORD
  private static boolean TemplateParamDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateParamDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, IDENTIFIER_WORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_WORD TemplateDefinition?
  public static boolean TypeIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_WORD);
    r = r && TypeIdentifier_1(b, l + 1);
    exit_section_(b, m, TYPE_IDENTIFIER, r);
    return r;
  }

  // TemplateDefinition?
  private static boolean TypeIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentifier_1")) return false;
    TemplateDefinition(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (const | '*')*  Scope? TypeIdentifier
  public static boolean TypeSpecifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPECIFIER, "<type specifier>");
    r = TypeSpecifier_0(b, l + 1);
    r = r && TypeSpecifier_1(b, l + 1);
    r = r && TypeIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (const | '*')*
  private static boolean TypeSpecifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecifier_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeSpecifier_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeSpecifier_0", c)) break;
    }
    return true;
  }

  // const | '*'
  private static boolean TypeSpecifier_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecifier_0_0")) return false;
    boolean r;
    r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, ASTERISK);
    return r;
  }

  // Scope?
  private static boolean TypeSpecifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecifier_1")) return false;
    Scope(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Identifier '=' Expression
  public static boolean VarAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarAssignment")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, VAR_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_WORD ':' TypeSpecifier !'='
  public static boolean VarDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER_WORD, COLON);
    r = r && TypeSpecifier(b, l + 1);
    r = r && VarDeclaration_3(b, l + 1);
    exit_section_(b, m, VAR_DECLARATION, r);
    return r;
  }

  // !'='
  private static boolean VarDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, EQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_WORD ':' TypeSpecifier? '=' Expression
  public static boolean VarDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDefinition")) return false;
    if (!nextTokenIs(b, IDENTIFIER_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER_WORD, COLON);
    r = r && VarDefinition_2(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, VAR_DEFINITION, r);
    return r;
  }

  // TypeSpecifier?
  private static boolean VarDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDefinition_2")) return false;
    TypeSpecifier(b, l + 1);
    return true;
  }

}
