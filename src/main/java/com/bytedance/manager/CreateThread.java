package com.bytedance.manager;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CreateThread{

    public static void main(String[] args) {
        MyCall myCall = new MyCall();
        FutureTask task = new FutureTask(myCall);
        new Thread(task).start(); //实现Callable 重写run方法 启动start方法
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学多线程..."+i);
        }
    }
}

class MyCall implements Callable {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习..." + i);
        }
        return "hello world";
    }
}