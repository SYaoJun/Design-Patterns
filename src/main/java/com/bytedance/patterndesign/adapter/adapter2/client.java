package com.bytedance.patterndesign.adapter.adapter2;

public class client {
    public static void main(String[] args) {
        System.out.println("=====对象适配器===");
        Phone phone = new Phone();
        phone.charging(new AdapterVoltage(new Voltage220v()));
    }
}
