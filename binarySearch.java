import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class binarySearch {
    private static int Search_pannalam_vaanga(int[] arr,int tar,int start,int end){
        if(start>end)return -1;
        int middle=start+(end-start)/2;
        if(arr[middle]==tar) return middle;
        return (arr[middle]<tar)?Search_pannalam_vaanga(arr,tar,middle+1,end):Search_pannalam_vaanga(arr,tar,start,end-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int SizeArray=scn.nextInt();
        System.out.println("Now,Enter those "+SizeArray+" elements:");
        int[] array = new int[SizeArray];
        for (int s = 0; s < SizeArray; s++) {
            array[s]=scn.nextInt();
        }
        System.out.println("Successfully Entered "+SizeArray+" elemnts of the Array");
        System.out.println("Now ,Entered the Target value to be found:");
        int target=scn.nextInt();
        int result = Search_pannalam_vaanga(array,target,0,array.length-1);
        if(result==-1){
            System.out.println("The Element does'nt exist in this array.");
        }
        else{
            System.out.println("The element "+target+" is found at the index "+result+" in the array.");
        }

    }
}
