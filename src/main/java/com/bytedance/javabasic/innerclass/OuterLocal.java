package com.bytedance.javabasic.innerclass;

/**
 * @author yaojun
 * @create 2020-11-29 11:36
 */
public class OuterLocal {

    public void outerMethod(){
       class InnerLocal{  //权限什么都不能写
           private int num = 10;
           public void innerMethod(){
               System.out.println("局部内部类...");
           }
       }
       InnerLocal innerLocal = new InnerLocal();
       innerLocal.innerMethod();
   }
}

class OuterLocalTest{
    public static void main(String[] args) {
        OuterLocal outerLocal = new OuterLocal();
        outerLocal.outerMethod();
    }
}
