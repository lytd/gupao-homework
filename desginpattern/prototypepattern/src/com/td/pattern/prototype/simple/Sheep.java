package com.td.pattern.prototype.simple;

import java.util.List;

public class Sheep implements Cloneable {

    private String  color;
    private int age;
    private List<String> foods;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFoods() {
        return foods;
    }



    public void setFoods(List<String> foods) {
        this.foods = foods;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
