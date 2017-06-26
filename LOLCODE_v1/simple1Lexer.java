// $ANTLR 3.4 /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g 2011-10-07 13:32:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class simple1Lexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public simple1Lexer() {} 
    public simple1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public simple1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:2:7: ( '(' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:2:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:3:7: ( ')' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:3:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:4:7: ( '*' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:4:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:5:7: ( '+' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:5:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:6:7: ( '-' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:6:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:7:7: ( '/' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:7:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:8:7: ( ';' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:8:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:9:7: ( '<=' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:9:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:10:7: ( '=' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:10:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:11:7: ( '==' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:11:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:12:7: ( 'else' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:12:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:13:7: ( 'get' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:13:9: 'get'
            {
            match("get"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:14:7: ( 'if' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:14:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:15:7: ( 'put' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:15:9: 'put'
            {
            match("put"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:16:7: ( 'while' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:16:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:17:7: ( '{' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:18:7: ( '}' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:53:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:53:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:53:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:54:6: ( ( '0' .. '9' )+ )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:54:8: ( '0' .. '9' )+
            {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:54:8: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:55:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:55:14: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:55:19: (~ ( '\\n' | '\\r' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:55:33: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:55:33: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:56:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:56:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:57:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:57:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:57:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:57:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:57:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:60:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:60:14: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    public void mTokens() throws RecognitionException {
        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | VAR | NUM | COMMENT | WS | STRING )
        int alt6=22;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt6=1;
            }
            break;
        case ')':
            {
            alt6=2;
            }
            break;
        case '*':
            {
            alt6=3;
            }
            break;
        case '+':
            {
            alt6=4;
            }
            break;
        case '-':
            {
            alt6=5;
            }
            break;
        case '/':
            {
            int LA6_6 = input.LA(2);

            if ( (LA6_6=='/') ) {
                alt6=20;
            }
            else {
                alt6=6;
            }
            }
            break;
        case ';':
            {
            alt6=7;
            }
            break;
        case '<':
            {
            alt6=8;
            }
            break;
        case '=':
            {
            int LA6_9 = input.LA(2);

            if ( (LA6_9=='=') ) {
                alt6=10;
            }
            else {
                alt6=9;
            }
            }
            break;
        case 'e':
            {
            int LA6_10 = input.LA(2);

            if ( (LA6_10=='l') ) {
                int LA6_25 = input.LA(3);

                if ( (LA6_25=='s') ) {
                    int LA6_30 = input.LA(4);

                    if ( (LA6_30=='e') ) {
                        int LA6_35 = input.LA(5);

                        if ( ((LA6_35 >= '0' && LA6_35 <= '9')||(LA6_35 >= 'A' && LA6_35 <= 'Z')||LA6_35=='_'||(LA6_35 >= 'a' && LA6_35 <= 'z')) ) {
                            alt6=18;
                        }
                        else {
                            alt6=11;
                        }
                    }
                    else {
                        alt6=18;
                    }
                }
                else {
                    alt6=18;
                }
            }
            else {
                alt6=18;
            }
            }
            break;
        case 'g':
            {
            int LA6_11 = input.LA(2);

            if ( (LA6_11=='e') ) {
                int LA6_26 = input.LA(3);

                if ( (LA6_26=='t') ) {
                    int LA6_31 = input.LA(4);

                    if ( ((LA6_31 >= '0' && LA6_31 <= '9')||(LA6_31 >= 'A' && LA6_31 <= 'Z')||LA6_31=='_'||(LA6_31 >= 'a' && LA6_31 <= 'z')) ) {
                        alt6=18;
                    }
                    else {
                        alt6=12;
                    }
                }
                else {
                    alt6=18;
                }
            }
            else {
                alt6=18;
            }
            }
            break;
        case 'i':
            {
            int LA6_12 = input.LA(2);

            if ( (LA6_12=='f') ) {
                int LA6_27 = input.LA(3);

                if ( ((LA6_27 >= '0' && LA6_27 <= '9')||(LA6_27 >= 'A' && LA6_27 <= 'Z')||LA6_27=='_'||(LA6_27 >= 'a' && LA6_27 <= 'z')) ) {
                    alt6=18;
                }
                else {
                    alt6=13;
                }
            }
            else {
                alt6=18;
            }
            }
            break;
        case 'p':
            {
            int LA6_13 = input.LA(2);

            if ( (LA6_13=='u') ) {
                int LA6_28 = input.LA(3);

                if ( (LA6_28=='t') ) {
                    int LA6_33 = input.LA(4);

                    if ( ((LA6_33 >= '0' && LA6_33 <= '9')||(LA6_33 >= 'A' && LA6_33 <= 'Z')||LA6_33=='_'||(LA6_33 >= 'a' && LA6_33 <= 'z')) ) {
                        alt6=18;
                    }
                    else {
                        alt6=14;
                    }
                }
                else {
                    alt6=18;
                }
            }
            else {
                alt6=18;
            }
            }
            break;
        case 'w':
            {
            int LA6_14 = input.LA(2);

            if ( (LA6_14=='h') ) {
                int LA6_29 = input.LA(3);

                if ( (LA6_29=='i') ) {
                    int LA6_34 = input.LA(4);

                    if ( (LA6_34=='l') ) {
                        int LA6_38 = input.LA(5);

                        if ( (LA6_38=='e') ) {
                            int LA6_40 = input.LA(6);

                            if ( ((LA6_40 >= '0' && LA6_40 <= '9')||(LA6_40 >= 'A' && LA6_40 <= 'Z')||LA6_40=='_'||(LA6_40 >= 'a' && LA6_40 <= 'z')) ) {
                                alt6=18;
                            }
                            else {
                                alt6=15;
                            }
                        }
                        else {
                            alt6=18;
                        }
                    }
                    else {
                        alt6=18;
                    }
                }
                else {
                    alt6=18;
                }
            }
            else {
                alt6=18;
            }
            }
            break;
        case '{':
            {
            alt6=16;
            }
            break;
        case '}':
            {
            alt6=17;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'f':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt6=18;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt6=19;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt6=21;
            }
            break;
        case '\"':
            {
            alt6=22;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;

        }

        switch (alt6) {
            case 1 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:40: T__17
                {
                mT__17(); 


                }
                break;
            case 7 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:46: T__18
                {
                mT__18(); 


                }
                break;
            case 8 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:52: T__19
                {
                mT__19(); 


                }
                break;
            case 9 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:58: T__20
                {
                mT__20(); 


                }
                break;
            case 10 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:64: T__21
                {
                mT__21(); 


                }
                break;
            case 11 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:70: T__22
                {
                mT__22(); 


                }
                break;
            case 12 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:76: T__23
                {
                mT__23(); 


                }
                break;
            case 13 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:82: T__24
                {
                mT__24(); 


                }
                break;
            case 14 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:88: T__25
                {
                mT__25(); 


                }
                break;
            case 15 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:94: T__26
                {
                mT__26(); 


                }
                break;
            case 16 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:100: T__27
                {
                mT__27(); 


                }
                break;
            case 17 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:106: T__28
                {
                mT__28(); 


                }
                break;
            case 18 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:112: VAR
                {
                mVAR(); 


                }
                break;
            case 19 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:116: NUM
                {
                mNUM(); 


                }
                break;
            case 20 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:120: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 21 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:128: WS
                {
                mWS(); 


                }
                break;
            case 22 :
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:1:131: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


 

}