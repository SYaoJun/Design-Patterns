package com.bytedance.javabasic.function_interface;

import java.util.function.Predicate;

/**
 * @author yaojun
 * @create 2021-01-23 10:11
 * Predict对数据类型进行判断test
 */
public class TestPredict {
    public static boolean checkString(String str, Predicate<String> pre) {
        return pre.test(str);
    }

    public static void main(String[] args) {
        boolean b = checkString("hysteria", s -> s.length() > 4);
        System.out.println("字符串的长度大于4吗？" + b);
    }
}
