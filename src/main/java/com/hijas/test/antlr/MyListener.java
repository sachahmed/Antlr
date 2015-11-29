package com.hijas.test.antlr;

/**
 * Created by SACHAHMED on 11/29/2015.
 */
public class MyListener extends CSharpBaseListener {

    @Override
    public void enterCompilation_unit(CSharpParser.Compilation_unitContext ctx) {
        System.out.println("parsing started");
    }

    @Override
    public void exitCompilation_unit(CSharpParser.Compilation_unitContext ctx) {
        System.out.println("parsing finished");
    }
}
