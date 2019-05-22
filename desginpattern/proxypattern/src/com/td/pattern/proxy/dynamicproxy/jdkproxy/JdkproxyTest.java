package com.td.pattern.proxy.dynamicproxy.jdkproxy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JdkproxyTest {
    public static void main(String[] args) throws FileNotFoundException {

        Supermarket<UUpaotui> supermarket=new Supermarket();
        Ipaotui uu=supermarket.zhaosonghuoyuan(new UUpaotui());
        uu.paotui();



    }
}
