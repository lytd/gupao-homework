package com.td.pattern.strategy;

public class AliLogin implements ILogin {
    @Override
    public void auth() {
        System.out.println("获取用户的支付宝信息作为授权");
    }

    @Override
    public void login() {
        System.out.println("支付宝信息登录");
    }
}
