package com.td.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


import java.lang.reflect.Method;

public class Lawyer implements MethodInterceptor {



    public Object getProxyLawyer(Class clazz){

        Enhancer enhancer=new  Enhancer();

        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return enhancer.create();
    }

    private void prepare(){
        System.out.println("准备材料");
    }


    private void post(){
        System.out.println("结案陈词");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        prepare();

        Object obj=methodProxy.invokeSuper(o,objects);
        post();

        return obj;
    }
}
