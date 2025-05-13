package com.math;

import java.util.Scanner;

public class minimum_pseudobinary_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println(findMinPseudo(a,0));
    }
    private static int findMinPseudo(int num,int max){
        if(num==0)return max;
        int digit=num%10;
        max=Math.max(max,digit);
        return findMinPseudo(num/10,max);
    }
}
