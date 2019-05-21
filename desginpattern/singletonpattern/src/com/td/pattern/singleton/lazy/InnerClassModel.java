package com.td.pattern.singleton.lazy;

public class InnerClassModel {

    private InnerClassModel(){}

    public static final InnerClassModel getInstance(){
        return LazyHolder.instance;
    }


    static class LazyHolder{

        public static final InnerClassModel instance=new InnerClassModel();
    }

}
