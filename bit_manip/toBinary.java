package bit_manip;

import java.util.Arrays;

public class toBinary {
    public static void main(String[] args) {
       int a=9;
       convert(a);

    }
    public static void convert(int a){
        if(a<1)return;
        int rem=a%2;
        System.out.print(rem);
        convert (a/2);
    }
}
