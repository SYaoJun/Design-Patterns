package com.bytedance.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class SafeList {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            new Thread(()->{set.add(UUID.randomUUID().toString().substring(0,5));System.out.println(set);}, String.valueOf(i)).start();
        }
    }
}
