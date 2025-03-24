import java.util.Scanner;

public class count_zeroes {
    public static int count_target(int number){
        if(number==0){
            return 1;
        }
        if(number<10){
            return (number==0)?1:0;
        }
        return ((number%10==0)?1:0)+count_target(number/10);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scn.nextInt();
        int count = 0;
        System.out.println(count_target(number));
    }
}
