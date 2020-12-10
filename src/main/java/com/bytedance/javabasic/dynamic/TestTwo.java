package com.bytedance.javabasic.dynamic;

import java.util.Random;

/**
 * @author yaojun
 * @create 2020-12-10 14:15
 */
class  B
{
    public final static int  staticData = 4 + new Random().nextInt(10) ;

    static
    {
        System.out.println("类被加载");
    }
    B()
    {
        System.out.println("类被构造");
    }
}

public class TestTwo
{
    public static void main(String[] args)
    {
        System.out.println(B.staticData);
    }

}
