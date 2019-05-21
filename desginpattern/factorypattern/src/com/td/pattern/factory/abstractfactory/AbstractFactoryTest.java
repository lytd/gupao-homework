package com.td.pattern.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {





        AbstractCarFactory guoChanCarFactory=new GuoChanCarFactory();
        guoChanCarFactory.getEngine().launch();
        guoChanCarFactory.getTyre().rub();


        AbstractCarFactory jinKouCarFactory=new JinKouCarFactory();
        jinKouCarFactory.getEngine().launch();
        jinKouCarFactory.getTyre().rub();

    }
}
