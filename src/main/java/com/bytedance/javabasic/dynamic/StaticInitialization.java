package com.bytedance.javabasic.dynamic;

/**
 * @author yaojun
 * @create 2020-12-10 13:56
 */
public class StaticInitialization {
    public static void main(String[] args) {
        Person student = new Student();

    }
}

class Person {

    //成员变量
    public String age = print("父类的age成员变量初始化");

    static{
        System.out.println("父类的静态代码块");
    }
    //静态变量（类变量）
    public static String name = print("父类的name静态变量初始化");
    //构造方法
    public Person(){
        System.out.println("父类构造器");
    }

    //输出显示用的
    public static String print(String aaa){
        System.out.println(aaa);
        return aaa;
    }
    public static void commonStatic(){
        System.out.println("commonStatic initialization");
    }
}

class Student extends Person {

    static{
        System.out.println("子类的静态代码块");
    }

    public static String name = print("子类的name静态变量初始化");

    public String age = print("子类的age成员变量初始化");

    public Student(){
        System.out.println("子类对象构造器");
    }
    public static void commonStaticSub(){
        System.out.println("commonStaticSub initialization");
    }
}

