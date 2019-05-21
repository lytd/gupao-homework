package com.td.pattern.factory.simplefactory;

public class CarFactoryTest {
    public static void main(String[] args) {
        Car car =new CarFactory().create();
        System.out.println(car);
    }
}
