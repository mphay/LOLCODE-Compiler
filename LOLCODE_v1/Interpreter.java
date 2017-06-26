/*******************************************************************************
 *  This is the toplevel driver program for the stack machine  interpreter
 *  For language details please see the grammar file 'stack.g'.
 *******************************************************************************/

import org.antlr.runtime.*;
import java.util.*;

public class Interpreter {
    public static void main(String[] args) throws Exception {

	// check if we have an input file, if not print out error and abort
	if (args.length == 0) {
	    System.out.println("Usage: java Interpreter <input file>");
	    System.exit(0);
	} else {
	    System.out.println("Processing: " + args[0]);
	}

	// set up and initialize our lexer and parser objects
	// open up the input file
        ANTLRFileStream input = new ANTLRFileStream(args[0]);
	// create the lexer with the input stream
        stackLexer lexer = new stackLexer(input);
	// create a token stream for the parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
	// create a parser object with the token stream
        stackParser parser = new stackParser(tokens);
	
	// call the toplevel recursive descent parsing function to construct
	// our IR
        parser.prog();

	// execute the IR
	parser.program.run();

	// dump out the symbol table
	Set set = parser.memory.entrySet();
	Iterator i = set.iterator();
	System.out.print("Symbol Table: ");
	while(i.hasNext()) {
	    Map.Entry me = (Map.Entry)i.next();
	    System.out.print(me.getKey() + "->" + me.getValue() + " ");
	}
	System.out.println();
    }
}
