package com.td.pattern.proxy.dynamicproxy.myownproxy;

public class MyClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return null;
    }
}
