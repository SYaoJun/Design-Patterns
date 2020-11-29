package com.bytedance.patterndesign.factory.factorymethod;

/**
 * @author yaojun
 * @create 2020-11-29 14:15
 */
public class Tesla implements Car{
    @Override
    public void name() {
        System.out.println("特斯拉...");
    }
}
