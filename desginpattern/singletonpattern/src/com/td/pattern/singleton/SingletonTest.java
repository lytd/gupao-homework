package com.td.pattern.singleton;

import com.td.pattern.singleton.lazy.LazyManModel;

public class SingletonTest {
    public static void main(String[] args) {

        LazyManModelTest();


    }

    public static void LazyManModelTest(){
        LazyManModel lazyManModel=null;
        for (int i = 0; i < 10; i++) {
            lazyManModel=LazyManModel.getInstance();
            System.out.println(lazyManModel);
        }
    }

}
