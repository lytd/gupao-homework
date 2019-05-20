package com.td.pattern.singleton;
public class LazyManModel {

    private LazyManModel(){}

    private static LazyManModel instance;

    public static LazyManModel getInstance(){
        if (instance==null){
            synchronized (LazyManModel.class){
                instance=new LazyManModel();
            }
        }
        return instance;
    }



}
