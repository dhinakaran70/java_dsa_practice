import java.util.Scanner;

public class slidingwindow {
    public static double Avg_slide(int[] arr,int k){
        int sum=0;
        for(int i=0;i<k;i++){//first k elements
            sum+=arr[i];
        }
        int max=sum;
        int start=0,end=k;
        while(end<arr.length){
            sum-=arr[start];
            start++;
            sum+=arr[end];
            end++;
            max=Math.max(max,sum);
        }
        return (double)max/k;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array length:");//[1,12,-5,-6,50,3]
        int number= scn.nextInt();
        int[] array = new int[number];
        System.out.println("Enter the elements in the array:");
        for(int s=0;s<number;s++){
            array[s]=scn.nextInt();
        }
        System.out.println("Enter key");//k=4
        int key=scn.nextInt();
        System.out.println(Avg_slide(array,key));
    }
}
