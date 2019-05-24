package com.td.pattern.decorator;
public class DecoratorTest {


    public static void main(String[] args) {


        ComputerBase computer=new ComputerBase();

        computer=new ComputerWithMoreCore(computer);

        //computer=new ComputerWithMoreMemory(computer);

        //computer=new ComputerWithMoreMemory(computer);

        computer=new ComputerWithMoreHardDriver(computer);

        computer.getComputerDetail();
    }
}
