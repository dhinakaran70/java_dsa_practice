package strings;

public class ascii {
    public static void main(String[] args) {
        printasquii('A');
    }
    static void printasquii(char ch){
        if(ch>'z')return;
        System.out.println((int)ch+"-"+ch);
        printasquii((char) (ch+1));
    }
}
