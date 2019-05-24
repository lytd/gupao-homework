package com.td.pattern.decorator;

public class ComputerWithMoreHardDriver extends ComputerDecorator {


    public ComputerWithMoreHardDriver(ComputerBase computer) {
        super(computer);
    }

    @Override
    public void getHardDriver() {

        super.computer.hardDriverSize+=128;
        super.getHardDriver();
    }
}
