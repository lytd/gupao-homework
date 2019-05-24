package com.td.pattern.decorator;


public class ComputerDecorator extends ComputerBase {

    protected ComputerBase computer;

    public ComputerDecorator(ComputerBase computer){
        this.computer=computer;
    }

    @Override
    public void getCPU() {
        this.computer.getCPU();

    }

    @Override
    public void getMemory() {
        this.computer.getMemory();
    }

    @Override
    public void getHardDriver() {
        this.computer.getHardDriver();
    }
}
