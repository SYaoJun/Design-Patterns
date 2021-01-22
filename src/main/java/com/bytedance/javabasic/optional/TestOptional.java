package com.bytedance.javabasic.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @author yaojun
 * @create 2021-01-22 22:16
 */
public class TestOptional {
    public static void main(String[] args) {
        String str = "hello";
        str = null;
        //可以为空
        Optional<String> op1 = Optional.ofNullable(str);
        //如果为空就返回这个
        String el = op1.orElse("if null return this");
        System.out.println(el);

    }
    @Test
    void test(){
        String str = "hello";
        //str不可以为空
        Optional<String> op1 = Optional.of(str);
        //get内容不能为空
        String el = op1.get();
        System.out.println(el);
    }
}
