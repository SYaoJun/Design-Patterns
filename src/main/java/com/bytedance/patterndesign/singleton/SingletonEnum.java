package com.bytedance.patterndesign.singleton;

/**
 * @author yaojun
 * @create 2020-11-29 12:12
 */
enum SingletonEnum {
    intance; //实例
    public void sayOk(){
        System.out.println("ok!~");
    }

}

class TestSingletonEnum{
    public static void main(String[] args) {
        SingletonEnum intance1 = SingletonEnum.intance;
        SingletonEnum intance2 = SingletonEnum.intance;
        System.out.println(intance1 == intance2);
    }
}


