import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class palin {
    static int reverse= 0;
    public static void check_palindrome(int number){
        if(number == 0)return;
        int reminder= number%10;
        reverse= reverse*10 + reminder;
        check_palindrome(number/10);

    }
    public static void answer(int left ,int right){
        if(left==right){
            System.out.print("True , The number that you've entered is a palindrome");
        }
        else{
            System.out.print("False, The number that you've entered isn't a palindrome . Try another number");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number that you want to see whether it is a palindrome:");
        int check_number = scn.nextInt();
        check_palindrome(check_number);
      answer(check_number,reverse);
    }


}
