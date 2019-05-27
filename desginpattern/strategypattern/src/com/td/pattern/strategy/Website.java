package com.td.pattern.strategy;

public class Website {

    ILogin login;

    void chooseAuthType(ILogin iLogin){
        login=iLogin;
        System.out.println("选择授权方式");

        login.auth();
    }


    void login(){


        login.login();
    }

}
