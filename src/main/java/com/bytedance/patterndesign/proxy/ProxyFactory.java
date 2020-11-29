package com.bytedance.patterndesign.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yaojun
 * @create 2020-11-29 13:22
 */
public class ProxyFactory {
    //维护一个目标对象
    private Object target;
    //使用构造器 对target初始化
    public ProxyFactory(Object object) {
        this.target = object;
    }
    //给目标对象生成一个代理对象
    public Object getProxyInstance(){
        //1. loader指定当前目标对象使用的类加载器
        //2. interface目标对象实现的接口类型
        //3. invocationhandler事件处理 执行目标对象的方式时 会触发事情处理器方法
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始...");
                        Object returnValue = method.invoke(target, args);
                        System.out.println("JDK代理结束...");
                        return returnValue;
                    }
                });
    }

}
