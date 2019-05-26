package com.td.pattern.tamplate;


public abstract class AbstractProgram {


    public void progarm(){

        desgin();

        code();

        compile();
        
        run();

    }

    protected abstract void run();

    protected abstract void compile();

    protected abstract void code();

    protected abstract void desgin();

}
