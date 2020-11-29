package com.bytedance.patterndesign.factory.factorymethod;

/**
 * @author yaojun
 * @create 2020-11-29 14:15
 */
public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
