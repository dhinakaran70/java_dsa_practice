public class majority_element {
    public static void main(String[] args) {
        int[] array= {2,2,1,1,1,2,2};
        System.out.println(find(array));
    }
    public static int find(int[] nums){
        int candidate=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(nums[i]==candidate)count++;
            else count--;
        }
        return candidate;
    }
}
