package com.td.pattern.proxy.dynamicproxy.myownproxy;


public class MyOwnProxyTest {


    public static void main(String[] args) {

        Person person= (Person) new MyLawyer().getProxyLawyer(new MyPaintiff());
        person.shangsu("zhangsan",123);
    }

}
