package com.td.pattern.singleton;

import com.td.pattern.singleton.lazy.LazyManModel;

public class SingletonTest {
    public static void main(String[] args) {

        //LazyManModelTest();

        Inner inner=Inner.getInstance();

    }

    public static void LazyManModelTest(){
        LazyManModel lazyManModel=null;
        for (int i = 0; i < 10; i++) {
            lazyManModel=LazyManModel.getInstance();
            System.out.println(lazyManModel);
        }
    }

}
