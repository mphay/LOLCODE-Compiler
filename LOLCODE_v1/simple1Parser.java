// $ANTLR 3.4 /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g 2011-10-07 13:32:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class simple1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCKSTMT", "COMMENT", "ESC_SEQ", "NUM", "STMTLIST", "STRING", "VAR", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "';'", "'<='", "'='", "'=='", "'else'", "'get'", "'if'", "'put'", "'while'", "'{'", "'}'"
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public simple1Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public simple1Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return simple1Parser.tokenNames; }
    public String getGrammarFileName() { return "/Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g"; }


    // override the default error reporting functions
    public void reportError(RecognitionException e) {
        // call the Parser member function to report the error
        displayRecognitionError(this.getTokenNames(), e);
        // exit with error
        System.exit(1);
    }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:27:1: prog : ( stmt )+ -> ^( STMTLIST ( stmt )+ ) ;
    public final simple1Parser.prog_return prog() throws RecognitionException {
        simple1Parser.prog_return retval = new simple1Parser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        simple1Parser.stmt_return stmt1 =null;


        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:27:7: ( ( stmt )+ -> ^( STMTLIST ( stmt )+ ) )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:27:9: ( stmt )+
            {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:27:9: ( stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==VAR||(LA1_0 >= 23 && LA1_0 <= 27)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:27:10: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_prog47);
            	    stmt1=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 27:22: -> ^( STMTLIST ( stmt )+ )
            {
                // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:27:25: ^( STMTLIST ( stmt )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STMTLIST, "STMTLIST")
                , root_1);

                if ( !(stream_stmt.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:30:1: stmt : ( VAR '=' exp ( ';' )? -> ^( '=' VAR exp ) | 'get' VAR ( ';' )? -> ^( 'get' VAR ) | 'put' exp ( ';' )? -> ^( 'put' exp ) | 'while' '(' exp ')' s= stmt -> ^( 'while' exp $s) | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? -> ^( 'if' exp $s1 ( $s2)? ) | '{' ( stmt )+ '}' -> ^( BLOCKSTMT ( stmt )+ ) );
    public final simple1Parser.stmt_return stmt() throws RecognitionException {
        simple1Parser.stmt_return retval = new simple1Parser.stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VAR2=null;
        Token char_literal3=null;
        Token char_literal5=null;
        Token string_literal6=null;
        Token VAR7=null;
        Token char_literal8=null;
        Token string_literal9=null;
        Token char_literal11=null;
        Token string_literal12=null;
        Token char_literal13=null;
        Token char_literal15=null;
        Token string_literal16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        Token string_literal20=null;
        Token char_literal21=null;
        Token char_literal23=null;
        simple1Parser.stmt_return s =null;

        simple1Parser.stmt_return s1 =null;

        simple1Parser.stmt_return s2 =null;

        simple1Parser.exp_return exp4 =null;

        simple1Parser.exp_return exp10 =null;

        simple1Parser.exp_return exp14 =null;

        simple1Parser.exp_return exp18 =null;

        simple1Parser.stmt_return stmt22 =null;


        CommonTree VAR2_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree string_literal6_tree=null;
        CommonTree VAR7_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree string_literal9_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree string_literal12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree string_literal16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree string_literal20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree char_literal23_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:30:6: ( VAR '=' exp ( ';' )? -> ^( '=' VAR exp ) | 'get' VAR ( ';' )? -> ^( 'get' VAR ) | 'put' exp ( ';' )? -> ^( 'put' exp ) | 'while' '(' exp ')' s= stmt -> ^( 'while' exp $s) | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? -> ^( 'if' exp $s1 ( $s2)? ) | '{' ( stmt )+ '}' -> ^( BLOCKSTMT ( stmt )+ ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 24:
                {
                alt7=5;
                }
                break;
            case 27:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:30:8: VAR '=' exp ( ';' )?
                    {
                    VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_stmt73);  
                    stream_VAR.add(VAR2);


                    char_literal3=(Token)match(input,20,FOLLOW_20_in_stmt75);  
                    stream_20.add(char_literal3);


                    pushFollow(FOLLOW_exp_in_stmt77);
                    exp4=exp();

                    state._fsp--;

                    stream_exp.add(exp4.getTree());

                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:30:20: ( ';' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==18) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:30:20: ';'
                            {
                            char_literal5=(Token)match(input,18,FOLLOW_18_in_stmt79);  
                            stream_18.add(char_literal5);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: exp, 20, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 30:32: -> ^( '=' VAR exp )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:30:35: ^( '=' VAR exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_20.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VAR.nextNode()
                        );

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:31:4: 'get' VAR ( ';' )?
                    {
                    string_literal6=(Token)match(input,23,FOLLOW_23_in_stmt102);  
                    stream_23.add(string_literal6);


                    VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_stmt104);  
                    stream_VAR.add(VAR7);


                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:31:14: ( ';' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==18) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:31:14: ';'
                            {
                            char_literal8=(Token)match(input,18,FOLLOW_18_in_stmt106);  
                            stream_18.add(char_literal8);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: VAR, 23
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 31:28: -> ^( 'get' VAR )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:31:31: ^( 'get' VAR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_23.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VAR.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:32:4: 'put' exp ( ';' )?
                    {
                    string_literal9=(Token)match(input,25,FOLLOW_25_in_stmt129);  
                    stream_25.add(string_literal9);


                    pushFollow(FOLLOW_exp_in_stmt131);
                    exp10=exp();

                    state._fsp--;

                    stream_exp.add(exp10.getTree());

                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:32:14: ( ';' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==18) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:32:14: ';'
                            {
                            char_literal11=(Token)match(input,18,FOLLOW_18_in_stmt133);  
                            stream_18.add(char_literal11);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: exp, 25
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 32:28: -> ^( 'put' exp )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:32:31: ^( 'put' exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_25.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:33:4: 'while' '(' exp ')' s= stmt
                    {
                    string_literal12=(Token)match(input,26,FOLLOW_26_in_stmt156);  
                    stream_26.add(string_literal12);


                    char_literal13=(Token)match(input,12,FOLLOW_12_in_stmt158);  
                    stream_12.add(char_literal13);


                    pushFollow(FOLLOW_exp_in_stmt160);
                    exp14=exp();

                    state._fsp--;

                    stream_exp.add(exp14.getTree());

                    char_literal15=(Token)match(input,13,FOLLOW_13_in_stmt162);  
                    stream_13.add(char_literal15);


                    pushFollow(FOLLOW_stmt_in_stmt166);
                    s=stmt();

                    state._fsp--;

                    stream_stmt.add(s.getTree());

                    // AST REWRITE
                    // elements: s, exp, 26
                    // token labels: 
                    // rule labels: retval, s
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 33:35: -> ^( 'while' exp $s)
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:33:38: ^( 'while' exp $s)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_26.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_1, stream_s.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:34:4: 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )?
                    {
                    string_literal16=(Token)match(input,24,FOLLOW_24_in_stmt186);  
                    stream_24.add(string_literal16);


                    char_literal17=(Token)match(input,12,FOLLOW_12_in_stmt188);  
                    stream_12.add(char_literal17);


                    pushFollow(FOLLOW_exp_in_stmt190);
                    exp18=exp();

                    state._fsp--;

                    stream_exp.add(exp18.getTree());

                    char_literal19=(Token)match(input,13,FOLLOW_13_in_stmt192);  
                    stream_13.add(char_literal19);


                    pushFollow(FOLLOW_stmt_in_stmt196);
                    s1=stmt();

                    state._fsp--;

                    stream_stmt.add(s1.getTree());

                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:34:29: ( 'else' s2= stmt )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==22) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:34:31: 'else' s2= stmt
                            {
                            string_literal20=(Token)match(input,22,FOLLOW_22_in_stmt200);  
                            stream_22.add(string_literal20);


                            pushFollow(FOLLOW_stmt_in_stmt204);
                            s2=stmt();

                            state._fsp--;

                            stream_stmt.add(s2.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: s2, s1, exp, 24
                    // token labels: 
                    // rule labels: retval, s2, s1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);
                    RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 34:49: -> ^( 'if' exp $s1 ( $s2)? )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:34:52: ^( 'if' exp $s1 ( $s2)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_24.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_1, stream_s1.nextTree());

                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:34:68: ( $s2)?
                        if ( stream_s2.hasNext() ) {
                            adaptor.addChild(root_1, stream_s2.nextTree());

                        }
                        stream_s2.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:35:4: '{' ( stmt )+ '}'
                    {
                    char_literal21=(Token)match(input,27,FOLLOW_27_in_stmt227);  
                    stream_27.add(char_literal21);


                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:35:8: ( stmt )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==VAR||(LA6_0 >= 23 && LA6_0 <= 27)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:35:9: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_stmt230);
                    	    stmt22=stmt();

                    	    state._fsp--;

                    	    stream_stmt.add(stmt22.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    char_literal23=(Token)match(input,28,FOLLOW_28_in_stmt234);  
                    stream_28.add(char_literal23);


                    // AST REWRITE
                    // elements: stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 35:24: -> ^( BLOCKSTMT ( stmt )+ )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:35:27: ^( BLOCKSTMT ( stmt )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(BLOCKSTMT, "BLOCKSTMT")
                        , root_1);

                        if ( !(stream_stmt.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_stmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_stmt.nextTree());

                        }
                        stream_stmt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class exp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exp"
    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:38:1: exp : relexp ;
    public final simple1Parser.exp_return exp() throws RecognitionException {
        simple1Parser.exp_return retval = new simple1Parser.exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        simple1Parser.relexp_return relexp24 =null;



        try {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:38:6: ( relexp )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:38:8: relexp
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relexp_in_exp258);
            relexp24=relexp();

            state._fsp--;

            adaptor.addChild(root_0, relexp24.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exp"


    public static class relexp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relexp"
    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:41:1: relexp : addexp ( ( '==' ^ addexp ) | ( '<=' ^ addexp ) )* ;
    public final simple1Parser.relexp_return relexp() throws RecognitionException {
        simple1Parser.relexp_return retval = new simple1Parser.relexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal26=null;
        Token string_literal28=null;
        simple1Parser.addexp_return addexp25 =null;

        simple1Parser.addexp_return addexp27 =null;

        simple1Parser.addexp_return addexp29 =null;


        CommonTree string_literal26_tree=null;
        CommonTree string_literal28_tree=null;

        try {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:41:9: ( addexp ( ( '==' ^ addexp ) | ( '<=' ^ addexp ) )* )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:41:11: addexp ( ( '==' ^ addexp ) | ( '<=' ^ addexp ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_addexp_in_relexp269);
            addexp25=addexp();

            state._fsp--;

            adaptor.addChild(root_0, addexp25.getTree());

            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:41:18: ( ( '==' ^ addexp ) | ( '<=' ^ addexp ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }
                else if ( (LA8_0==19) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:41:19: ( '==' ^ addexp )
            	    {
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:41:19: ( '==' ^ addexp )
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:41:20: '==' ^ addexp
            	    {
            	    string_literal26=(Token)match(input,21,FOLLOW_21_in_relexp273); 
            	    string_literal26_tree = 
            	    (CommonTree)adaptor.create(string_literal26)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal26_tree, root_0);


            	    pushFollow(FOLLOW_addexp_in_relexp277);
            	    addexp27=addexp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, addexp27.getTree());

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:41:37: ( '<=' ^ addexp )
            	    {
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:41:37: ( '<=' ^ addexp )
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:41:38: '<=' ^ addexp
            	    {
            	    string_literal28=(Token)match(input,19,FOLLOW_19_in_relexp283); 
            	    string_literal28_tree = 
            	    (CommonTree)adaptor.create(string_literal28)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal28_tree, root_0);


            	    pushFollow(FOLLOW_addexp_in_relexp287);
            	    addexp29=addexp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, addexp29.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relexp"


    public static class addexp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addexp"
    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:42:1: addexp : mulexp ( ( '+' ^ mulexp ) | ( '-' ^ mulexp ) )* ;
    public final simple1Parser.addexp_return addexp() throws RecognitionException {
        simple1Parser.addexp_return retval = new simple1Parser.addexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal31=null;
        Token char_literal33=null;
        simple1Parser.mulexp_return mulexp30 =null;

        simple1Parser.mulexp_return mulexp32 =null;

        simple1Parser.mulexp_return mulexp34 =null;


        CommonTree char_literal31_tree=null;
        CommonTree char_literal33_tree=null;

        try {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:42:8: ( mulexp ( ( '+' ^ mulexp ) | ( '-' ^ mulexp ) )* )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:42:10: mulexp ( ( '+' ^ mulexp ) | ( '-' ^ mulexp ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mulexp_in_addexp298);
            mulexp30=mulexp();

            state._fsp--;

            adaptor.addChild(root_0, mulexp30.getTree());

            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:42:17: ( ( '+' ^ mulexp ) | ( '-' ^ mulexp ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }
                else if ( (LA9_0==16) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:42:18: ( '+' ^ mulexp )
            	    {
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:42:18: ( '+' ^ mulexp )
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:42:19: '+' ^ mulexp
            	    {
            	    char_literal31=(Token)match(input,15,FOLLOW_15_in_addexp302); 
            	    char_literal31_tree = 
            	    (CommonTree)adaptor.create(char_literal31)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal31_tree, root_0);


            	    pushFollow(FOLLOW_mulexp_in_addexp306);
            	    mulexp32=mulexp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mulexp32.getTree());

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:42:35: ( '-' ^ mulexp )
            	    {
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:42:35: ( '-' ^ mulexp )
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:42:36: '-' ^ mulexp
            	    {
            	    char_literal33=(Token)match(input,16,FOLLOW_16_in_addexp312); 
            	    char_literal33_tree = 
            	    (CommonTree)adaptor.create(char_literal33)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal33_tree, root_0);


            	    pushFollow(FOLLOW_mulexp_in_addexp316);
            	    mulexp34=mulexp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mulexp34.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "addexp"


    public static class mulexp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mulexp"
    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:43:1: mulexp : atom ( ( '*' ^ atom ) | ( '/' ^ atom ) )* ;
    public final simple1Parser.mulexp_return mulexp() throws RecognitionException {
        simple1Parser.mulexp_return retval = new simple1Parser.mulexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal36=null;
        Token char_literal38=null;
        simple1Parser.atom_return atom35 =null;

        simple1Parser.atom_return atom37 =null;

        simple1Parser.atom_return atom39 =null;


        CommonTree char_literal36_tree=null;
        CommonTree char_literal38_tree=null;

        try {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:43:9: ( atom ( ( '*' ^ atom ) | ( '/' ^ atom ) )* )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:43:11: atom ( ( '*' ^ atom ) | ( '/' ^ atom ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_mulexp329);
            atom35=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom35.getTree());

            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:43:16: ( ( '*' ^ atom ) | ( '/' ^ atom ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }
                else if ( (LA10_0==17) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:43:17: ( '*' ^ atom )
            	    {
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:43:17: ( '*' ^ atom )
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:43:18: '*' ^ atom
            	    {
            	    char_literal36=(Token)match(input,14,FOLLOW_14_in_mulexp333); 
            	    char_literal36_tree = 
            	    (CommonTree)adaptor.create(char_literal36)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal36_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_mulexp337);
            	    atom37=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom37.getTree());

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:43:32: ( '/' ^ atom )
            	    {
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:43:32: ( '/' ^ atom )
            	    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:43:33: '/' ^ atom
            	    {
            	    char_literal38=(Token)match(input,17,FOLLOW_17_in_mulexp343); 
            	    char_literal38_tree = 
            	    (CommonTree)adaptor.create(char_literal38)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal38_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_mulexp347);
            	    atom39=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom39.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mulexp"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:45:1: atom : ( '(' exp ')' -> exp | VAR | NUM | '-' v= NUM -> ^( NUM[\"-\"+$v.text] ) );
    public final simple1Parser.atom_return atom() throws RecognitionException {
        simple1Parser.atom_return retval = new simple1Parser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token v=null;
        Token char_literal40=null;
        Token char_literal42=null;
        Token VAR43=null;
        Token NUM44=null;
        Token char_literal45=null;
        simple1Parser.exp_return exp41 =null;


        CommonTree v_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree VAR43_tree=null;
        CommonTree NUM44_tree=null;
        CommonTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:45:6: ( '(' exp ')' -> exp | VAR | NUM | '-' v= NUM -> ^( NUM[\"-\"+$v.text] ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt11=1;
                }
                break;
            case VAR:
                {
                alt11=2;
                }
                break;
            case NUM:
                {
                alt11=3;
                }
                break;
            case 16:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:45:8: '(' exp ')'
                    {
                    char_literal40=(Token)match(input,12,FOLLOW_12_in_atom359);  
                    stream_12.add(char_literal40);


                    pushFollow(FOLLOW_exp_in_atom361);
                    exp41=exp();

                    state._fsp--;

                    stream_exp.add(exp41.getTree());

                    char_literal42=(Token)match(input,13,FOLLOW_13_in_atom363);  
                    stream_13.add(char_literal42);


                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 45:23: -> exp
                    {
                        adaptor.addChild(root_0, stream_exp.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:46:4: VAR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    VAR43=(Token)match(input,VAR,FOLLOW_VAR_in_atom375); 
                    VAR43_tree = 
                    (CommonTree)adaptor.create(VAR43)
                    ;
                    adaptor.addChild(root_0, VAR43_tree);


                    }
                    break;
                case 3 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:47:4: NUM
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUM44=(Token)match(input,NUM,FOLLOW_NUM_in_atom380); 
                    NUM44_tree = 
                    (CommonTree)adaptor.create(NUM44)
                    ;
                    adaptor.addChild(root_0, NUM44_tree);


                    }
                    break;
                case 4 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:48:4: '-' v= NUM
                    {
                    char_literal45=(Token)match(input,16,FOLLOW_16_in_atom386);  
                    stream_16.add(char_literal45);


                    v=(Token)match(input,NUM,FOLLOW_NUM_in_atom389);  
                    stream_NUM.add(v);


                    // AST REWRITE
                    // elements: NUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 48:13: -> ^( NUM[\"-\"+$v.text] )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE1COMPILER/simple1.g:48:16: ^( NUM[\"-\"+$v.text] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NUM, "-"+(v!=null?v.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stmt_in_prog47 = new BitSet(new long[]{0x000000000F800402L});
    public static final BitSet FOLLOW_VAR_in_stmt73 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_stmt75 = new BitSet(new long[]{0x0000000000011480L});
    public static final BitSet FOLLOW_exp_in_stmt77 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_stmt79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_stmt102 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VAR_in_stmt104 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_stmt106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_stmt129 = new BitSet(new long[]{0x0000000000011480L});
    public static final BitSet FOLLOW_exp_in_stmt131 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_stmt133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_stmt156 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_stmt158 = new BitSet(new long[]{0x0000000000011480L});
    public static final BitSet FOLLOW_exp_in_stmt160 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_stmt162 = new BitSet(new long[]{0x000000000F800400L});
    public static final BitSet FOLLOW_stmt_in_stmt166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_stmt186 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_stmt188 = new BitSet(new long[]{0x0000000000011480L});
    public static final BitSet FOLLOW_exp_in_stmt190 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_stmt192 = new BitSet(new long[]{0x000000000F800400L});
    public static final BitSet FOLLOW_stmt_in_stmt196 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_stmt200 = new BitSet(new long[]{0x000000000F800400L});
    public static final BitSet FOLLOW_stmt_in_stmt204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_stmt227 = new BitSet(new long[]{0x000000000F800400L});
    public static final BitSet FOLLOW_stmt_in_stmt230 = new BitSet(new long[]{0x000000001F800400L});
    public static final BitSet FOLLOW_28_in_stmt234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relexp_in_exp258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addexp_in_relexp269 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_21_in_relexp273 = new BitSet(new long[]{0x0000000000011480L});
    public static final BitSet FOLLOW_addexp_in_relexp277 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_19_in_relexp283 = new BitSet(new long[]{0x0000000000011480L});
    public static final BitSet FOLLOW_addexp_in_relexp287 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_mulexp_in_addexp298 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_15_in_addexp302 = new BitSet(new long[]{0x0000000000011480L});
    public static final BitSet FOLLOW_mulexp_in_addexp306 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_16_in_addexp312 = new BitSet(new long[]{0x0000000000011480L});
    public static final BitSet FOLLOW_mulexp_in_addexp316 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_atom_in_mulexp329 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_14_in_mulexp333 = new BitSet(new long[]{0x0000000000011480L});
    public static final BitSet FOLLOW_atom_in_mulexp337 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_17_in_mulexp343 = new BitSet(new long[]{0x0000000000011480L});
    public static final BitSet FOLLOW_atom_in_mulexp347 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_12_in_atom359 = new BitSet(new long[]{0x0000000000011480L});
    public static final BitSet FOLLOW_exp_in_atom361 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_atom363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_atom375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_atom386 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUM_in_atom389 = new BitSet(new long[]{0x0000000000000002L});

}