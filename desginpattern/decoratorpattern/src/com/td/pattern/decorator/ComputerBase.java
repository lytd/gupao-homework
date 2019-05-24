package com.td.pattern.decorator;


public class ComputerBase extends Computer {

    protected int cpuCoreNum=2;
    protected int memorySize=4;
    protected int hardDriverSize=320;

    @Override
    public void getCPU() {
        System.out.println("CPU核数："+cpuCoreNum);
    }

    @Override
    public void getMemory() {
        System.out.println("内存大小:"+memorySize*1024);
    }

    @Override
    public void getHardDriver() {
        System.out.println("硬盘大小:"+hardDriverSize+"GB");
    }
}
