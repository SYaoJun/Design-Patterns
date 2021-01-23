package com.bytedance.javabasic.function_interface;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author yaojun
 * @create 2021-01-23 08:14
 * 函数式接口作为返回值
 */
public class TestReturn {
    public static Comparator<String> getComparator() {
        return (o1, o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"aaa", "b", "cc", "ddddddddddd"};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, getComparator());
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }
}
