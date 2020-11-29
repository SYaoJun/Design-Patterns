package com.bytedance.adapter3;

/**
 * @author yaojun
 * @create 2020-11-29 09:53
 */
public class client {
    public static void main(String[] args) {
        //只需要覆盖我们关心的方法
        AbstractAdapter adapter = new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("覆盖重写m1");

            }
        };
        adapter.m1();
    }
}
