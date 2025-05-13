public class slidessss_winnn {
    public static void main(String[] args) {
        int[] arr= {-1,2,9,1,3,-4,5,2};
        int si=4;
        int[] res=checkLargestSubarray(arr,si);
        for(int i:res){
            System.out.println(res[i]);
        }

    }
    public static int[] checkLargestSubarray(int[] array,int k){
        if(array.length<k) return new int[0];
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=array[i];
        }
        int max=sum;
        int start=0,end=k;
        int[] ans= new int[k];
        while(end<array.length){
            sum-=array[start];
            start++;
            sum+=array[end];
            end++;
            if(max<sum){
                max=sum;
                for(int i=0;i<k;i++){
                    ans[i]=array[start];
                    start++;
                }
            }
        }
        return ans;
    }
}