package com.td.pattern.factory.abstractfactory;

public class JinKouCarFactory extends AbstractCarFactory{

    @Override
    public IEngine getEngine() {

        return new V10Engine();
    }

    @Override
    public ITyre getTyre() {



        return new MichelinTyre();
    }
}
