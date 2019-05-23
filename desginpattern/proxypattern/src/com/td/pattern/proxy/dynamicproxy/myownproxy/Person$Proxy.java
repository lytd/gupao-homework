package com.td.pattern.proxy.dynamicproxy.myownproxy;
import java.lang.reflect.*;
import com.td.pattern.proxy.dynamicproxy.myownproxy.Person;
public class Person$Proxy implements Person{
    MyInvocationHandler h;
    public Person$Proxy(MyInvocationHandler h) {
        this.h = h;
    }
    public void shangsu(java.lang.String string,int int1){
        try{
            Method m=Person.class.getMethod("shangsu",new Class[]{java.lang.String.class,int.class});
            this.h.invoke(this,m,new Object[]{string,int1});
        }catch(Error _ex) { }
        catch(Throwable e){
            throw new UndeclaredThrowableException(e);
        }}}