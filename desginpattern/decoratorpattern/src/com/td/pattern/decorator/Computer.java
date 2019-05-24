package com.td.pattern.decorator;

public abstract class Computer {




    public abstract void getCPU();
    public abstract void getMemory();
    public abstract void getHardDriver();


    public void getComputerDetail(){

        getCPU();

        getMemory();

        getHardDriver();

    }
}
