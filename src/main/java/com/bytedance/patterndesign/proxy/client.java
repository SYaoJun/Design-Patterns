package com.bytedance.patterndesign.proxy;

/**
 * @author yaojun
 * @create 2020-11-29 13:29
 */
public class client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacher target = new Teach();

        //给目标对象创建代理对象
        ITeacher iTeacher = (ITeacher) new ProxyFactory(target).getProxyInstance();
        //查看生成的代理对象
        System.out.println("proxyinstance="+iTeacher.getClass());
        //通过代理对象，调用目标对象的方法。
        iTeacher.teach();
    }
}
