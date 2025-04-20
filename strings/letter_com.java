package strings;

import java.util.ArrayList;
import java.util.List;

public class letter_com {
    public static void main(String[] args) {

        List<String> ans =pad("","23");
        System.out.println(ans);
    }
    static List<String> pad(String p,String up){

        if(up.isEmpty()){
            List<String> n = new ArrayList<>();
            n.add(p);
            return n;
        }
        List<String> n= new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch= (char)('a'+i);
            n.addAll(pad(p+ch,up.substring(1)));
        }
        return n;
    }
}