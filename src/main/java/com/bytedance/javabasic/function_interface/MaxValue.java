package com.bytedance.javabasic.function_interface;

import java.util.function.Supplier;

/**
 * @author yaojun
 * @create 2021-01-23 09:57
 */
public class MaxValue {
    public static Integer getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 5, 666, 90};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                max = Math.max(max, i);
            }

            return max;
        });
        System.out.println(maxValue);
    }
}
