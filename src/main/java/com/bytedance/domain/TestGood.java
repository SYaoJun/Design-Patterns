package com.bytedance.domain;

import java.util.Scanner;

public class TestGood {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n % 2 == 1) {
            System.out.println("-1");
        }else{
            for(int i = 23; i >= 0; i--){
                if(((n>>i)&1) == 1){
                    System.out.print(1<<i);
                    System.out.print(" ");
                }
            }
        }

    }
}
