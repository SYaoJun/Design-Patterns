package com.bytedance.javabasic.innerclass;

/**
 * @author yaojun
 * @create 2020-11-29 11:09
 * 成员内部类：内用外，随便访问。外用内，需要内部类的对象。
 */
public class Body {
    public class Heart{  //成员内部类
        public void beat(){
            System.out.println("内部类的方法...");
            System.out.println("外部类的名字：" + name);
        }
    }
    private String name;

    public void methodBody(){
        System.out.println("外部类方法...");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
