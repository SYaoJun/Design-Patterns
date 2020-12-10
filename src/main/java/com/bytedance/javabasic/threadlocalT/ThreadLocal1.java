package com.bytedance.javabasic.threadlocalT;

/**
 * @author yaojun
 * @create 2020-12-10 22:46
 */
public class ThreadLocal1 {
    public static ThreadLocal<Long> x = new ThreadLocal<>() {
        @Override
        protected Long initialValue() {
            System.out.println("initial value..."); //有set就不会执行，只执行一次
            return Thread.currentThread().getId();
        }
    };

    public static void main(String[] args) {
        x.set(100L);
        System.out.println(x.get());
        new Thread(
                ()->{
                    System.out.println("new thread..."+ x.get()); //虽然是同一个变量 但是对于不同的线程保存不同的值
                }
        ).start();
        x.remove();
        System.out.println(x.get());

    }
}
