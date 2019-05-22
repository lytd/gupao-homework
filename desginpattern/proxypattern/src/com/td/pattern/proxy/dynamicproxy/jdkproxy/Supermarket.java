package com.td.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Supermarket<T> implements InvocationHandler {

    T paotui;


    public T zhaosonghuoyuan(T target){
        paotui=target;
        Class<?> clazz= target.getClass();

        return (T)Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public void qingdianhuoqu(){

        System.out.println("清点货物");
    }

    public void tongzhikehu(){
        System.out.println("和客户确认货物信息");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        qingdianhuoqu();
        Object result=method.invoke(paotui,args);
        tongzhikehu();

        return result;
    }
}
