package com.bytedance.patterndesign.factory.factorymethod;

/**
 * @author yaojun
 * @create 2020-11-29 14:13
 */
public class WulingFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Wuling();
    }
}
