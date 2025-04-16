package strings;

import java.util.ArrayList;
import java.util.List;

public class list_subset {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans = subset_list(arr);
        for( List<Integer> list :ans){
            System.out.println(list);
        }

    }
    private static List<List<Integer>>  subset_list(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int nums:arr){
            int n=outer.size();
            for(int j=0;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums);
                outer.add(internal);
            }
        }
        return outer;
    }
}
