package com.bytedance.javabasic.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author yaojun
 * @create 2020-12-17 22:03
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zhang");
        list.add("san");
        list.add("feng");
        System.out.println("============");
        //第一种：通过集合类.stream()
        Stream<String> stream = list.stream();
        stream.forEach(value-> System.out.println(value));
        System.out.println("============");
        //第二种：通过Stream.of()
        Integer[] arr = {1,2,3,4,6};
        Stream.of(arr).forEach(System.out::println);
        System.out.println("============");

    }
}
