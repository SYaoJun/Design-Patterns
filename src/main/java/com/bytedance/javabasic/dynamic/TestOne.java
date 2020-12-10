package com.bytedance.javabasic.dynamic;

/**
 * @author yaojun
 * @create 2020-12-10 14:15
 */
class A
{
    public final static int  staticData = 4 ;

    static
    {
        System.out.println("类被加载");
    }
    A()
    {
        System.out.println("类被构造");
    }
}

public class TestOne
{
    public static void main(String[] args)
    {
        System.out.println(A.staticData);
    }

}
