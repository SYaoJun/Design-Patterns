package com.bytedance.patterndesign.factory.factorymethod;



/**
 * @author yaojun
 * @create 2020-11-29 14:12
 */
public class DaZhongFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new DaZhong();
    }
}
