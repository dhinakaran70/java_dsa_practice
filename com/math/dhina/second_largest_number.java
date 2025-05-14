package com.math.dhina;

public class second_largest_number {
    public static void main(String[] args) {
        int[] arr= {5,4,6,2,1,10,2,34,5,33,3,3213,13,31,334,33,34321,234};
        System.out.println(find_sec_lar(arr));
    }
    private static int find_sec_lar(int[] arr){
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for (int num:arr){
            if(num>max){
                second_max=max;
                max=num;
            }
        }
        return second_max;
    }
}
