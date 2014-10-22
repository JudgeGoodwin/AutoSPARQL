/* DUDE_ParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. DUDE_ParserTokenManager.java */
package org.aksw.autosparql.tbsl.algorithm.sem.dudes.reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.aksw.autosparql.tbsl.algorithm.sem.drs.*;
import org.aksw.autosparql.tbsl.algorithm.sem.dudes.data.*;
import org.aksw.autosparql.tbsl.algorithm.sem.util.*;
import org.aksw.autosparql.tbsl.algorithm.sparql.Slot;
import org.aksw.autosparql.tbsl.algorithm.sparql.SlotType;

/** Token Manager. */
@SuppressWarnings("unused")public class DUDE_ParserTokenManager implements DUDE_ParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3ff2280L) != 0L)
         {
            jjmatchedKind = 27;
            return 4;
         }
         return -1;
      case 1:
         if ((active0 & 0x1802000L) != 0L)
            return 4;
         if ((active0 & 0x27f0280L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 1;
            }
            return 4;
         }
         return -1;
      case 2:
         if ((active0 & 0x2000L) != 0L)
            return 4;
         if ((active0 & 0x27f0280L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 2;
            return 4;
         }
         return -1;
      case 3:
         if ((active0 & 0x2190200L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 3;
            return 4;
         }
         if ((active0 & 0x660000L) != 0L)
            return 4;
         return -1;
      case 4:
         if ((active0 & 0x10000L) != 0L)
            return 4;
         if ((active0 & 0x2180200L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 4;
            return 4;
         }
         return -1;
      case 5:
         if ((active0 & 0x2180000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 5;
            return 4;
         }
         return -1;
      case 6:
         if ((active0 & 0x2080000L) != 0L)
            return 4;
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 6;
            return 4;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 10);
      case 41:
         return jjStopAtPos(0, 8);
      case 44:
         return jjStopAtPos(0, 2);
      case 47:
         return jjStopAtPos(0, 14);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 60:
         return jjStopAtPos(0, 1);
      case 61:
         return jjStopAtPos(0, 6);
      case 62:
         return jjStopAtPos(0, 5);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 72:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x420000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x802000L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x180000L);
      case 91:
         return jjStopAtPos(0, 3);
      case 93:
         return jjStopAtPos(0, 4);
      case 94:
         return jjStopAtPos(0, 15);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 124:
         return jjStopAtPos(0, 12);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 70:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x180000L);
      case 79:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x2062000L);
      case 82:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(1, 24, 4);
         break;
      case 86:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 91:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         break;
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x390000L);
      case 77:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 84:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 4);
         break;
      case 87:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(3, 7);
         break;
      case 69:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 4);
         break;
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 77:
         return jjMoveStringLiteralDfa4_0(active0, 0x2080000L);
      case 82:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 84:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 4);
         break;
      case 87:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 4);
         break;
      case 89:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 4);
         break;
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
      case 69:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 79:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 89:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 4);
         break;
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(5, 9);
         break;
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 78:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 83:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 83:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
      case 84:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(6, 19, 4);
         break;
      case 89:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(6, 25, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 84:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(7, 20, 4);
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
   0x0L, 0x0L, 0x0L, 0x9a50cfd59a50cfd5L
};
static final long[] jjbitVec1 = {
   0x0L, 0x1000000000c0000L, 0x0L, 0x0L
};
static final long[] jjbitVec2 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 11;
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
               case 4:
                  if ((0x3ff400800000000L & l) != 0L)
                     { jjCheckNAddTwoStates(3, 4); }
                  else if (curChar == 58)
                     { jjCheckNAdd(5); }
                  if ((0x3ff208000000000L & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     { jjCheckNAdd(2); }
                  }
                  break;
               case 0:
                  if ((0x3ff400800000000L & l) != 0L)
                     { jjCheckNAddTwoStates(3, 4); }
                  else if (curChar == 39)
                     { jjCheckNAdd(9); }
                  else if ((0x8000000200000000L & l) != 0L)
                     { jjCheckNAdd(7); }
                  if ((0x3ff208000000000L & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     { jjCheckNAdd(2); }
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if ((0x3ff208000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAdd(2); }
                  break;
               case 3:
                  if ((0x3ff400800000000L & l) != 0L)
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 5:
                  if ((0x3ff600800000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  { jjCheckNAdd(5); }
                  break;
               case 6:
                  if ((0x8000000200000000L & l) != 0L)
                     { jjCheckNAdd(7); }
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  { jjCheckNAdd(7); }
                  break;
               case 8:
                  if (curChar == 39)
                     { jjCheckNAdd(9); }
                  break;
               case 9:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(9, 10); }
                  break;
               case 10:
                  if (curChar == 39 && kind > 30)
                     kind = 30;
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
               case 4:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     { jjCheckNAddTwoStates(3, 4); }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     { jjCheckNAdd(2); }
                  }
                  break;
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     { jjCheckNAddTwoStates(3, 4); }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     { jjCheckNAdd(2); }
                  }
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAdd(2); }
                  break;
               case 3:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  { jjAddStates(0, 1); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 27)
                        kind = 27;
                     { jjCheckNAdd(2); }
                  }
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 0:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 27)
                        kind = 27;
                     { jjCheckNAdd(2); }
                  }
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 2:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAdd(2); }
                  break;
               case 3:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 5:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                     { jjAddStates(0, 1); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
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
      if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   9, 10,
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 1:
         return ((jjbitVec1[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      default :
         if ((jjbitVec2[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\74", "\54", "\133", "\135", "\76", "\75", "\162\145\163\50", "\51",
"\163\143\157\160\145\50", "\50", "\72\133", "\174", "\116\117\124", "\57", "\136",
"\105\126\105\122\131", "\115\117\123\124", "\123\117\115\105", "\124\110\105\115\117\123\124",
"\124\110\105\114\105\101\123\124", "\101\106\105\127", "\115\101\116\131", "\116\117", "\117\122",
"\110\117\127\115\101\116\131", null, null, null, null, null, null, null, null, null, };
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
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
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

    /** Constructor. */
    public DUDE_ParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public DUDE_ParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
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
    for (i = 11; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit( SimpleCharStream stream, int lexState)
  {

    ReInit( stream);
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

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7fffffffL,
};
static final long[] jjtoSkip = {
   0x780000000L,
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[11];
    private final int[] jjstateSet = new int[2 * 11];


    protected int curChar;
}
