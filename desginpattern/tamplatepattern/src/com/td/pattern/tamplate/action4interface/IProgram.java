package com.td.pattern.tamplate.action4interface;

public interface IProgram {

    default void program(){
        step1();
        step2();
    }

    void step1();
    void step2();

}
