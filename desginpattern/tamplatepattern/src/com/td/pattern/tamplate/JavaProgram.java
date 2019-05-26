package com.td.pattern.tamplate;

public class JavaProgram extends AbstractProgram {
    @Override
    protected void run() {
        System.out.println("java程序运行");
    }

    @Override
    protected void compile() {
        System.out.println("java代码编译");
    }

    @Override
    protected void code() {
        System.out.println("java 代码编写");
    }

    @Override
    protected void desgin() {
        System.out.println("java程序开始设计");
    }
}
