package com.td.pattern.factory.abstractfactory;

public class V8Engine implements IEngine{
    @Override
    public void launch() {
        System.out.println("V8 Engine is launching.....");
    }
}
