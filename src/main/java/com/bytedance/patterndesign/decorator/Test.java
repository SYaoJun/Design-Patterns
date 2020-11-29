package com.bytedance.patterndesign.decorator;

/**
 * @author yaojun
 * @create 2020-11-29 13:08
 */
public class Test {
    public static void main(String[] args) {
        Drink dou = new Dou();
        System.out.println("价格："+dou.price());
        System.out.println("描述："+dou.desc());
        System.out.println("======================");
        //加红豆
        Drink redBeanDou = new RedBean(dou);
        System.out.println("价格："+redBeanDou.price());
        System.out.println("描述："+redBeanDou.desc());
        System.out.println("======================");
        //加鸡蛋
        Drink eggDou = new Egg(dou);
        System.out.println("价格："+eggDou.price());
        System.out.println("描述："+eggDou.desc());
        System.out.println("======================");
        //加红豆鸡蛋
        Drink redBeanEggDou = new RedBean(eggDou);
        System.out.println("价格："+redBeanEggDou.price());
        System.out.println("描述："+redBeanEggDou.desc());
        System.out.println("======================");
    }
}
