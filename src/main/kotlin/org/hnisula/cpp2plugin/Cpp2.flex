package org.hnisula.cpp2plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.hnisula.cpp2plugin.psi.Cpp2Types;
import com.intellij.psi.TokenType;

%%

%class Cpp2Lexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

LINE_WHITESPACE     = [\ \t]
EOL_WHITESPACE      = [\n\f\r]
WHITESPACE          = ({LINE_WHITESPACE} | {EOL_WHITESPACE})+

INT_SUFFIX          = [uU]([lL]{1,2})? | [lL]{1,2}[uU]?
BIN_PREFIX          = "0"[bB]
OCT_PREFIX          = "0"
HEX_PREFIX          = "0"[xX]
EXPONENT            = "e"-?([0-9])+
BIN_EXPONENT        = "p"-?([0-9])+
FLOAT_SUFFIX        = [fFlL]

BIN_LITERAL         = -?{BIN_PREFIX}[01']+{INT_SUFFIX}?
OCT_LITERAL         = -?{OCT_PREFIX}[0-7']+{INT_SUFFIX}?
DEC_LITERAL         = -?[0-9][0-9']*{INT_SUFFIX}?
HEX_LITERAL         = -?{HEX_PREFIX}[a-fA-F0-9']+{INT_SUFFIX}?

INT_LITERAL         = {BIN_LITERAL} | {OCT_LITERAL} | {DEC_LITERAL} | {HEX_LITERAL}
FLOAT_LITERAL       = -?[0-9][0-9']*("."[0-9']*)?({EXPONENT}|{BIN_EXPONENT})?{FLOAT_SUFFIX}?
BOOL_LITERAL        = "true" | "false"
CHAR_LITERAL        = ("u8" | "u" | "U" | "L")?\' (\\\' | [^\'])* \'

IDENTIFIER_WORD     = [a-zA-Z_][a-zA-Z0-9_]*

LINE_COMMENT        = "//".*
BLOCK_COMMENT       = "/\*".*"\*/"

METAFUNCTION        = "@"{IDENTIFIER_WORD}

STRING_START        = ("u8" | "u" | "U" | "L")?"\""
STRING_END          = "\""
STRING_SEGMENT      = [^(\"]+
INTERPOLATION_START = "("
INTERPOLATION_END   = ")$"
//FILL_CHAR           = [^\[\]]
//TYPE_CHAR           = [dxXfeEgaAcs]

%state IN_STRING

%%

<YYINITIAL> {
      {LINE_COMMENT}        { return Cpp2Types.LINE_COMMENT; }
      {BLOCK_COMMENT}       { return Cpp2Types.BLOCK_COMMENT; }
      
      "<=>"                 { return Cpp2Types.SPACESHIP; }
      
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
      "+="                  { return Cpp2Types.PLUSEQ; }
      "-="                  { return Cpp2Types.MINUSEQ; }
      "*="                  { return Cpp2Types.ASTERISKEQ; }
      "/="                  { return Cpp2Types.SLASHEQ; }
      
      ":"                   { return Cpp2Types.COLON; }
      ";"                   { return Cpp2Types.SEMICOLON; }
      "{"                   { return Cpp2Types.LEFT_BRACE; }
      "}"                   { return Cpp2Types.RIGHT_BRACE; }
      "("                   { return Cpp2Types.LEFT_PARENTHESIS; }
      ")"                   { return Cpp2Types.RIGHT_PARENTHESIS; }
      "["                   { return Cpp2Types.LEFT_BRACKET; }
      "]"                   { return Cpp2Types.RIGHT_BRACKET; }
      "<"                   { return Cpp2Types.LT; }
      ">"                   { return Cpp2Types.GT; }
      "="                   { return Cpp2Types.EQ; }
      "_"                   { return Cpp2Types.WILDCARD; }
      "*"                   { return Cpp2Types.ASTERISK; }
      "+"                   { return Cpp2Types.PLUS; }
      "-"                   { return Cpp2Types.MINUS; }
      "/"                   { return Cpp2Types.SLASH; }
      "%"                   { return Cpp2Types.MODULO; }
      "&"                   { return Cpp2Types.AND; }
      "|"                   { return Cpp2Types.OR; }
      "^"                   { return Cpp2Types.EXP; }
      "~"                   { return Cpp2Types.TILDE; }
      "."                   { return Cpp2Types.DOT; }
      ","                   { return Cpp2Types.COMMA; }
      "!"                   { return Cpp2Types.EXCLAMATION; }
      "$"                   { return Cpp2Types.DOLLAR; }
      "#"                   { return Cpp2Types.HASHTAG; }
      
      "0"                   { return Cpp2Types.ZERO; }
      
      "type"                { return Cpp2Types.TYPE_WORD; }
      "this"                { return Cpp2Types.THIS; }
      "public"              { return Cpp2Types.PUBLIC; }
      "protected"           { return Cpp2Types.PROTECTED; }
      "private"             { return Cpp2Types.PRIVATE; }
      "namespace"           { return Cpp2Types.NAMESPACE; }
      "using"               { return Cpp2Types.USING; }
      
      "for"                 { return Cpp2Types.FOR; }
      "while"               { return Cpp2Types.WHILE; }
      "do"                  { return Cpp2Types.DO; }
      "next"                { return Cpp2Types.NEXT; }
      "if"                  { return Cpp2Types.IF; }
      "else"                { return Cpp2Types.ELSE; }
      "next"                { return Cpp2Types.NEXT; }
      "const"               { return Cpp2Types.CONST; }
      "return"              { return Cpp2Types.RETURN; }
      "break"               { return Cpp2Types.BREAK; }
      "continue"            { return Cpp2Types.CONTINUE; }
      
      "in"                  { return Cpp2Types.IN; }
      "copy"                { return Cpp2Types.COPY; }
      "inout"               { return Cpp2Types.INOUT; }
      "out"                 { return Cpp2Types.OUT; }
      "move"                { return Cpp2Types.MOVE; }
      "forward"             { return Cpp2Types.FORWARD; }
      "forward_ref"         { return Cpp2Types.FORWARD_REF; }
      
      "virtual"             { return Cpp2Types.VIRTUAL; }
      "override"            { return Cpp2Types.OVERRIDE; }
      "final"               { return Cpp2Types.FINAL; }
      
      {WHITESPACE}          { return TokenType.WHITE_SPACE; }
      
      {STRING_START}        { yybegin(IN_STRING); return Cpp2Types.STRING_START; }
      {INTERPOLATION_END}   { yybegin(IN_STRING); return Cpp2Types.INTERPOLATION_END; }
      //{FILL_CHAR}           { return Cpp2Types.FILL_CHAR; }
      //{TYPE_CHAR}           { return Cpp2Types.TYPE_CHAR; }
      
      {INT_LITERAL}         { return Cpp2Types.INT_LITERAL; }
      {FLOAT_LITERAL}       { return Cpp2Types.FLOAT_LITERAL; }
      {BOOL_LITERAL}        { return Cpp2Types.BOOL_LITERAL; }
      {CHAR_LITERAL}        { return Cpp2Types.CHAR_LITERAL; }
      {IDENTIFIER_WORD}     { return Cpp2Types.IDENTIFIER_WORD; }
      {METAFUNCTION}        { return Cpp2Types.METAFUNCTION; }
}

<IN_STRING> {
      {STRING_SEGMENT}      { return Cpp2Types.STRING_SEGMENT; }
      {INTERPOLATION_START} { yybegin(YYINITIAL); return Cpp2Types.INTERPOLATION_START; }
      {STRING_END}          { yybegin(YYINITIAL); return Cpp2Types.STRING_END; }
}

[^]                         { return TokenType.BAD_CHARACTER; }