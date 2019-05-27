package com.td.pattern.observer.myown;

import java.util.concurrent.TransferQueue;

public class MyOweObserverTest {


    public static void main(String[] args) throws InterruptedException {
        TrafficLight trafficLight= TrafficLight.getInstance();

        Car car=new Car("宝马525");
        Car car1=new Car("哈弗H6");
        Car car2=new Car("劳斯莱斯幻影");



        trafficLight.addObserver(car);
        trafficLight.addObserver(car1);
        trafficLight.addObserver(car2);



        trafficLight.lightingChange(TrafficLight.Light.GREEN);
        Thread.sleep(1000);
        trafficLight.lightingChange(TrafficLight.Light.YELLOW);
        Thread.sleep(1000);

        trafficLight.lightingChange(TrafficLight.Light.RED);


    }
}
