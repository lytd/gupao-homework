package com.td.pattern.observer.jdk;

import java.util.Date;

public class Event {

    private String type;


    private Date time;

    public Event(String type, Date time) {
        this.type = type;
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
