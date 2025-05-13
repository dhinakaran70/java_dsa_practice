package com.math;

import java.util.Scanner;

public class til_single_digit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println(func_single(a));
    }
    private static int func_single(int num){
        if(num==0)return 0;
        if(num%9==0)return 9;
        return num%9;


    }
}
