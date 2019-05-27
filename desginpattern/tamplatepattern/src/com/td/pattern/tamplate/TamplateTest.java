package com.td.pattern.tamplate;
public class TamplateTest {
    public static void main(String[] args) {
        AbstractProgram program=new JavaProgram();

        program.progarm();


        AbstractProgram program1=new PythonProgram();

        program1.progarm();


    }
}
