package com.td.pattern.tamplate;

public class PythonProgram extends AbstractProgram {
    @Override
    protected void run() {
        System.out.println("Python程序运行");
    }

    @Override
    protected void compile() {
        System.out.println("Python代码编译");
    }

    @Override
    protected void code() {
        System.out.println("Python代码编写");
    }

    @Override
    protected void desgin() {
        System.out.println("Python程序开始设计");
    }
}
