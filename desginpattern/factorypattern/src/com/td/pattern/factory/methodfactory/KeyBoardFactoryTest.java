package com.td.pattern.factory.methodfactory;

public class KeyBoardFactoryTest {
    public static void main(String[] args) {

        IKeyBoard iKeyBoard1=new FilcoKeyBoardFactory().createKeyBoard();
        IKeyBoard iKeyBoard2=new LogitechKeyBoardFactory().createKeyBoard();

        iKeyBoard1.knock();
        iKeyBoard2.knock();


    }
}
