package com.bytedance.javabasic.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author yaojun
 * @create 2020-11-29 21:10
 * 牛客网：成绩排序编程题
 */
public class SortScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int id, score;
        ArrayList<Student> stu = new ArrayList<>();
        while(n-- > 0){
            id = in.nextInt();
            score = in.nextInt();
            stu.add(new Student(id, score));
        }
        stu.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.score != o2.score){
                    return o1.score - o2.score;
                }else{
                    return o1.id - o2.id;
                }
            }
        });
        for(Student student: stu){
            System.out.println(student.id+" "+ student.score);
        }
    }
    static class Student{
        int id;
        int score;

        public Student(int id, int score) {
            this.id = id;
            this.score = score;
        }
    }
}
