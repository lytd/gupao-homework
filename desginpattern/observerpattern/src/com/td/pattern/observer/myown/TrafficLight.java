package com.td.pattern.observer.myown;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TrafficLight {

    private static final TrafficLight trafficLight=new TrafficLight();

    private static final List<IObserver> observers=new LinkedList<>();


    enum Light{
        YELLOW("黄灯慢"),GREEN("绿灯行"),RED("红灯停");



        private String action;

        Light(String s){
            this.action=s;
        }

        public void doAction(){
            System.out.println(action);
        }

    }


    private TrafficLight(){

    }

    public static TrafficLight getInstance(){

        return trafficLight;
    }


    public void addObserver(IObserver observer){

        if (!observers.contains(observer)){
            observers.add(observer);
        }

    }

    public void lightingChange(Light light){
        System.out.println("红绿灯发生变化");

        observers.stream().forEach(observer -> observer.update(light));


    }




    public void removeObserver(IObserver observer){

        if (observers.contains(observer)){
            observers.remove(observer);
        }

    }



}
