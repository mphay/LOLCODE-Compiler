/*******************************************************************************
 *  This is the toplevel driver program for the Simple1 pretty printer.
 *  For language details please see the grammar file 'simple2.g'.
 *******************************************************************************/

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.*;

public class Compile {

    public static HashMap usageMap = new HashMap();

    public static void main(String[] args) throws Exception {

	// check if we have an input file, if not print out error and abort
	if (args.length == 0) {
	    System.out.println("Usage: java Compile <input file>");
	    System.exit(0);
	} else {
	    System.out.println("// Processing: " + args[0]);
	}

	// set up and initialize our lexer and parser objects
	// open up the input file
        ANTLRFileStream input = new ANTLRFileStream(args[0]);
	// create the lexer with the input stream
        simple1Lexer lexer = new simple1Lexer(input);
	// create a token stream for the parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
	// create a parser object with the token stream
        simple1Parser parser = new simple1Parser(tokens);
	
	// call the toplevel recursive descent parsing function to construct
	// our IR
        CommonTree ast = (CommonTree)parser.prog().getTree();
	//System.out.println("Parse Tree: "+ast.toStringTree());

	// tree node stream for tree parser
	CommonTreeNodeStream nodes = new CommonTreeNodeStream(ast);
	// create constant folder object
	fold folder = new fold(nodes);
	CommonTree newast = (CommonTree)folder.downup(ast, true);
	//System.out.println("Transformed Tree: "+ast.toStringTree());

	// tree node stream for code generator
	CommonTreeNodeStream newNodes = new CommonTreeNodeStream(newast);
	// create new tree parser
	gen generator = new gen(newNodes);

	String code = generator.prog();
	System.out.print(code);
    }
}