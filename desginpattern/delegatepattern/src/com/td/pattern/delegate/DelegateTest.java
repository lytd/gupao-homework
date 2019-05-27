package com.td.pattern.delegate;

public class DelegateTest {
    public static void main(String[] args) {
        BaoGongTou baoGongTou=new BaoGongTou();

        Consumer consumer=new Consumer();
        consumer.findBaoGongTou(baoGongTou);

        consumer.zhuangxiu("安装水");
        consumer.zhuangxiu("安装电");
        consumer.zhuangxiu("砸墙");





    }
}
