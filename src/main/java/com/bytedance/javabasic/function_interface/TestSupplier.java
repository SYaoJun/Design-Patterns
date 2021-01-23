package com.bytedance.javabasic.function_interface;

import java.util.function.Supplier;

/**
 * @author yaojun
 * @create 2021-01-23 09:53
 * Supplier获取一个数据
 */
public class TestSupplier {
    // 返回指定类型 生产型Supplier
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(() -> "胡歌");
        System.out.println(s);
    }
}
