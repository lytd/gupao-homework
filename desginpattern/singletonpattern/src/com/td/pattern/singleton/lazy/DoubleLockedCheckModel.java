package com.td.pattern.singleton.lazy;

public class DoubleLockedCheckModel {


    private DoubleLockedCheckModel(){}

    private static DoubleLockedCheckModel instance;

    public static DoubleLockedCheckModel getInstance(){
        if (instance==null){
            synchronized (DoubleLockedCheckModel.class){
                if(instance==null){
                    instance=new DoubleLockedCheckModel();
                }

            }
        }
        return instance;
    }
}
