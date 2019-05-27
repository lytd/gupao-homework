package com.td.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class JDKObserver implements Observer {


    private String no;

    public JDKObserver(String no) {
        this.no = no;
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.printf("观察者编号%s接收到事件",no);

        Event event= (Event) arg;

        System.out.println("事件类型:" + event.getType());
        System.out.println("事件发生的时间:" + event.getTime());


    }




}
