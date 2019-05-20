package com.td.pattern.factory.abstractfactory;

public class FactoryProducer {
    public AbstractCarFactory createFactory(String factoryType){

        if ("Engine".equals(factoryType)) {
            return new EngineFactory();
        } else {
            return new TyreFactory();
        }
    }
}
