package com.bytedance.patterndesign.singleton;

/**
 * @author yaojun
 * @create 2020-11-29 12:05
 */
public class Singleton {
    private Singleton(){}
    static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}

class TestSingletonStatic{
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
