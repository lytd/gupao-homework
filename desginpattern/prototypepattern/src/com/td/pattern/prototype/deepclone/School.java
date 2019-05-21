package com.td.pattern.prototype.deepclone;

import java.io.Serializable;

public class School implements Serializable ,Cloneable{
    private School(){

    }

    private static final School INSTANCE=new School();


    public static School getInstance(){

        return INSTANCE;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }


}
