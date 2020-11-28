package com.bytedance.manager;

public class Person {
    public String name;
    public String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("name: "+name);
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
    Person(){

    }
}
