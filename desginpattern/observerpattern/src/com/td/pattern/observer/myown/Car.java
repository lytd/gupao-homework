package com.td.pattern.observer.myown;

import com.td.pattern.observer.myown.TrafficLight.Light;

public class Car implements IObserver {

    private String name;


    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(Light light) {
        System.out.println(name + "注意到变化");
        light.doAction();

    }
}
