package com.td.pattern.factory.methodfactory;

public class LogitechKeyBoardFactory implements IKeyBoardFactory {
    @Override
    public IKeyBoard createKeyBoard() {
        return new LogitechKeyBoard();
    }
}
