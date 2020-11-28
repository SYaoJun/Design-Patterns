package com.bytedance.manager;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class UserTest {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class class1 = person.getClass();
        Class class2 = Person.class;
        Class class3 = Class.forName("com.bytedance.manager.Person");
        Person instance1 = (Person) class1.newInstance();
        Constructor constructor = class1.getConstructor(String.class, String.class);
        Person instance2 = (Person)constructor.newInstance("姚军", "25");

        Method method = class2.getMethod("setName", String.class); //获取class对象中的setname方法
        //获取constructor对象
        Constructor constructor1 = class2.getConstructor();
        //获取class实例
        Object object = constructor1.newInstance("姚军","24");
        //使用method的invoke调用方法
        method.invoke(object,"alex");

    }
}
