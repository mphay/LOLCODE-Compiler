// $ANTLR 3.5 gen.g 2015-12-17 18:44:40

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class gen extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCKSTMT", "COMMENT", "ESC_SEQ", 
		"NUM", "STMTLIST", "STRING", "VAR", "WS", "'('", "')'", "'*'", "'+'", 
		"'-'", "'/'", "';'", "'<='", "'='", "'=='", "'else'", "'get'", "'if'", 
		"'put'", "'while'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int BLOCKSTMT=4;
	public static final int COMMENT=5;
	public static final int ESC_SEQ=6;
	public static final int NUM=7;
	public static final int STMTLIST=8;
	public static final int STRING=9;
	public static final int VAR=10;
	public static final int WS=11;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public gen(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public gen(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return gen.tokenNames; }
	@Override public String getGrammarFileName() { return "gen.g"; }



	// $ANTLR start "prog"
	// gen.g:17:1: prog returns [String code] : ^( STMTLIST ( stmt )+ ) ;
	public final String prog() throws RecognitionException {
		String code = null;


		String stmt1 =null;

		try {
			// gen.g:18:5: ( ^( STMTLIST ( stmt )+ ) )
			// gen.g:18:7: ^( STMTLIST ( stmt )+ )
			{
			if ( state.backtracking==0 ) {code = "HAI \n";}
			match(input,STMTLIST,FOLLOW_STMTLIST_in_prog68); if (state.failed) return code;
			match(input, Token.DOWN, null); if (state.failed) return code;
			// gen.g:18:38: ( stmt )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==BLOCKSTMT||LA1_0==20||(LA1_0 >= 23 && LA1_0 <= 26)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// gen.g:18:39: stmt
					{
					pushFollow(FOLLOW_stmt_in_prog71);
					stmt1=stmt();
					state._fsp--;
					if (state.failed) return code;
					if ( state.backtracking==0 ) {code += stmt1;}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return code;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); if (state.failed) return code;

			if ( state.backtracking==0 ) {code += "KTHXBYE\n";}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "prog"



	// $ANTLR start "stmt"
	// gen.g:21:1: stmt returns [String code] : ( ^( '=' VAR exp ) | ^( 'get' VAR ) | ^( 'put' exp ) | ^( 'while' exp s= stmt ) | ^( 'if' exp s= stmt ) | ^( 'if' exp s1= stmt s2= stmt ) | ^( BLOCKSTMT (s= stmt )+ ) );
	public final String stmt() throws RecognitionException {
		String code = null;


		CommonTree VAR2=null;
		CommonTree VAR4=null;
		String s =null;
		String s1 =null;
		String s2 =null;
		String exp3 =null;
		String exp5 =null;
		String exp6 =null;
		String exp7 =null;
		String exp8 =null;

		try {
			// gen.g:22:2: ( ^( '=' VAR exp ) | ^( 'get' VAR ) | ^( 'put' exp ) | ^( 'while' exp s= stmt ) | ^( 'if' exp s= stmt ) | ^( 'if' exp s1= stmt s2= stmt ) | ^( BLOCKSTMT (s= stmt )+ ) )
			int alt3=7;
			switch ( input.LA(1) ) {
			case 20:
				{
				alt3=1;
				}
				break;
			case 23:
				{
				alt3=2;
				}
				break;
			case 25:
				{
				alt3=3;
				}
				break;
			case 26:
				{
				alt3=4;
				}
				break;
			case 24:
				{
				int LA3_5 = input.LA(2);
				if ( (synpred6_gen()) ) {
					alt3=5;
				}
				else if ( (synpred7_gen()) ) {
					alt3=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return code;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BLOCKSTMT:
				{
				alt3=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return code;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// gen.g:22:4: ^( '=' VAR exp )
					{
					match(input,20,FOLLOW_20_in_stmt101); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					VAR2=(CommonTree)match(input,VAR,FOLLOW_VAR_in_stmt103); if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_stmt105);
					exp3=exp();
					state._fsp--;
					if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) {
								  code = (VAR2!=null?VAR2.getText():null) + " R " + exp3 + "\n";		// assign a value to the variable
								}
					}
					break;
				case 2 :
					// gen.g:26:4: ^( 'get' VAR )
					{
					match(input,23,FOLLOW_23_in_stmt119); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					VAR4=(CommonTree)match(input,VAR,FOLLOW_VAR_in_stmt121); if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) {
								  code = "I HAS A " + (VAR4!=null?VAR4.getText():null)+"\n";			// declare a variable
								  code += "GIMMEH " + (VAR4!=null?VAR4.getText():null)+"\n";			// ask the user for an input and
															// read it into the variable
								}
					}
					break;
				case 3 :
					// gen.g:32:4: ^( 'put' exp )
					{
					match(input,25,FOLLOW_25_in_stmt133); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_stmt135);
					exp5=exp();
					state._fsp--;
					if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) {
								  code = "VISIBLE " + exp5+"\n";			// print the value
								}
					}
					break;
				case 4 :
					// gen.g:36:4: ^( 'while' exp s= stmt )
					{
					match(input,26,FOLLOW_26_in_stmt148); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_stmt150);
					exp6=exp();
					state._fsp--;
					if (state.failed) return code;
					pushFollow(FOLLOW_stmt_in_stmt154);
					s=stmt();
					state._fsp--;
					if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) { 							// while loop
					                    	  String label = "LOOP";		
					                          code = "IM IN YR " + label;				// begins loop
					                          code += "\n" + s;				// code to be executed in loop
								  code += exp6 + ", O RLY?\n";			// exit condition
								  code += "YA RLY \n" + s + "GTFO, OIC\n";	// breaks the loop	
						           	  code += "IM OUTTA YR " + label + "\n"; 		// end of loop
						           	}
					}
					break;
				case 5 :
					// gen.g:45:4: ^( 'if' exp s= stmt )
					{
					match(input,24,FOLLOW_24_in_stmt167); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_stmt169);
					exp7=exp();
					state._fsp--;
					if (state.failed) return code;
					pushFollow(FOLLOW_stmt_in_stmt173);
					s=stmt();
					state._fsp--;
					if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) {							// if statement 
					                          code = exp7 + ", O RLY?\n";			// condition
					                          code += "YA RLY \n" + s + "OIC\n";		// code executed if condition satisfied
						           	}
					}
					break;
				case 6 :
					// gen.g:50:4: ^( 'if' exp s1= stmt s2= stmt )
					{
					match(input,24,FOLLOW_24_in_stmt187); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_stmt189);
					exp8=exp();
					state._fsp--;
					if (state.failed) return code;
					pushFollow(FOLLOW_stmt_in_stmt193);
					s1=stmt();
					state._fsp--;
					if (state.failed) return code;
					pushFollow(FOLLOW_stmt_in_stmt197);
					s2=stmt();
					state._fsp--;
					if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) { 							// if stament with an else clause 
					                          code = exp8 + ", O RLY?\n";			// condition
					                          code += "YA RLY \n" + s1;			// code executed if condition satisfied  
					                          code += "NO WAI \n" + s2;			// else
					                          code += "OIC \n";					// end if statement
						           	}
					}
					break;
				case 7 :
					// gen.g:57:4: ^( BLOCKSTMT (s= stmt )+ )
					{
					if ( state.backtracking==0 ) {code = "";}
					match(input,BLOCKSTMT,FOLLOW_BLOCKSTMT_in_stmt213); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					// gen.g:57:30: (s= stmt )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==BLOCKSTMT||LA2_0==20||(LA2_0 >= 23 && LA2_0 <= 26)) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// gen.g:57:31: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt218);
							s=stmt();
							state._fsp--;
							if (state.failed) return code;
							if ( state.backtracking==0 ) {code += s;}
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							if (state.backtracking>0) {state.failed=true; return code;}
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					match(input, Token.UP, null); if (state.failed) return code;

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
		return code;
	}
	// $ANTLR end "stmt"



	// $ANTLR start "exp"
	// gen.g:60:1: exp returns [String code] : ( ^( '==' e1= exp e2= exp ) | ^( '<=' e1= exp e2= exp ) | ^( '+' e1= exp e2= exp ) | ^( '-' e1= exp e2= exp ) | ^( '*' e1= exp e2= exp ) | ^( '/' e1= exp e2= exp ) | VAR | NUM );
	public final String exp() throws RecognitionException {
		String code = null;


		CommonTree VAR9=null;
		CommonTree NUM10=null;
		String e1 =null;
		String e2 =null;

		try {
			// gen.g:62:2: ( ^( '==' e1= exp e2= exp ) | ^( '<=' e1= exp e2= exp ) | ^( '+' e1= exp e2= exp ) | ^( '-' e1= exp e2= exp ) | ^( '*' e1= exp e2= exp ) | ^( '/' e1= exp e2= exp ) | VAR | NUM )
			int alt4=8;
			switch ( input.LA(1) ) {
			case 21:
				{
				alt4=1;
				}
				break;
			case 19:
				{
				alt4=2;
				}
				break;
			case 15:
				{
				alt4=3;
				}
				break;
			case 16:
				{
				alt4=4;
				}
				break;
			case 14:
				{
				alt4=5;
				}
				break;
			case 17:
				{
				alt4=6;
				}
				break;
			case VAR:
				{
				alt4=7;
				}
				break;
			case NUM:
				{
				alt4=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return code;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// gen.g:62:4: ^( '==' e1= exp e2= exp )
					{
					match(input,21,FOLLOW_21_in_exp242); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp246);
					e1=exp();
					state._fsp--;
					if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp250);
					e2=exp();
					state._fsp--;
					if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) {code = "BOTH SAEM " + e1 + " AN " + e2;}
					}
					break;
				case 2 :
					// gen.g:63:4: ^( '<=' e1= exp e2= exp )
					{
					match(input,19,FOLLOW_19_in_exp266); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp270);
					e1=exp();
					state._fsp--;
					if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp274);
					e2=exp();
					state._fsp--;
					if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) {code = "BOTH SAEM " + e1 + " AN BIGGR OF " + e1 + " AN " + e2;}
					}
					break;
				case 3 :
					// gen.g:64:4: ^( '+' e1= exp e2= exp )
					{
					match(input,15,FOLLOW_15_in_exp286); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp290);
					e1=exp();
					state._fsp--;
					if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp294);
					e2=exp();
					state._fsp--;
					if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) {code = "SUM OF " + e1 + " AN " + e2;}
					}
					break;
				case 4 :
					// gen.g:65:4: ^( '-' e1= exp e2= exp )
					{
					match(input,16,FOLLOW_16_in_exp310); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp314);
					e1=exp();
					state._fsp--;
					if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp318);
					e2=exp();
					state._fsp--;
					if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) {code = "DIFF OF " + e1 + " AN " + e2;}
					}
					break;
				case 5 :
					// gen.g:66:4: ^( '*' e1= exp e2= exp )
					{
					match(input,14,FOLLOW_14_in_exp334); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp338);
					e1=exp();
					state._fsp--;
					if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp342);
					e2=exp();
					state._fsp--;
					if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) {code = "PRODUKT OF " + e1 + " AN " + e2;}
					}
					break;
				case 6 :
					// gen.g:67:4: ^( '/' e1= exp e2= exp )
					{
					match(input,17,FOLLOW_17_in_exp357); if (state.failed) return code;
					match(input, Token.DOWN, null); if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp361);
					e1=exp();
					state._fsp--;
					if (state.failed) return code;
					pushFollow(FOLLOW_exp_in_exp365);
					e2=exp();
					state._fsp--;
					if (state.failed) return code;
					match(input, Token.UP, null); if (state.failed) return code;

					if ( state.backtracking==0 ) {code = "QUOSHUNT OF " + e1 + " AN " + e2;}
					}
					break;
				case 7 :
					// gen.g:68:4: VAR
					{
					VAR9=(CommonTree)match(input,VAR,FOLLOW_VAR_in_exp379); if (state.failed) return code;
					if ( state.backtracking==0 ) {code = (VAR9!=null?VAR9.getText():null);}
					}
					break;
				case 8 :
					// gen.g:69:4: NUM
					{
					NUM10=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp398); if (state.failed) return code;
					if ( state.backtracking==0 ) {code = (NUM10!=null?NUM10.getText():null);}
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
		return code;
	}
	// $ANTLR end "exp"

	// $ANTLR start synpred6_gen
	public final void synpred6_gen_fragment() throws RecognitionException {
		String s =null;

		// gen.g:45:4: ( ^( 'if' exp s= stmt ) )
		// gen.g:45:4: ^( 'if' exp s= stmt )
		{
		match(input,24,FOLLOW_24_in_synpred6_gen167); if (state.failed) return;
		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_exp_in_synpred6_gen169);
		exp();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_stmt_in_synpred6_gen173);
		s=stmt();
		state._fsp--;
		if (state.failed) return;
		match(input, Token.UP, null); if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_gen

	// $ANTLR start synpred7_gen
	public final void synpred7_gen_fragment() throws RecognitionException {
		String s1 =null;
		String s2 =null;

		// gen.g:50:4: ( ^( 'if' exp s1= stmt s2= stmt ) )
		// gen.g:50:4: ^( 'if' exp s1= stmt s2= stmt )
		{
		match(input,24,FOLLOW_24_in_synpred7_gen187); if (state.failed) return;
		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_exp_in_synpred7_gen189);
		exp();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_stmt_in_synpred7_gen193);
		s1=stmt();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_stmt_in_synpred7_gen197);
		s2=stmt();
		state._fsp--;
		if (state.failed) return;
		match(input, Token.UP, null); if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_gen

	// Delegated rules

	public final boolean synpred6_gen() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_gen_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_gen() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_gen_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_STMTLIST_in_prog68 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stmt_in_prog71 = new BitSet(new long[]{0x0000000007900018L});
	public static final BitSet FOLLOW_20_in_stmt101 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_stmt103 = new BitSet(new long[]{0x00000000002BC480L});
	public static final BitSet FOLLOW_exp_in_stmt105 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_stmt119 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_stmt121 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_25_in_stmt133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_stmt135 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_stmt148 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_stmt150 = new BitSet(new long[]{0x0000000007900010L});
	public static final BitSet FOLLOW_stmt_in_stmt154 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_stmt167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_stmt169 = new BitSet(new long[]{0x0000000007900010L});
	public static final BitSet FOLLOW_stmt_in_stmt173 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_stmt187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_stmt189 = new BitSet(new long[]{0x0000000007900010L});
	public static final BitSet FOLLOW_stmt_in_stmt193 = new BitSet(new long[]{0x0000000007900010L});
	public static final BitSet FOLLOW_stmt_in_stmt197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCKSTMT_in_stmt213 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stmt_in_stmt218 = new BitSet(new long[]{0x0000000007900018L});
	public static final BitSet FOLLOW_21_in_exp242 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_exp246 = new BitSet(new long[]{0x00000000002BC480L});
	public static final BitSet FOLLOW_exp_in_exp250 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_19_in_exp266 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_exp270 = new BitSet(new long[]{0x00000000002BC480L});
	public static final BitSet FOLLOW_exp_in_exp274 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_15_in_exp286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_exp290 = new BitSet(new long[]{0x00000000002BC480L});
	public static final BitSet FOLLOW_exp_in_exp294 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_16_in_exp310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_exp314 = new BitSet(new long[]{0x00000000002BC480L});
	public static final BitSet FOLLOW_exp_in_exp318 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_14_in_exp334 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_exp338 = new BitSet(new long[]{0x00000000002BC480L});
	public static final BitSet FOLLOW_exp_in_exp342 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_17_in_exp357 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_exp361 = new BitSet(new long[]{0x00000000002BC480L});
	public static final BitSet FOLLOW_exp_in_exp365 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_exp379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_exp398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_synpred6_gen167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_synpred6_gen169 = new BitSet(new long[]{0x0000000007900010L});
	public static final BitSet FOLLOW_stmt_in_synpred6_gen173 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_synpred7_gen187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exp_in_synpred7_gen189 = new BitSet(new long[]{0x0000000007900010L});
	public static final BitSet FOLLOW_stmt_in_synpred7_gen193 = new BitSet(new long[]{0x0000000007900010L});
	public static final BitSet FOLLOW_stmt_in_synpred7_gen197 = new BitSet(new long[]{0x0000000000000008L});
}
