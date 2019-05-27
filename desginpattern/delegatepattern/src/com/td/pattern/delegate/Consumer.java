package com.td.pattern.delegate;

public class Consumer {

    BaoGongTou baogongtou;

    public void findBaoGongTou(BaoGongTou baoGongTou){
        baoGongTou=baoGongTou;
    }


    public void zhuangxiu(String commond){
        baogongtou.work(commond);
    }


}
