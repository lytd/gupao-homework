package com.td.pattern.decorator;

public class ComputerWithMoreCore extends ComputerDecorator {


    public ComputerWithMoreCore(ComputerBase computer) {
        super(computer);
    }

    @Override
    public void getCPU() {
        super.computer.cpuCoreNum+=2;
        super.getCPU();
    }
}
