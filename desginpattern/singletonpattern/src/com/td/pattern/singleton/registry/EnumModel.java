package com.td.pattern.singleton.registry;

public enum EnumModel {

    INSTANCE;

    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumModel getInstance(){
        return INSTANCE;
    }



}
