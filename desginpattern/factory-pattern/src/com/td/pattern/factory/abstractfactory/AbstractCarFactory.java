package com.td.pattern.factory.abstractfactory;

public abstract class AbstractCarFactory {

    public abstract IEngine getEngine(String name);

    public abstract ITyre getTyre(String type);



}
