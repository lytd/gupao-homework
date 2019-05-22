package com.td.pattern.proxy.staticproxy;

public class Father {

    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void buy(){

        System.out.println("让儿子去买东西");
        son.buy();

    }
}
