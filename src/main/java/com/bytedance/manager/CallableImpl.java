package com.bytedance.manager;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableImpl {
    public static void main(String[] args) throws Exception {
        // new Thread(new Runnable).start();
        // new Thread(new FutureTask<V>(Callable)).start();
        //其中FutureTask是Runnable的实现类，而FutureTask的构造方法可以调用Callable
        myCall myCall = new myCall();
        FutureTask futureTask = new FutureTask(myCall);
        new Thread(futureTask,"线程A").start();
        new Thread(futureTask,"线程B").start();
        String o = (String)futureTask.get(); //会阻塞
        System.out.println(o);
    }
}
class myCall implements Callable{
    @Override
    public String call() throws Exception {
        System.out.println("my call is running...");
        return "hello world";
    }
}


