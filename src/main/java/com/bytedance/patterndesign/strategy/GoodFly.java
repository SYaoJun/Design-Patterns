package com.bytedance.patterndesign.strategy;

/**
 * @author yaojun
 * @create 2020-12-03 16:53
 */
public class GoodFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术高超~");
    }
}
