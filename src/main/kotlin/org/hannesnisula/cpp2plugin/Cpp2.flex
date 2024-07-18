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

//STRING_LITERAL = \" (\\. | [^\"\\])* \"
STRING_LITERAL = \" (\\\" | [^\"])* \"

IDENTIFIER = [a-zA-Z_][a-zA-Z0-9_]*

COMMENT = "//".*

%%

<YYINITIAL> {
      {COMMENT}             { return Cpp2Types.COMMENT; }
      {IDENTIFIER}          { return Cpp2Types.IDENTIFIER; }
      {NUMBER_LITERAL}      { return Cpp2Types.NUMBER_LITERAL; }
      {STRING_LITERAL}      { return Cpp2Types.STRING_LITERAL; }
      
      "="                   { return Cpp2Types.EQ; }
      ":"                   { return Cpp2Types.COLON; }
      ";"                   { return Cpp2Types.SEMICOLON; }
      
     {WHITESPACE}           { return TokenType.WHITE_SPACE; }
}

[^]                         { return TokenType.BAD_CHARACTER; }