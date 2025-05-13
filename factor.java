public class factor {
    public static void main(String[] args) {
        System.out.println(factorof(20));
    }
    public static int factorof(int input ){
        if(input==1)return 1;
        return input*factorof(input-1);
    }

    //the highest factor that we can find is 31;
}
