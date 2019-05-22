package com.td.pattern.proxy.dynamicproxy.myownproxy;

public class MyPaintiff implements Person{



    @Override
    public void shangsu(String s1, int i1) {

        System.out.println(s1+"原告上诉"+i1);
    }
}
