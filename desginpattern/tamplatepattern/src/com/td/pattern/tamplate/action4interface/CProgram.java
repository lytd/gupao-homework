package com.td.pattern.tamplate.action4interface;

public class CProgram implements IProgram {


    @Override
    public void step1() {
        System.out.println("C入门");
    }

    @Override
    public void step2() {
        System.out.println("C放弃");
    }
}
