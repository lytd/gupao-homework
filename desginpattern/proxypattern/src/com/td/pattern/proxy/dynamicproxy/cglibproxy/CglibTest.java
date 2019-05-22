package com.td.pattern.proxy.dynamicproxy.cglibproxy;

public class CglibTest {


    public static void main(String[] args) {


        Paintiff paintiff= (Paintiff) new Lawyer().getProxyLawyer(Paintiff.class);
        paintiff.shangsu();

    }

}
