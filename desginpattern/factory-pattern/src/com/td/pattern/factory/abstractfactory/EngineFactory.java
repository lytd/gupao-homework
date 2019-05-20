package com.td.pattern.factory.abstractfactory;

public class EngineFactory extends AbstractCarFactory{

    @Override
    public IEngine getEngine(String name) {
        IEngine engine=null;
        switch (name){
            case "V8":
                engine=new V8Engine();
                break;
            case "V10":
                engine =new V10Engine();
                break;

        }
        return engine;
    }

    @Override
    public ITyre getTyre(String type) {
        return null;
    }
}
