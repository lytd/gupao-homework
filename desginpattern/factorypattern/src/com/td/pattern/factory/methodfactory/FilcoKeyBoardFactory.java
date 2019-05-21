package com.td.pattern.factory.methodfactory;

public class FilcoKeyBoardFactory implements IKeyBoardFactory{
    @Override
    public IKeyBoard createKeyBoard() {
        return new FilcoKeyBoard();
    }
}
