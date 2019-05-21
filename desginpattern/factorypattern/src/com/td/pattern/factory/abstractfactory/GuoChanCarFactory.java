package com.td.pattern.factory.abstractfactory;

public class GuoChanCarFactory extends AbstractCarFactory{

    @Override
    public IEngine getEngine() {

        return new V8Engine();
    }

    @Override
    public ITyre getTyre() {
        return new GreatWallTyre();
    }
}
