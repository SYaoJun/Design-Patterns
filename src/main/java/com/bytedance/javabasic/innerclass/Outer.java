package com.bytedance.javabasic.innerclass;

/**
 * @author yaojun
 * @create 2020-11-29 11:31
 */
public class Outer {
    /*局部变量用final修饰*/
    private int num = 10;
    public class Inner{
        private int num = 20;
        public void method(){
            int num = 30;
            System.out.println(num); //局部变量， 就近原则
            System.out.println(this.num); //本类的变量
            System.out.println(Outer.this.num); //外部类中的变量
        }
    }
}

class OuterTest{
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.method();
    }
}
