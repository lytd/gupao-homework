package com.td.pattern.factory.methodfactory;

public class KeyBoardFactoryTest {
    public static void main(String[] args) {

        IKeyBoard iKeyBoard1=new KeyBoardFactory().createKeyBoard("Filco");
        IKeyBoard iKeyBoard2=new KeyBoardFactory().createKeyBoard("Logitech");

        iKeyBoard1.knock();
        iKeyBoard2.knock();


        IKeyBoard iKeyBoard3=new KeyBoardFactory().createKeyBoard("lenovo");
        iKeyBoard3.knock();





    }
}
