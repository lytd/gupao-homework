package com.td.pattern.decorator;

public class ComputerWithMoreMemory extends ComputerDecorator {


    public ComputerWithMoreMemory(ComputerBase computer) {
        super(computer);
    }

    @Override
    public void getMemory() {

        super.computer.memorySize+=2;
        super.getMemory();
    }
}
