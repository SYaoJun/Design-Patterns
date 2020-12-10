package com.bytedance.javabasic.dynamic;

/**
 * @author yaojun
 * @create 2020-12-10 13:35
 * output:
 * Base staticMethod
 * Sub dynamicMethod
 */
public class StaticMethod {
    public static void main(String[] args) {
        Base c = new Sub();
        c.staticMethod();
        c.dynamicMethod();
    }
}
class Base {
    public static void staticMethod() {
        System.out.println("Base staticMethod");
    }

    public void dynamicMethod() {
        System.out.println("Base dynamicMethod");
    }
}

class Sub extends Base {
    public static void staticMethod() {
        System.out.println("Sub staticMethod");
    }

    @Override
    public void dynamicMethod() {
        System.out.println("Sub dynamicMethod");
    }
}

