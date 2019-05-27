package com.td.pattern.adatper;
public class AdapterTest {
    public static void main(String[] args) {
        PhoneCharge phoneCharge=new USB3tomirosubAdapter();
        phoneCharge.charge();
    }
}
