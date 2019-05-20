package com.td.pattern.factory.methodfactory;

public class KeyBoardFactory {
    public IKeyBoard createKeyBoard(String brand){

        IKeyBoard iKeyBoard=null;
        switch(brand){
            case "Filco":
                iKeyBoard=new FilcoKeyBoard();
                break;
            case "Logitech":
                iKeyBoard=new LogitechKeyBoard();
                break;
            default:
                throw new IllegalArgumentException("unknow brand KeyBoard!!!");

        }

    return iKeyBoard;
    }

}
