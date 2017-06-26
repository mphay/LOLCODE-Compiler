// $ANTLR 3.4 stack.g 2012-10-23 20:55:18

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class stackParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "NUM", "STRING", "VAR", "WS", "':'", "';'", "'add'", "'ask'", "'div'", "'dup'", "'equ'", "'jump'", "'jumpF'", "'jumpT'", "'leq'", "'mul'", "'noop'", "'pop'", "'print'", "'push'", "'stop'", "'store'", "'sub'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int COMMENT=4;
    public static final int ESC_SEQ=5;
    public static final int NUM=6;
    public static final int STRING=7;
    public static final int VAR=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public stackParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public stackParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return stackParser.tokenNames; }
    public String getGrammarFileName() { return "stack.g"; }


        public Program program = new Program();
        public HashMap<String,Integer> memory = new HashMap<String,Integer>();
        public HashMap labelTable = new HashMap();
        public Stack<Integer> stack = new Stack<Integer>();


    protected static class prog_scope {
        String currentLabelDef;
    }
    protected Stack prog_stack = new Stack();



    // $ANTLR start "prog"
    // stack.g:22:1: prog : ( (l= labelDef )? s= stmt )+ ;
    public final void prog() throws RecognitionException {
        prog_stack.push(new prog_scope());
        String l =null;

        Instr s =null;


        try {
            // stack.g:27:2: ( ( (l= labelDef )? s= stmt )+ )
            // stack.g:27:4: ( (l= labelDef )? s= stmt )+
            {
            // stack.g:27:4: ( (l= labelDef )? s= stmt )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==VAR||(LA2_0 >= 12 && LA2_0 <= 28)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // stack.g:28:4: (l= labelDef )? s= stmt
            	    {
            	     ((prog_scope)prog_stack.peek()).currentLabelDef = null; 

            	    // stack.g:29:4: (l= labelDef )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==VAR) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // stack.g:29:5: l= labelDef
            	            {
            	            pushFollow(FOLLOW_labelDef_in_prog46);
            	            l=labelDef();

            	            state._fsp--;


            	             ((prog_scope)prog_stack.peek()).currentLabelDef = l; 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_stmt_in_prog59);
            	    s=stmt();

            	    state._fsp--;


            	     
            	    				if (((prog_scope)prog_stack.peek()).currentLabelDef!=null) labelTable.put(((prog_scope)prog_stack.peek()).currentLabelDef,s); 
            	    				program.addInstr(s); 
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            prog_stack.pop();
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "labelDef"
    // stack.g:38:1: labelDef returns [String name] : VAR ':' ;
    public final String labelDef() throws RecognitionException {
        String name = null;


        Token VAR1=null;

        try {
            // stack.g:39:2: ( VAR ':' )
            // stack.g:39:4: VAR ':'
            {
            VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_labelDef87); 

            match(input,10,FOLLOW_10_in_labelDef89); 

             name = (VAR1!=null?VAR1.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "labelDef"



    // $ANTLR start "stmt"
    // stack.g:42:1: stmt returns [Instr instr] : ( 'push' (v= variable ';' |n= number ';' ) | 'store' v= variable ';' | 'pop' ';' | 'print' ';' | 'ask' ';' | 'dup' ';' | 'add' ';' | 'sub' ';' | 'mul' ';' | 'div' ';' | 'equ' ';' | 'leq' ';' | 'jumpT' l= label ';' | 'jumpF' l= label ';' | 'jump' l= label ';' | 'noop' ';' | 'stop' m= message ';' );
    public final Instr stmt() throws RecognitionException {
        Instr instr = null;


        String v =null;

        String n =null;

        String l =null;

        String m =null;


        try {
            // stack.g:43:2: ( 'push' (v= variable ';' |n= number ';' ) | 'store' v= variable ';' | 'pop' ';' | 'print' ';' | 'ask' ';' | 'dup' ';' | 'add' ';' | 'sub' ';' | 'mul' ';' | 'div' ';' | 'equ' ';' | 'leq' ';' | 'jumpT' l= label ';' | 'jumpF' l= label ';' | 'jump' l= label ';' | 'noop' ';' | 'stop' m= message ';' )
            int alt4=17;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            case 13:
                {
                alt4=5;
                }
                break;
            case 15:
                {
                alt4=6;
                }
                break;
            case 12:
                {
                alt4=7;
                }
                break;
            case 28:
                {
                alt4=8;
                }
                break;
            case 21:
                {
                alt4=9;
                }
                break;
            case 14:
                {
                alt4=10;
                }
                break;
            case 16:
                {
                alt4=11;
                }
                break;
            case 20:
                {
                alt4=12;
                }
                break;
            case 19:
                {
                alt4=13;
                }
                break;
            case 18:
                {
                alt4=14;
                }
                break;
            case 17:
                {
                alt4=15;
                }
                break;
            case 22:
                {
                alt4=16;
                }
                break;
            case 26:
                {
                alt4=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // stack.g:43:6: 'push' (v= variable ';' |n= number ';' )
                    {
                    match(input,25,FOLLOW_25_in_stmt110); 

                    // stack.g:43:14: (v= variable ';' |n= number ';' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==VAR) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==NUM) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;

                    }
                    switch (alt3) {
                        case 1 :
                            // stack.g:43:15: v= variable ';'
                            {
                            pushFollow(FOLLOW_variable_in_stmt116);
                            v=variable();

                            state._fsp--;


                            match(input,11,FOLLOW_11_in_stmt118); 

                             instr = new VarInstr(v,stack,memory); 

                            }
                            break;
                        case 2 :
                            // stack.g:44:18: n= number ';'
                            {
                            pushFollow(FOLLOW_number_in_stmt142);
                            n=number();

                            state._fsp--;


                            match(input,11,FOLLOW_11_in_stmt144); 

                             instr = new NumInstr(n,stack);

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // stack.g:45:6: 'store' v= variable ';'
                    {
                    match(input,27,FOLLOW_27_in_stmt154); 

                    pushFollow(FOLLOW_variable_in_stmt158);
                    v=variable();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_stmt160); 

                     instr = new StoreInstr(v,memory,stack);

                    }
                    break;
                case 3 :
                    // stack.g:46:9: 'pop' ';'
                    {
                    match(input,23,FOLLOW_23_in_stmt172); 

                    match(input,11,FOLLOW_11_in_stmt174); 

                     instr = new StackInstr(StackInstr.Operation.POP,stack); 

                    }
                    break;
                case 4 :
                    // stack.g:47:9: 'print' ';'
                    {
                    match(input,24,FOLLOW_24_in_stmt199); 

                    match(input,11,FOLLOW_11_in_stmt201); 

                     instr = new StackInstr(StackInstr.Operation.PRI,stack); 

                    }
                    break;
                case 5 :
                    // stack.g:48:9: 'ask' ';'
                    {
                    match(input,13,FOLLOW_13_in_stmt224); 

                    match(input,11,FOLLOW_11_in_stmt226); 

                     instr = new StackInstr(StackInstr.Operation.ASK,stack); 

                    }
                    break;
                case 6 :
                    // stack.g:49:9: 'dup' ';'
                    {
                    match(input,15,FOLLOW_15_in_stmt251); 

                    match(input,11,FOLLOW_11_in_stmt253); 

                     instr = new StackInstr(StackInstr.Operation.DUP,stack); 

                    }
                    break;
                case 7 :
                    // stack.g:50:9: 'add' ';'
                    {
                    match(input,12,FOLLOW_12_in_stmt278); 

                    match(input,11,FOLLOW_11_in_stmt280); 

                     instr = new MathInstr(MathInstr.Operation.ADD,stack); 

                    }
                    break;
                case 8 :
                    // stack.g:51:9: 'sub' ';'
                    {
                    match(input,28,FOLLOW_28_in_stmt305); 

                    match(input,11,FOLLOW_11_in_stmt307); 

                     instr = new MathInstr(MathInstr.Operation.SUB,stack); 

                    }
                    break;
                case 9 :
                    // stack.g:52:9: 'mul' ';'
                    {
                    match(input,21,FOLLOW_21_in_stmt332); 

                    match(input,11,FOLLOW_11_in_stmt334); 

                     instr = new MathInstr(MathInstr.Operation.MUL,stack); 

                    }
                    break;
                case 10 :
                    // stack.g:53:9: 'div' ';'
                    {
                    match(input,14,FOLLOW_14_in_stmt359); 

                    match(input,11,FOLLOW_11_in_stmt361); 

                     instr = new MathInstr(MathInstr.Operation.DIV,stack); 

                    }
                    break;
                case 11 :
                    // stack.g:54:9: 'equ' ';'
                    {
                    match(input,16,FOLLOW_16_in_stmt386); 

                    match(input,11,FOLLOW_11_in_stmt388); 

                     instr = new MathInstr(MathInstr.Operation.EQU,stack); 

                    }
                    break;
                case 12 :
                    // stack.g:55:9: 'leq' ';'
                    {
                    match(input,20,FOLLOW_20_in_stmt413); 

                    match(input,11,FOLLOW_11_in_stmt415); 

                     instr = new MathInstr(MathInstr.Operation.LEQ,stack); 

                    }
                    break;
                case 13 :
                    // stack.g:56:6: 'jumpT' l= label ';'
                    {
                    match(input,19,FOLLOW_19_in_stmt437); 

                    pushFollow(FOLLOW_label_in_stmt441);
                    l=label();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_stmt446); 

                     instr = new JumpTFInstr(true,l,labelTable,stack); 

                    }
                    break;
                case 14 :
                    // stack.g:57:6: 'jumpF' l= label ';'
                    {
                    match(input,18,FOLLOW_18_in_stmt455); 

                    pushFollow(FOLLOW_label_in_stmt459);
                    l=label();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_stmt464); 

                     instr = new JumpTFInstr(false,l,labelTable,stack); 

                    }
                    break;
                case 15 :
                    // stack.g:58:4: 'jump' l= label ';'
                    {
                    match(input,17,FOLLOW_17_in_stmt471); 

                    pushFollow(FOLLOW_label_in_stmt476);
                    l=label();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_stmt481); 

                     instr = new JumpInstr(l,labelTable); 

                    }
                    break;
                case 16 :
                    // stack.g:59:9: 'noop' ';'
                    {
                    match(input,22,FOLLOW_22_in_stmt493); 

                    match(input,11,FOLLOW_11_in_stmt495); 

                     instr = new NoOpInstr(); 

                    }
                    break;
                case 17 :
                    // stack.g:60:6: 'stop' m= message ';'
                    {
                    match(input,26,FOLLOW_26_in_stmt516); 

                    pushFollow(FOLLOW_message_in_stmt521);
                    m=message();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_stmt524); 

                     instr = new StopInstr(m); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return instr;
    }
    // $ANTLR end "stmt"



    // $ANTLR start "number"
    // stack.g:63:1: number returns [String name] : NUM ;
    public final String number() throws RecognitionException {
        String name = null;


        Token NUM2=null;

        try {
            // stack.g:63:34: ( NUM )
            // stack.g:63:36: NUM
            {
            NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_number544); 

             name = (NUM2!=null?NUM2.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "number"



    // $ANTLR start "variable"
    // stack.g:64:1: variable returns [String name] : VAR ;
    public final String variable() throws RecognitionException {
        String name = null;


        Token VAR3=null;

        try {
            // stack.g:64:36: ( VAR )
            // stack.g:64:38: VAR
            {
            VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_variable564); 

             name = (VAR3!=null?VAR3.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "variable"



    // $ANTLR start "label"
    // stack.g:65:1: label returns [String name] : VAR ;
    public final String label() throws RecognitionException {
        String name = null;


        Token VAR4=null;

        try {
            // stack.g:65:34: ( VAR )
            // stack.g:65:36: VAR
            {
            VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_label586); 

             name = (VAR4!=null?VAR4.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "label"



    // $ANTLR start "message"
    // stack.g:66:1: message returns [String content] : ( STRING )? ;
    public final String message() throws RecognitionException {
        String content = null;


        Token STRING5=null;

        try {
            // stack.g:66:34: ( ( STRING )? )
            // stack.g:66:36: ( STRING )?
            {
            // stack.g:66:36: ( STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // stack.g:66:37: STRING
                    {
                    STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_message603); 

                     content = (STRING5!=null?STRING5.getText():null); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return content;
    }
    // $ANTLR end "message"

    // Delegated rules


 

    public static final BitSet FOLLOW_labelDef_in_prog46 = new BitSet(new long[]{0x000000001FFFF000L});
    public static final BitSet FOLLOW_stmt_in_prog59 = new BitSet(new long[]{0x000000001FFFF102L});
    public static final BitSet FOLLOW_VAR_in_labelDef87 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_labelDef89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_stmt110 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_variable_in_stmt116 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_stmt142 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_stmt154 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_stmt158 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_stmt172 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_stmt199 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_stmt224 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_stmt251 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_stmt278 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_stmt305 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_stmt332 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_stmt359 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_stmt386 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_stmt413 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_stmt437 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_label_in_stmt441 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_stmt455 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_label_in_stmt459 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_stmt471 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_label_in_stmt476 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_stmt493 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_stmt516 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_message_in_stmt521 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stmt524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_number544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variable564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_label586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_message603 = new BitSet(new long[]{0x0000000000000002L});

}