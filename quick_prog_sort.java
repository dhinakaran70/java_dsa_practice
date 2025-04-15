import java.util.Arrays;

public class quick_prog_sort {
    public static void main(String[] args) {
        int [] a = {5,3,2,1,4};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
    private static void sort(int[] a,int low,int high){
        if(low>=high)return;
        int start= low;
        int end=high;
        int mid= start+(end-start)/2;
        int pivot= a[mid];
        while(start<=end){
            while(a[start]<pivot){
                start++;
            }
            while(a[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp = a[start];
                a[start]= a[end];
                a[end]=temp;
                end--;
                start++;
            }
        }
        sort(a,low,end);
        sort(a,start,high);

    }
}
