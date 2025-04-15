import java.util.Scanner;

public class remove_same_element {
    public static void main(String[] args) {
        System.out.println("Enter the String :");
        Scanner scn = new Scanner(System.in);
        String name=scn.nextLine();
        System.out.println("super !!! Now , Enter the letter that needs to be removed:");
        char rem=scn.next().charAt(0);
        System.out.println("↓ Here's your answer ");
        System.out.println(removepandra(name,rem));

    }
    public static String removepandra(String name, char remove){
        StringBuilder scn  = new StringBuilder();
    for(int i=0;i<name.length();i++){
        char index =name.charAt(i);
        if(index!=remove){
            scn.append(index);
        }
    }
    return scn.toString();
    }
}
