package com.bytedance.patterndesign.templatemethod;

/**
 * @author yaojun
 * @create 2020-12-03 16:18
 */
public class Client{
    public static void main(String[] args) {
        System.out.println("==========制作红豆豆浆===========");
        Soya redBean = new RedBean();
        redBean.template();
        System.out.println("==========制作红豆豆浆===========");
        Soya milk = new Milk();
        milk.template();
    }
}
