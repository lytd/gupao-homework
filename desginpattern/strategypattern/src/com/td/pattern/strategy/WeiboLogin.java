package com.td.pattern.strategy;

public class WeiboLogin implements ILogin {
    @Override
    public void auth() {
        System.out.println("获取用户的微博信息作为授权");
    }

    @Override
    public void login() {
        System.out.println("微博信息登录");
    }
}
