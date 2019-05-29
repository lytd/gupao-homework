package com.td.pattern.observer.guavaapi;

import com.google.common.eventbus.Subscribe;

public class Teacher {

    private  String name;

    public Teacher(String name) {

        this.name = name;
    }

    @Subscribe
    public void subscribe(Question question){
        System.out.println(name + "老师收到了 提问:" + question.getTitle());

    }

}
