package com.bytedance.patterndesign.templatemethod;

/**
 * @author yaojun
 * @create 2020-12-03 16:16
 */
public class Milk extends Soya{
    @Override
    public void addCondiment() {
        System.out.println("添加牛奶作为调味品");
    }
}
