/* Generated By:JavaCC: Do not edit this line. ParserConstants.java */
package parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 6;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 7;
  /** RegularExpression Id. */
  int CLASS = 8;
  /** RegularExpression Id. */
  int EXTENDS = 9;
  /** RegularExpression Id. */
  int FUNCTION = 10;
  /** RegularExpression Id. */
  int RETURN = 11;
  /** RegularExpression Id. */
  int IF = 12;
  /** RegularExpression Id. */
  int ELSE = 13;
  /** RegularExpression Id. */
  int WHILE = 14;
  /** RegularExpression Id. */
  int DEBUGGER = 15;
  /** RegularExpression Id. */
  int BREAK = 16;
  /** RegularExpression Id. */
  int CONTINUE = 17;
  /** RegularExpression Id. */
  int ASSIGN = 18;
  /** RegularExpression Id. */
  int EQUAL = 19;
  /** RegularExpression Id. */
  int NOT_EQUAL = 20;
  /** RegularExpression Id. */
  int GT = 21;
  /** RegularExpression Id. */
  int GE = 22;
  /** RegularExpression Id. */
  int LT = 23;
  /** RegularExpression Id. */
  int LE = 24;
  /** RegularExpression Id. */
  int STAR = 25;
  /** RegularExpression Id. */
  int DIV = 26;
  /** RegularExpression Id. */
  int PLUS = 27;
  /** RegularExpression Id. */
  int MINUS = 28;
  /** RegularExpression Id. */
  int LOR = 29;
  /** RegularExpression Id. */
  int LAND = 30;
  /** RegularExpression Id. */
  int LPAREN = 31;
  /** RegularExpression Id. */
  int RPAREN = 32;
  /** RegularExpression Id. */
  int LCURLY = 33;
  /** RegularExpression Id. */
  int RCURLY = 34;
  /** RegularExpression Id. */
  int LBRACK = 35;
  /** RegularExpression Id. */
  int RBRACK = 36;
  /** RegularExpression Id. */
  int SEMI = 37;
  /** RegularExpression Id. */
  int COMMA = 38;
  /** RegularExpression Id. */
  int DOT = 39;
  /** RegularExpression Id. */
  int IDENTIFIER = 40;
  /** RegularExpression Id. */
  int LETTER = 41;
  /** RegularExpression Id. */
  int DIGIT = 42;
  /** RegularExpression Id. */
  int NON_ZERO_DIGIT = 43;
  /** RegularExpression Id. */
  int NUMERIC_LITERAL = 44;
  /** RegularExpression Id. */
  int STRING_LITERAL = 45;
  /** RegularExpression Id. */
  int ESC = 46;
  /** RegularExpression Id. */
  int ERROR = 47;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "<MULTI_LINE_COMMENT>",
    "\"class\"",
    "\"extends\"",
    "\"def\"",
    "\"return\"",
    "\"if\"",
    "\"else\"",
    "\"while\"",
    "\"debugger\"",
    "\"break\"",
    "\"continue\"",
    "\"=\"",
    "\"==\"",
    "\"!=\"",
    "\">\"",
    "\">=\"",
    "\"<\"",
    "\"<=\"",
    "\"*\"",
    "\"/\"",
    "\"+\"",
    "\"-\"",
    "\"||\"",
    "\"&&\"",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\";\"",
    "\",\"",
    "\".\"",
    "<IDENTIFIER>",
    "<LETTER>",
    "<DIGIT>",
    "<NON_ZERO_DIGIT>",
    "<NUMERIC_LITERAL>",
    "<STRING_LITERAL>",
    "<ESC>",
    "<ERROR>",
  };

}
