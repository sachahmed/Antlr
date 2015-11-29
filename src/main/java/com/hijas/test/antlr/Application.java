package com.hijas.test.antlr;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;

/**
 * Created by SACHAHMED on 11/29/2015.
 */
public class Application {

    public static void main(String[] args) throws Exception{

        File source = new File("D:/Projects/Antlr/Sample C#");
        for(File csFile : source.listFiles()){

            String csFileName = csFile.getAbsolutePath();
            if(csFileName.endsWith("cs")){

                CSharpLexer lexer = new CSharpLexer(new ANTLRFileStream(csFileName));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CSharpParser parser = new CSharpParser(tokens);
                ParserRuleContext tree = parser.compilation_unit();
                ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
                MyListener my = new MyListener();
                walker.walk(my, tree); // initiate walk of tree with listener

            }

        }

    }

}
