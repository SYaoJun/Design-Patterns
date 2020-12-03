package com.bytedance.patterndesign.strategy;

/**
 * @author yaojun
 * @create 2020-12-03 16:54
 */
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不能飞翔~");
    }
}
