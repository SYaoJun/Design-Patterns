package com.bytedance.patterndesign.decorator;

/**
 * @author yaojun
 * @create 2020-11-29 13:02
 */
public abstract class Decorator implements Drink{
    //装饰器 1.抽象类 2.实现抽象组件接口 3.持有抽象接口的引用
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double price() {
        return drink.price();
    }

    @Override
    public String desc() {
        return drink.desc();
    }
}
