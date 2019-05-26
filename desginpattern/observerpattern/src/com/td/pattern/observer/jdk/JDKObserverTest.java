package com.td.pattern.observer.jdk;

import java.util.Calendar;

public class JDKObserverTest {
    public static void main(String[] args) {
        JDKTarget jdkTarget=JDKTarget.getInstance();

        JDKObserver j1=new JDKObserver("123");
        JDKObserver j2=new JDKObserver("456");

        jdkTarget.addObserver(j1);
        jdkTarget.addObserver(j2);

        Event e1=new Event("火警", Calendar.getInstance().getTime());
        Event e2=new Event("地震", Calendar.getInstance().getTime());


        jdkTarget.publishEvent(e1);
        jdkTarget.publishEvent(e2);



    }
}
