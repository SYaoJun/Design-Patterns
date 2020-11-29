package com.bytedance.javabasic.innerclass;

/**
 * @author yaojun
 * @create 2020-11-29 11:12
 */
public class client {
    public static void main(String[] args) {
        //1. 间接调用
        Body body = new Body();
        body.methodBody();
        //2. 直接调用
        //外部类名称.内部类名称 对象名 = new  外部类名称().new 内部类名称()
        System.out.println("==================");
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
