package com.bytedance.javabasic.function_interface;


import java.util.function.Consumer;

/**
 * @author yaojun
 * @create 2021-01-23 10:03
 * Consumer消费一个数据
 */
public class TestConsumer {
    public static void consumerString(String name, Consumer<String> con) {
        con.accept(name);
    }

    public static void main(String[] args) {
        consumerString("赵丽颖", e -> {
            String reName = new StringBuilder(e).reverse().toString();
            System.out.println(reName);
        });
    }
}
