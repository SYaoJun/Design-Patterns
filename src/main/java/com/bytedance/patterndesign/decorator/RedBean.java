package com.bytedance.patterndesign.decorator;

/**
 * @author yaojun
 * @create 2020-11-29 13:05
 */
public class RedBean extends Decorator{

    public RedBean(Drink drink) {
        super(drink);
    }

    @Override
    public double price() {
        return super.price() + 2;
    }

    @Override
    public String desc() {
        return super.desc()+"红豆";
    }
}
