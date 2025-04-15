package strings;

import java.util.ArrayList;

public class subsetsOfAString {
    public static void main(String[] args) {
        System.out.println(subset("","abc"));

    }
    public static ArrayList<String> subset(String p,String up){
     if(up.isEmpty()){
         ArrayList<String> scn = new ArrayList<>();
         scn.add(p);
         return scn;

     }
     char ch = up.charAt(0);
     ArrayList<String> arr1=subset(p+ch,up.substring(1));
     ArrayList<String> arr2=subset(p,up.substring(1));
     arr1.addAll(arr2);
     return arr1;
    }
}
