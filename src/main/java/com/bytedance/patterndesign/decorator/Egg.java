package com.bytedance.patterndesign.decorator;

/**
 * @author yaojun
 * @create 2020-11-29 13:06
 */
public class Egg extends Decorator{
    public Egg(Drink drink) {
        super(drink);
    }

    @Override
    public double price() {
        return super.price() + 4.0;
    }

    @Override
    public String desc() {
        return super.desc() + "鸡蛋";
    }
}
