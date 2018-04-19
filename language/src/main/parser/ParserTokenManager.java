/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package parser;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import com.oracle.truffle.api.source.Source;
import uri.SLLanguage;
import nodes.SLExpressionNode;
import nodes.SLRootNode;
import nodes.SLStatementNode;

/** Token Manager. */
public class ParserTokenManager implements ParserConstants
{
    void CommonTokenAction(Token t)
    {
        UToken token = (UToken) t;
        token.charPos = input_stream.tokenBegin;
        token.val = t.image;
    }

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x4000000L) != 0L)
            return 11;
         if ((active0 & 0x3ff00L) != 0L)
         {
            jjmatchedKind = 40;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0x3ef00L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 1;
            return 1;
         }
         if ((active0 & 0x1000L) != 0L)
            return 1;
         return -1;
      case 2:
         if ((active0 & 0x3eb00L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 2;
            return 1;
         }
         if ((active0 & 0x400L) != 0L)
            return 1;
         return -1;
      case 3:
         if ((active0 & 0x3cb00L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 3;
            return 1;
         }
         if ((active0 & 0x2000L) != 0L)
            return 1;
         return -1;
      case 4:
         if ((active0 & 0x28a00L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x14100L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0x28200L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x800L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0x28000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 6;
            return 1;
         }
         if ((active0 & 0x200L) != 0L)
            return 1;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 40:
         return jjStopAtPos(0, 31);
      case 41:
         return jjStopAtPos(0, 32);
      case 42:
         return jjStopAtPos(0, 25);
      case 43:
         return jjStopAtPos(0, 27);
      case 44:
         return jjStopAtPos(0, 38);
      case 45:
         return jjStopAtPos(0, 28);
      case 46:
         return jjStopAtPos(0, 39);
      case 47:
         return jjStartNfaWithStates_0(0, 26, 11);
      case 59:
         return jjStopAtPos(0, 37);
      case 60:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 61:
         jjmatchedKind = 18;
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 62:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 91:
         return jjStopAtPos(0, 35);
      case 93:
         return jjStopAtPos(0, 36);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x20100L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x8400L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x2200L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 123:
         return jjStopAtPos(0, 33);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 125:
         return jjStopAtPos(0, 34);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         break;
      case 61:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         else if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(1, 22);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8c00L);
      case 102:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(1, 12, 1);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x2100L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 124:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 102:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0xa00L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x8800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 1);
         break;
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 107:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 1);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 115:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 110:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(5, 11, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000L);
      case 115:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(6, 9, 1);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(7, 17, 1);
         break;
      case 114:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(7, 15, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 22;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                     jjCheckNAdd(4);
                  }
                  else if (curChar == 47)
                     jjAddStates(0, 1);
                  else if (curChar == 34)
                     jjCheckNAddStates(2, 4);
                  else if (curChar == 48)
                  {
                     if (kind > 44)
                        kind = 44;
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 40)
                        kind = 40;
                     jjCheckNAdd(1);
                  }
                  break;
               case 11:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(17, 18);
                  else if (curChar == 47)
                     jjCheckNAddStates(5, 7);
                  break;
               case 1:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if (curChar == 48 && kind > 44)
                     kind = 44;
                  break;
               case 3:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAdd(4);
                  break;
               case 5:
                  if (curChar == 34)
                     jjCheckNAddStates(2, 4);
                  break;
               case 7:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 8:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 9:
                  if (curChar == 34 && kind > 45)
                     kind = 45;
                  break;
               case 10:
                  if (curChar == 47)
                     jjAddStates(0, 1);
                  break;
               case 12:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 13:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 14:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 15:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(17, 18);
                  break;
               case 17:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  break;
               case 18:
                  if (curChar == 42)
                     jjCheckNAddStates(8, 10);
                  break;
               case 19:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(20, 18);
                  break;
               case 20:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(20, 18);
                  break;
               case 21:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(1);
                  break;
               case 6:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 8:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 12:
                  jjAddStates(5, 7);
                  break;
               case 17:
                  jjCheckNAddTwoStates(17, 18);
                  break;
               case 19:
               case 20:
                  jjCheckNAddTwoStates(20, 18);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 8:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 4);
                  break;
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(5, 7);
                  break;
               case 17:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  break;
               case 19:
               case 20:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(20, 18);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 22 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   11, 16, 6, 8, 9, 12, 13, 15, 18, 19, 21, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\143\154\141\163\163", 
"\145\170\164\145\156\144\163", "\144\145\146", "\162\145\164\165\162\156", "\151\146", "\145\154\163\145", 
"\167\150\151\154\145", "\144\145\142\165\147\147\145\162", "\142\162\145\141\153", 
"\143\157\156\164\151\156\165\145", "\75", "\75\75", "\41\75", "\76", "\76\75", "\74", "\74\75", "\52", "\57", 
"\53", "\55", "\174\174", "\46\46", "\50", "\51", "\173", "\175", "\133", "\135", 
"\73", "\54", "\56", null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xb1ffffffff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[22];
private final int[] jjstateSet = new int[44];
protected char curChar;
/** Constructor. */
public ParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 22; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      CommonTokenAction(matchedToken);
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 47)
   {
      jjmatchedKind = 47;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         CommonTokenAction(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
