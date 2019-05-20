package com.td.pattern.singleton.lazy;
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
