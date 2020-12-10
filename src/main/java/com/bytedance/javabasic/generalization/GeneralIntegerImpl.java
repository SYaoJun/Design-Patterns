package com.bytedance.javabasic.generalization;

import java.util.Random;

/**
 * @author yaojun
 * @create 2020-12-10 10:53
 */
public class GeneralIntegerImpl implements GeneralInterface<Integer>{
    @Override
    public Integer getId() {
        Random random = new Random(100);
        return random.nextInt();
    }

    public static void main(String[] args) {
        GeneralIntegerImpl generalInteger = new GeneralIntegerImpl();
        System.out.println(generalInteger.getId());
    }
}
