
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\025\000\002\002\005\000\002\002\004\000\002\002" +
    "\004\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\005\000\002\003\005\000" +
    "\002\003\003\000\002\004\005\000\002\004\003\000\002" +
    "\004\003\000\002\004\006\000\002\004\003\000\002\005" +
    "\005\000\002\005\005\000\002\005\005\000\002\005\005" +
    "\000\002\005\005\000\002\005\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\014\013\006\015\014\016\010\017\007\020" +
    "\011\001\002\000\022\004\ufff3\005\ufff3\006\ufff3\007\ufff3" +
    "\010\ufff3\011\ufff3\012\ufff3\014\ufff3\001\002\000\004\002" +
    "\054\001\002\000\014\013\006\015\014\016\010\017\007" +
    "\020\011\001\002\000\004\013\047\001\002\000\022\004" +
    "\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\011\ufff5\012\ufff5" +
    "\014\ufff5\001\002\000\016\021\035\022\040\023\036\024" +
    "\037\025\033\026\034\001\002\000\020\004\017\005\020" +
    "\006\023\007\021\010\022\011\016\012\015\001\002\000" +
    "\022\004\ufff8\005\ufff8\006\ufff8\007\ufff8\010\ufff8\011\ufff8" +
    "\012\ufff8\014\ufff8\001\002\000\022\004\ufff6\005\ufff6\006" +
    "\ufff6\007\ufff6\010\ufff6\011\ufff6\012\ufff6\014\ufff6\001\002" +
    "\000\014\013\006\015\014\016\010\017\007\020\011\001" +
    "\002\000\014\013\006\015\014\016\010\017\007\020\011" +
    "\001\002\000\016\002\uffff\013\006\015\014\016\010\017" +
    "\007\020\011\001\002\000\014\013\006\015\014\016\010" +
    "\017\007\020\011\001\002\000\014\013\006\015\014\016" +
    "\010\017\007\020\011\001\002\000\014\013\006\015\014" +
    "\016\010\017\007\020\011\001\002\000\014\013\006\015" +
    "\014\016\010\017\007\020\011\001\002\000\022\004\ufffd" +
    "\005\ufffd\006\ufffd\007\ufffd\010\ufffd\011\ufffd\012\ufffd\014" +
    "\ufffd\001\002\000\022\004\ufffb\005\ufffb\006\ufffb\007\ufffb" +
    "\010\ufffb\011\ufffb\012\ufffb\014\ufffb\001\002\000\022\004" +
    "\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc\011\ufffc\012\ufffc" +
    "\014\ufffc\001\002\000\022\004\ufffe\005\ufffe\006\ufffe\007" +
    "\ufffe\010\ufffe\011\ufffe\012\ufffe\014\ufffe\001\002\000\004" +
    "\002\001\001\002\000\022\004\ufffa\005\ufffa\006\ufffa\007" +
    "\ufffa\010\ufffa\011\ufffa\012\ufffa\014\ufffa\001\002\000\022" +
    "\004\ufff9\005\ufff9\006\ufff9\007\ufff9\010\ufff9\011\ufff9\012" +
    "\ufff9\014\ufff9\001\002\000\004\020\046\001\002\000\004" +
    "\020\045\001\002\000\004\020\044\001\002\000\004\020" +
    "\043\001\002\000\004\020\042\001\002\000\004\020\041" +
    "\001\002\000\022\004\ufff1\005\ufff1\006\ufff1\007\ufff1\010" +
    "\ufff1\011\ufff1\012\ufff1\014\ufff1\001\002\000\022\004\uffef" +
    "\005\uffef\006\uffef\007\uffef\010\uffef\011\uffef\012\uffef\014" +
    "\uffef\001\002\000\022\004\ufff0\005\ufff0\006\ufff0\007\ufff0" +
    "\010\ufff0\011\ufff0\012\ufff0\014\ufff0\001\002\000\022\004" +
    "\ufff2\005\ufff2\006\ufff2\007\ufff2\010\ufff2\011\ufff2\012\ufff2" +
    "\014\ufff2\001\002\000\022\004\uffed\005\uffed\006\uffed\007" +
    "\uffed\010\uffed\011\uffed\012\uffed\014\uffed\001\002\000\022" +
    "\004\uffee\005\uffee\006\uffee\007\uffee\010\uffee\011\uffee\012" +
    "\uffee\014\uffee\001\002\000\014\013\006\015\014\016\010" +
    "\017\007\020\011\001\002\000\020\005\020\006\023\007" +
    "\021\010\022\011\016\012\015\014\051\001\002\000\022" +
    "\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\011\ufff4\012" +
    "\ufff4\014\ufff4\001\002\000\020\005\020\006\023\007\021" +
    "\010\022\011\016\012\015\014\053\001\002\000\022\004" +
    "\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7\011\ufff7\012\ufff7" +
    "\014\ufff7\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\012\002\004\003\011\004\012\005\003\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\003\051" +
    "\004\012\005\003\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\004\031\005\003\001\001\000" +
    "\006\004\030\005\003\001\001\000\012\002\027\003\011" +
    "\004\012\005\003\001\001\000\006\004\026\005\003\001" +
    "\001\000\006\004\025\005\003\001\001\000\006\004\024" +
    "\005\003\001\001\000\006\004\023\005\003\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\003" +
    "\047\004\012\005\003\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // A ::= L pComa A 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= A EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // A ::= L pComa 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // L ::= L and J 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // L ::= L or J 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // L ::= L nand J 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // L ::= L nor J 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // L ::= L xor J 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // L ::= L xnor J 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // L ::= J 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // J ::= pA L pC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("J",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // J ::= trueT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("J",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // J ::= falseF 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("J",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // J ::= not pA L pC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("J",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // J ::= C 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("J",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // C ::= numero igual numero 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // C ::= numero distinto numero 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // C ::= numero menor numero 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // C ::= numero mayor numero 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // C ::= numero menorIgual numero 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // C ::= numero mayorIgual numero 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
