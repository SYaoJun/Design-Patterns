package com.bytedance.javabasic.manager;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class SafeList {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            new Thread(()->{set.add(UUID.randomUUID().toString().substring(0,5));System.out.println(set);}, String.valueOf(i)).start();
        }
    }
}
