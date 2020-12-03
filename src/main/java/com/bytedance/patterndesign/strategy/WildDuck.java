package com.bytedance.patterndesign.strategy;

/**
 * @author yaojun
 * @create 2020-12-03 16:54
 */
public class WildDuck extends Duck {

    @Override
    public void display() {
        System.out.println("这是野鸭...");
    }

    public WildDuck() {
        flyBehavior = new GoodFly();
    }
}
