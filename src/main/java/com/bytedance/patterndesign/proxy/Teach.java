package com.bytedance.patterndesign.proxy;

/**
 * @author yaojun
 * @create 2020-11-29 13:21
 */
public class Teach implements ITeacher{

    @Override
    public void teach() {
        System.out.println("老师正在授课...");
    }
}
