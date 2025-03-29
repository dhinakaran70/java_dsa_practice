import java.util.Scanner;
import java.util.Stack;

public class parenthesis_stack {
    private static boolean check_pannnu(String name){
        Stack<Character> st = new Stack<>();
        for(int s=0;s<name.length();s++){
            char letter =name.charAt(s);
            if(letter=='{' || letter=='[' || letter=='('){
                st.push(letter);
            }
            else{
                if(st.isEmpty())return false;
                else if (letter=='}') {
                    if(st.peek()=='{'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(letter==']'){
                    if(st.peek()=='['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(letter==')'){
                    if(st.peek()=='('){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }

        }
        if(st.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the String Parenthesis:");
        Scanner scn = new Scanner(System.in);
        String sent =scn.nextLine();
        boolean result= (check_pannnu(sent));
        if(result==true){
            System.out.println("The Entered string of parenthesis are valid");
        }
        else{
            System.out.println("Invalid String of parenthesis");
        }
    }
}
