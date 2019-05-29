package com.td.pattern.adatper;

public class USB3tomirosubAdapter  implements IChargeAdapter{

    private  PhoneCharge phoneCharge;


    public USB3tomirosubAdapter(PhoneCharge phoneCharge) {
        this.phoneCharge = phoneCharge;
    }

    @Override
    public void charge() {
        System.out.println("将USB3.0接口转换为miroUSB接口");

        phoneCharge.charge();
    }
}
