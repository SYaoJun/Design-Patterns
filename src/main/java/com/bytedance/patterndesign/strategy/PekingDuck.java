package com.bytedance.patterndesign.strategy;

/**
 * @author yaojun
 * @create 2020-12-03 17:00
 */
public class PekingDuck extends Duck{

    @Override
    public void display() {
        System.out.println("北京鸭...");
    }

    public PekingDuck() {
        flyBehavior = new BadFly();
    }
}
