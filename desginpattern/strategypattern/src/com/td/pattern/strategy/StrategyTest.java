package com.td.pattern.strategy;
public class StrategyTest {
    public static void main(String[] args) {
        Website website=new Website();

        website.chooseAuthType(new QQLogin());

        website.login();

    }
}
