package com.td.pattern.observer.jdk;


import java.util.Observable;

public class JDKTarget extends Observable{

    private static final JDKTarget jdkTarget=new JDKTarget();

    private JDKTarget(){

    }
    public static JDKTarget getInstance(){

        return jdkTarget;
    }



    public void publishEvent(Event event){

        System.out.println("------发布事件");
        setChanged();
        notifyObservers(event);


    }




}
