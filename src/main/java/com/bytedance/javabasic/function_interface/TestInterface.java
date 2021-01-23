package com.bytedance.javabasic.function_interface;

/**
 * @author yaojun
 * @create 2021-01-23 07:43
 * 把函数式接口作为参数，用lambda表达式时实际是在调用函数式接口里的方法，参数就是方法需要的参数，并实现该方法。
 * 函数式接口作为参数和返回值。
 * 参考视频 https://www.bilibili.com/video/BV1uJ411k7wy?p=424
 */
public class TestInterface {
    public static void startThread(Runnable run) {
        new Thread(run).start();
    }

    public static void main(String[] args) {
//        startThread(()-> System.out.println(Thread.currentThread().getName()+"，启动了！"));
        //1.函数式接口作为参数，可以传递实现类。
        printString(new PrintableImpl());

        //2.函数式接口作为参数，可以传递匿名内部类。
        printString(new Printable() {
            @Override
            public void print(String s) {
                System.out.println("使用匿名内部类");
            }
        });
        //3.函数式接口作为参数，可以传递lambda表达式
        printString(e -> System.out.println("lambda表达式"));

    }

    public static void printString(Printable p) {
        //System.out.println("进入函数");
        p.print("这个字符串会被覆盖，没有价值！");
        //System.out.println("退出函数");
    }
}
