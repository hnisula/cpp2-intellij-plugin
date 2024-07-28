package org.hannesnisula.cpp2plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.hannesnisula.cpp2plugin.psi.Cpp2Types;
import com.intellij.psi.TokenType;

%%

%class Cpp2Lexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

LINE_WHITESPACE = [\ \t]
EOL_WHITESPACE = [\n\f\v\r]
WHITESPACE = ({LINE_WHITESPACE} | {EOL_WHITESPACE})+

BIN_LITERAL = "0b"[01_]*
OCT_LITERAL = "0o"[0-7_]*
DEC_LITERAL = [0-9][0-9_]*
HEX_LITERAL = "0x"[a-fA-F0-9_]*
NUMBER_LITERAL = {BIN_LITERAL} | {OCT_LITERAL} | {DEC_LITERAL} | {HEX_LITERAL}

STRING_LITERAL = \" (\\\" | [^\"])* \"

IDENTIFIER_WORD = [a-zA-Z_][a-zA-Z0-9_]*

COMMENT = "//".*

%%

<YYINITIAL> {
      {COMMENT}             { return Cpp2Types.COMMENT; }
      
      "->"                  { return Cpp2Types.ARROW; }
      "::"                  { return Cpp2Types.COLONCOLON; }
      "..."                 { return Cpp2Types.DOTDOTDOT; }
      "++"                  { return Cpp2Types.PLUSPLUS; }
      "--"                  { return Cpp2Types.MINUSMINUS; }
      "||"                  { return Cpp2Types.OROR; }
      "&&"                  { return Cpp2Types.ANDAND; }
      "=="                  { return Cpp2Types.EQEQ; }
      "!="                  { return Cpp2Types.NEQ; }
      "<="                  { return Cpp2Types.LTEQ; }
      ">="                  { return Cpp2Types.GTEQ; }
      "<<"                  { return Cpp2Types.LTLT; }
      ">>"                  { return Cpp2Types.GTGT; }
      
      ":"                   { return Cpp2Types.COLON; }
      ";"                   { return Cpp2Types.SEMICOLON; }
      "{"                   { return Cpp2Types.LEFT_BRACE; }
      "}"                   { return Cpp2Types.RIGHT_BRACE; }
      "("                   { return Cpp2Types.LEFT_PARENTHESIS; }
      ")"                   { return Cpp2Types.RIGHT_PARENTHESIS; }
      "<"                   { return Cpp2Types.LT; }
      ">"                   { return Cpp2Types.GT; }
      "="                   { return Cpp2Types.EQ; }
      "_"                   { return Cpp2Types.UNDERSCORE; }
      "*"                   { return Cpp2Types.ASTERISK; }
      "+"                   { return Cpp2Types.PLUS; }
      "-"                   { return Cpp2Types.MINUS; }
      "/"                   { return Cpp2Types.SLASH; }
      "%"                   { return Cpp2Types.MODULO; }
      "&"                   { return Cpp2Types.AND; }
      "|"                   { return Cpp2Types.OR; }
      "^"                   { return Cpp2Types.EXP; }
      
      "type"                { return Cpp2Types.TYPE_WORD; }
      "this"                { return Cpp2Types.THIS; }
      "for"                 { return Cpp2Types.FOR; }
      "while"               { return Cpp2Types.WHILE; }
      "do"                  { return Cpp2Types.DO; }
      "next"                { return Cpp2Types.NEXT; }
      "if"                  { return Cpp2Types.IF; }
      "else"                { return Cpp2Types.ELSE; }
      "next"                { return Cpp2Types.NEXT; }
      "const"               { return Cpp2Types.CONST; }
      "return"              { return Cpp2Types.RETURN; }
      
      "in"                  { return Cpp2Types.IN; }
      "copy"                { return Cpp2Types.COPY; }
      "inout"               { return Cpp2Types.INOUT; }
      "out"                 { return Cpp2Types.OUT; }
      "move"                { return Cpp2Types.MOVE; }
      "forward"             { return Cpp2Types.FORWARD; }
      
      "virtual"             { return Cpp2Types.VIRTUAL; }
      "override"            { return Cpp2Types.OVERRIDE; }
      "final"               { return Cpp2Types.FINAL; }
      
      {WHITESPACE}          { return TokenType.WHITE_SPACE; }
      
      {IDENTIFIER_WORD}     { return Cpp2Types.IDENTIFIER_WORD; }
      {NUMBER_LITERAL}      { return Cpp2Types.NUMBER_LITERAL; }
      {STRING_LITERAL}      { return Cpp2Types.STRING_LITERAL; }
}

[^]                         { return TokenType.BAD_CHARACTER; }