package com.td.pattern.adatper;
public class AdapterTest {
    public static void main(String[] args) {
        PhoneCharge phoneCharge=new PhoneCharge();
        IChargeAdapter usb3tomirosubAdapter=new USB3tomirosubAdapter(phoneCharge);
        usb3tomirosubAdapter.charge();
    }
}
