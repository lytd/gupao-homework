package com.td.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep duoli=new Sheep();
        duoli.setColor("white");
        duoli.setAge(1);
        duoli.setFoods(new ArrayList<>());


        Sheep cloneSheep= (Sheep) duoli.clone();
        System.out.println(cloneSheep);


        System.out.println("对象对比 :"+duoli+" VS "+cloneSheep);
        System.out.println("color属性对象 :"+duoli.getColor()+" VS "+cloneSheep.getColor());
        System.out.println("age属性对象 :"+duoli.getAge()+" VS "+cloneSheep.getAge());
        System.out.println("list属性对象 :"+duoli.getFoods()+" VS "+cloneSheep.getFoods());




    }
}
