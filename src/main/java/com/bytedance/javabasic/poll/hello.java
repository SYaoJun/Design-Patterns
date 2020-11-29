package com.bytedance.javabasic.poll;




import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();
        String []s =str.substring(1, str.length()-1).split(",") ;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);

        for(int i = 0; i < s.length; i++){
            map.put(i+1, map.getOrDefault(i, 0)+Integer.valueOf(s[i]));
        }

        boolean res = false;
        for(int i = 0; i < s.length; i++){
            for(int j = i+1; j < s.length; j++){
                int sum = map.getOrDefault(j+1, 0) - map.getOrDefault(i, 0);
                if(sum%k==0){
                    res = true;
                    break;
                }
            }
        }
        if(res) System.out.println("True");
        else System.out.println("False");
    }
}


/*
*
*  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String []s = str.split(",") ;

        int t = 1;
        while(t <= 75){
            for(int i = 0; i < s.length; i++){
                for(int j = 0; j < 5; j++){
                    System.out.println("thread"+s[i]+":"+String.valueOf(t));
                    t++;
                }
            }
        }
    }
*
* */