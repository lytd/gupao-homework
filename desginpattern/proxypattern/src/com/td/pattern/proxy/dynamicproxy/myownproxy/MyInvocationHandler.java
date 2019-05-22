package com.td.pattern.proxy.dynamicproxy.myownproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public interface MyInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
