package com.bytedance.javabasic.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestT {
    public static void main(String[] args) {
        String ss = new String();
        System.out.println(ss.toString());
        Integer integer = new Integer(10);
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("张无忌");
        list.add("周芷若");
        list.add("灭绝师太");
        for(String s: list) System.out.println(s);

    }
}
