import java.util.Arrays;
import java.util.Scanner;

public class merge_prog_sort {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array to get sorted:");
        Scanner scn = new Scanner(System.in);
        int siz = scn.nextInt();
        System.out.println("Now, Enter the elements in the array:");
        int[] arr=new int[siz];
        for(int i=0;i<siz;i++){
            arr[i]=scn.nextInt();
        }
        int [] res= mergesort(arr);
        System.out.println("Hukum , tiger ka hukum");
        System.out.println(Arrays.toString(res));
    }
    private static int[] mergesort(int[] array){
        if(array.length==1)return array;
        int mid=array.length/2;
        int[] left = mergesort(Arrays.copyOfRange(array,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(array,mid,array.length));
        return mergepandra(left,right);
    }
    private static int[] mergepandra(int[] first , int[] second ){
        int[] mix = new int[first.length + second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
                k++;
            }
            else{
                mix[k]=second[j];
                j++;
                k++;
            }
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
