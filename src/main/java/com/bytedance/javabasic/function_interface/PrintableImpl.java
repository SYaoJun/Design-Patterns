package com.bytedance.javabasic.function_interface;

/**
 * @author yaojun
 * @create 2021-01-23 07:57
 */
public class PrintableImpl implements Printable {
    @Override
    public void print(String s) {
        System.out.println("我是实现类!");
    }
}
