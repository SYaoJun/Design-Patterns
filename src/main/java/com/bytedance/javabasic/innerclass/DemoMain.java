package com.bytedance.javabasic.innerclass;

/**
 * @author yaojun
 * @create 2020-11-29 11:50
 */
public class DemoMain {
    //匿名内部类：用于只使用一次的类，省去了创建接口的实现类。
    public static void main(String[] args) {
        IAnonymous anonymous = new IAnonymous() {
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        };
        anonymous.method();
    }
}
