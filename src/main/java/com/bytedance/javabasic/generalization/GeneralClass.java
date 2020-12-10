package com.bytedance.javabasic.generalization;

/**
 * @author yaojun
 * @create 2020-12-10 10:47
 */
public class GeneralClass<T> {
    public static void main(String[] args) {
        GeneralClass<Integer> genInt = new GeneralClass<>();
        genInt.add(1);
        System.out.println(genInt.get());
    }
    private T t;
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
}
