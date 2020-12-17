package com.bytedance.javabasic.domain;

/**
 * @author yaojun
 * @create 2020-12-17 20:52
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder(s); //带参构造方法
        sb.append("world");
        System.out.println(sb);
        System.out.println(sb.reverse().append("111"));
        //转回String
        s = sb.toString();
        System.out.println(s);
    }
}
