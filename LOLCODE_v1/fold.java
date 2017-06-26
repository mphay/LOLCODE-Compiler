// $ANTLR 3.4 /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g 2011-10-07 12:22:30

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class fold extends TreeRewriter {
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
    public TreeRewriter[] getDelegates() {
        return new TreeRewriter[] {};
    }

    // delegators


    public fold(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public fold(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return fold.tokenNames; }
    public String getGrammarFileName() { return "/Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g"; }


    public static class bottomup_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bottomup"
    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:13:1: bottomup : exp ;
    public final fold.bottomup_return bottomup() throws RecognitionException {
        fold.bottomup_return retval = new fold.bottomup_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        fold.exp_return exp1 =null;



        try {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:13:9: ( exp )
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:13:12: exp
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exp_in_bottomup50);
            exp1=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) 
             
            if ( _first_0==null ) _first_0 = exp1.tree;


            if ( state.backtracking==1 ) {
            retval.tree = (CommonTree)_first_0;
            if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                retval.tree = (CommonTree)adaptor.getParent(retval.tree);
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
        return retval;
    }
    // $ANTLR end "bottomup"


    public static class exp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exp"
    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:15:1: exp : ( ^( '==' i= NUM j= NUM ) -> ^( NUM[String.valueOf(($i.int==$j.int)?1:0)] ) | ^( '<=' i= NUM j= NUM ) -> ^( NUM[String.valueOf(($i.int<=$j.int)?1:0)] ) | ^( '+' i= NUM j= NUM ) -> ^( NUM[String.valueOf($i.int+$j.int)] ) | ^( '-' i= NUM j= NUM ) -> ^( NUM[String.valueOf($i.int-$j.int)] ) | ^( '*' i= NUM j= NUM ) -> ^( NUM[String.valueOf($i.int*$j.int)] ) | ^( '/' i= NUM j= NUM ) -> ^( NUM[String.valueOf($i.int/$j.int)] ) );
    public final fold.exp_return exp() throws RecognitionException {
        fold.exp_return retval = new fold.exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree i=null;
        CommonTree j=null;
        CommonTree string_literal2=null;
        CommonTree string_literal3=null;
        CommonTree char_literal4=null;
        CommonTree char_literal5=null;
        CommonTree char_literal6=null;
        CommonTree char_literal7=null;

        CommonTree i_tree=null;
        CommonTree j_tree=null;
        CommonTree string_literal2_tree=null;
        CommonTree string_literal3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree char_literal7_tree=null;
        RewriteRuleNodeStream stream_21=new RewriteRuleNodeStream(adaptor,"token 21");
        RewriteRuleNodeStream stream_19=new RewriteRuleNodeStream(adaptor,"token 19");
        RewriteRuleNodeStream stream_17=new RewriteRuleNodeStream(adaptor,"token 17");
        RewriteRuleNodeStream stream_15=new RewriteRuleNodeStream(adaptor,"token 15");
        RewriteRuleNodeStream stream_16=new RewriteRuleNodeStream(adaptor,"token 16");
        RewriteRuleNodeStream stream_14=new RewriteRuleNodeStream(adaptor,"token 14");
        RewriteRuleNodeStream stream_NUM=new RewriteRuleNodeStream(adaptor,"token NUM");

        try {
            // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:15:6: ( ^( '==' i= NUM j= NUM ) -> ^( NUM[String.valueOf(($i.int==$j.int)?1:0)] ) | ^( '<=' i= NUM j= NUM ) -> ^( NUM[String.valueOf(($i.int<=$j.int)?1:0)] ) | ^( '+' i= NUM j= NUM ) -> ^( NUM[String.valueOf($i.int+$j.int)] ) | ^( '-' i= NUM j= NUM ) -> ^( NUM[String.valueOf($i.int-$j.int)] ) | ^( '*' i= NUM j= NUM ) -> ^( NUM[String.valueOf($i.int*$j.int)] ) | ^( '/' i= NUM j= NUM ) -> ^( NUM[String.valueOf($i.int/$j.int)] ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            case 14:
                {
                alt1=5;
                }
                break;
            case 17:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:15:8: ^( '==' i= NUM j= NUM )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    string_literal2=(CommonTree)match(input,21,FOLLOW_21_in_exp62); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_21.add(string_literal2);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = string_literal2;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    i=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp66); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(i);


                    _last = (CommonTree)input.LT(1);
                    j=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp70); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(j);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: NUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 15:28: -> ^( NUM[String.valueOf(($i.int==$j.int)?1:0)] )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:15:31: ^( NUM[String.valueOf(($i.int==$j.int)?1:0)] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NUM, String.valueOf(((i!=null?Integer.valueOf(i.getText()):0)==(j!=null?Integer.valueOf(j.getText()):0))?1:0))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:16:5: ^( '<=' i= NUM j= NUM )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    string_literal3=(CommonTree)match(input,19,FOLLOW_19_in_exp85); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_19.add(string_literal3);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = string_literal3;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    i=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp89); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(i);


                    _last = (CommonTree)input.LT(1);
                    j=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp93); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(j);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: NUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 16:25: -> ^( NUM[String.valueOf(($i.int<=$j.int)?1:0)] )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:16:28: ^( NUM[String.valueOf(($i.int<=$j.int)?1:0)] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NUM, String.valueOf(((i!=null?Integer.valueOf(i.getText()):0)<=(j!=null?Integer.valueOf(j.getText()):0))?1:0))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:17:4: ^( '+' i= NUM j= NUM )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    char_literal4=(CommonTree)match(input,15,FOLLOW_15_in_exp107); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_15.add(char_literal4);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = char_literal4;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    i=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp112); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(i);


                    _last = (CommonTree)input.LT(1);
                    j=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp116); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(j);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: NUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 17:24: -> ^( NUM[String.valueOf($i.int+$j.int)] )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:17:27: ^( NUM[String.valueOf($i.int+$j.int)] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NUM, String.valueOf((i!=null?Integer.valueOf(i.getText()):0)+(j!=null?Integer.valueOf(j.getText()):0)))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:18:5: ^( '-' i= NUM j= NUM )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    char_literal5=(CommonTree)match(input,16,FOLLOW_16_in_exp131); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_16.add(char_literal5);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = char_literal5;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    i=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp136); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(i);


                    _last = (CommonTree)input.LT(1);
                    j=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp140); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(j);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: NUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 18:25: -> ^( NUM[String.valueOf($i.int-$j.int)] )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:18:28: ^( NUM[String.valueOf($i.int-$j.int)] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NUM, String.valueOf((i!=null?Integer.valueOf(i.getText()):0)-(j!=null?Integer.valueOf(j.getText()):0)))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:19:5: ^( '*' i= NUM j= NUM )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    char_literal6=(CommonTree)match(input,14,FOLLOW_14_in_exp155); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_14.add(char_literal6);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = char_literal6;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    i=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp160); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(i);


                    _last = (CommonTree)input.LT(1);
                    j=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp164); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(j);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: NUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 19:25: -> ^( NUM[String.valueOf($i.int*$j.int)] )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:19:28: ^( NUM[String.valueOf($i.int*$j.int)] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NUM, String.valueOf((i!=null?Integer.valueOf(i.getText()):0)*(j!=null?Integer.valueOf(j.getText()):0)))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:20:5: ^( '/' i= NUM j= NUM )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    char_literal7=(CommonTree)match(input,17,FOLLOW_17_in_exp179); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_17.add(char_literal7);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = char_literal7;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    i=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp184); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(i);


                    _last = (CommonTree)input.LT(1);
                    j=(CommonTree)match(input,NUM,FOLLOW_NUM_in_exp188); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NUM.add(j);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: NUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 20:25: -> ^( NUM[String.valueOf($i.int/$j.int)] )
                    {
                        // /Users/lutz/Documents/Courses/2011/fall2011/csc402/code/SIMPLE2/fold.g:20:28: ^( NUM[String.valueOf($i.int/$j.int)] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NUM, String.valueOf((i!=null?Integer.valueOf(i.getText()):0)/(j!=null?Integer.valueOf(j.getText()):0)))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);
                    }

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
        return retval;
    }
    // $ANTLR end "exp"

    // Delegated rules


 

    public static final BitSet FOLLOW_exp_in_bottomup50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_exp62 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_in_exp66 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUM_in_exp70 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_19_in_exp85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_in_exp89 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUM_in_exp93 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_15_in_exp107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_in_exp112 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUM_in_exp116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_16_in_exp131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_in_exp136 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUM_in_exp140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_14_in_exp155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_in_exp160 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUM_in_exp164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_exp179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_in_exp184 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUM_in_exp188 = new BitSet(new long[]{0x0000000000000008L});

}