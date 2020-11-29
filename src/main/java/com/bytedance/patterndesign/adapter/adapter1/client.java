package com.bytedance.patterndesign.adapter.adapter1;

public class client {
    public static void main(String[] args) {
        System.out.println("=====类适配器===");
        Phone phone = new Phone();
        phone.charging(new AdapterVoltage());
    }
}
