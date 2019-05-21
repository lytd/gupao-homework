package com.td.pattern.factory.methodfactory;

public class LogitechKeyBoard implements IKeyBoard{
    @Override
    public void knock() {
        System.out.println("this is a logitechKeyBoard");
    }
}
