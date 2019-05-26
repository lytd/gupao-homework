package com.td.pattern.adatper;

public class USB3tomirosubAdapter extends PhoneCharge {

    @Override
    public void charge() {
        System.out.println("将USB3.0接口转换为miroUSB接口");

        super.charge();
    }
}
