package com.bytedance.patterndesign.factory.factorymethod;



/**
 * @author yaojun
 * @create 2020-11-29 14:08
 */
public class Consumer {
    public static void main(String[] args) {

        Car car = new WulingFactory().getCar();
        car.name();
    }
}
