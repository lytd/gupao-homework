package com.td.pattern.observer.guavaapi;

import com.google.common.eventbus.EventBus;

public class Gper {
    public static void main(String[] args) {

        EventBus gper=new EventBus();


        Teacher mic=new Teacher("mic");
        Teacher tom=new Teacher("tom");

        gper.register(mic);
        gper.register(tom);


        Question question=new Question("Spring源码问题");
        Question question1=new Question("多线程问题");

        gper.post(question);
        gper.post(question1);

    }
}
