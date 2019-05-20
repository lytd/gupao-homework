package com.td.pattern.factory.abstractfactory;

public class TyreFactory extends AbstractCarFactory{

    @Override
    public IEngine getEngine(String name) {

        return null;
    }

    @Override
    public ITyre getTyre(String type) {

        ITyre tyre=null;
        switch (type){
            case "Michelin":
                tyre=new MichelinTyre();
                break;
            case "GreatWall":
                tyre =new GreatWallTyre();
                break;

        }
        return tyre;
    }
}
