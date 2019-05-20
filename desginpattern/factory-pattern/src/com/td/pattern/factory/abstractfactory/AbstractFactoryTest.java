package com.td.pattern.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        String engine="Engine";
        String engine_v8="V8";
        String engine_v10="V10";


        String tyre="Tyre";
        String tyre_michelin="Michelin";
        String tyre_greatwall="GreatWall";




        FactoryProducer factoryProducer=new FactoryProducer();
        AbstractCarFactory engineFactory=factoryProducer.createFactory(engine);
        IEngine iEngine=engineFactory.getEngine(engine_v8);
        iEngine.launch();

        AbstractCarFactory tyreFactory=factoryProducer.createFactory(tyre);
        ITyre iTyre=tyreFactory.getTyre(tyre_greatwall);
        iTyre.rub();


    }
}
