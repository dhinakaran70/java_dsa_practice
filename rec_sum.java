import java.util.Scanner;

public class rec_sum {

    static int sum=0;
    public static void recur(int num){
        if(num==0){
            return;
        }
        int rem = num%10;
        sum = sum*10+rem;
        recur(num/10);
    }
    public static void main(String[] args) {
        System.out.print("Enter the number that you want reverse:");
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        recur(n);
        System.out.println("Given number :"+n+"\nReversed number :"+sum+".");
    }

}