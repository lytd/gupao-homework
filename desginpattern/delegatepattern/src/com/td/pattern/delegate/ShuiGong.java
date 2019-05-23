package com.td.pattern.delegate;

public class ShuiGong implements IEmployee{


    @Override
    public void work(String workName) {
        System.out.println("接到工作:" + workName);
        System.out.println("安装水管");
    }
}
