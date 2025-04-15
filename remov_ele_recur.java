public class remov_ele_recur {
    public static void main(String[] args) {
        String a = "dhinakaran";
        System.out.println(skip(a));
    }
    public static String skip(String a){
        if(a.isEmpty())return "";
        char ch = a.charAt(0);
        if(ch=='a'){
            return skip(a.substring(1));
        }
        else{
           return ch+skip(a.substring(1));
        }
    }
}
