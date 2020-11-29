package com.bytedance.patterndesign.decorator;

/**
 * @author yaojun
 * @create 2020-11-29 13:01
 */
public class Dou implements Drink {
    //被装饰者
    @Override
    public double price() {
        return 5;
    }

    @Override
    public String desc() {
        return "纯豆浆";
    }
}
