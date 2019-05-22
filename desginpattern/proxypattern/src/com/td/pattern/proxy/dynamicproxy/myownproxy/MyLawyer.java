package com.td.pattern.proxy.dynamicproxy.myownproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyLawyer implements MyInvocationHandler {


    Object target;

    public Object getProxyLawyer(Object obj){

        this.target=obj;

        Class<?> clazz=obj.getClass();


        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    private void prepare(){
        System.out.println("准备材料");
    }


    private void post(){
        System.out.println("结案陈词");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        prepare();

        Object obj=method.invoke(target,args);
        post();

        return obj;
    }


}
