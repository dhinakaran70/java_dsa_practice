import java.util.Scanner;

public class isArrSort {
    public static boolean checkArr(int[] arr,int i){
        if(i==arr.length-1) {
            return true;
        }
        return ((arr[i]<=arr[i+1])&& checkArr(arr,i+1));
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int number = scn.nextInt();
        int[] arr =new int[number];
        System.out.println("Enter the elements in the Array");
        for(int i=0;i<number;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(checkArr(arr,0));
        System.out.print("you can try different number");


    }
}
