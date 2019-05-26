package com.td.pattern.observer.myown;

public interface IObserver {

    String getName();


    void update(TrafficLight.Light light);


}
