package com.bytedance.patterndesign.factory.simplefactory;

/**
 * @author yaojun
 * @create 2020-11-29 14:08
 */
public class Consumer {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("五菱");
        car.name();
    }
}
