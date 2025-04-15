import java.util.Arrays;
import java.util.Scanner;

public class remove_Vowels {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the String:");
        String a = scn.nextLine() ;
        System.out.println("After removed we get:");
        System.out.println(removeV(a));
    }
    private static String removeV(String genz){
        StringBuilder scn = new StringBuilder();
       for(int i=0;i<genz.length();i++){
           char index = genz.charAt(i);
           if(index!='a' && index!='e' && index!='i' && index!='o' && index!='u' && index!='A' && index!='E' && index!='I' && index!='O' && index!='U'){
               scn.append(index);
           }
       }
       return scn.toString();
    }
}
