package com.td.pattern.singleton;

public class Inner {



    static {

        System.out.println("innner");
    }

    public static Inner getInstance(){
        System.out.println("getInstance");
        return MyInner.instance;
    }

    static class MyInner{
        public static final Inner instance=new Inner();

        static {

            System.out.println("my inner");
        }
    }
}
