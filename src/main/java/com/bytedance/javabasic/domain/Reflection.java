package com.bytedance.javabasic.domain;



import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yaojun
 * @create 2020-12-05 20:51
 */
public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        //方式1：通过对象.getClass获取
        Class c1 = user.getClass();
        System.out.println(c1.hashCode());
        //方式2：通过Class.forName(全限定名)获取
        Class c2 = Class.forName("com.bytedance.javabasic.domain.User");
        System.out.println(c2.hashCode());
        //方式3：通过类名.class获取
        Class c3 = User.class;
        System.out.println(c3.hashCode());
        //获得父类类型
        Class superclass = c3.getSuperclass();
        System.out.println(superclass);
        //通过反射调用方法
        System.out.println("=======================");
        Method method = c3.getDeclaredMethod("getMyName", String.class);
        method.setAccessible(true);
        System.out.println(method.invoke(user, "姚军"));


    }
}
class Person{

}
class User extends Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getMyName(String name){
        return "我叫"+name;
    }
}
