package com.bytedance.patterndesign.principle.di;

import javax.swing.text.html.ObjectView;

/**
 * @author yaojun
 * @create 2020-12-04 16:36
 * 同时依赖抽象接口IReceiver，而不是依赖具体的类Email或者WeChat
 */
public class DI{
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("==============");
        person.receive(new WeChat());
        System.out.println("==============");
        person.receive(new Email());
    }
}

class Person {
    public void receive(IReciever iReciever){
        System.out.println(iReciever.getInfo());;
    }
}

interface IReciever{
    String getInfo();
}

class Email implements IReciever{

    @Override
    public String getInfo() {
        return "邮件发送成功";
    }
}

class WeChat implements  IReciever{

    @Override
    public String getInfo() {
        return "微信发送成功";
    }
}
