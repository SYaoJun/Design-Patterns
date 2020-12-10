package com.bytedance.javabasic.generalization;

/**
 * @author yaojun
 * @create 2020-12-10 10:39
 */
public class GeneralMethod {
    public static void main(String[] args) {
        generalMethod(1, "2");
    }
    public static<X> void generalMethod(X... inputArray){
        for(X element: inputArray){
            if(element instanceof Integer){
                System.out.println("处理Integer..."+element);
            }else if(element instanceof String){
                System.out.println("处理String..."+element);
            }
        }
    }
}
