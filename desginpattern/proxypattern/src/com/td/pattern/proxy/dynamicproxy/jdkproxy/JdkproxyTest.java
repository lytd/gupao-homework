package com.td.pattern.proxy.dynamicproxy.jdkproxy;

public class JdkproxyTest {
    public static void main(String[] args) {

        Supermarket<UUpaotui> supermarket=new Supermarket();
        Ipaotui uu=supermarket.zhaosonghuoyuan(new UUpaotui());
        uu.paotui();

    }
}
