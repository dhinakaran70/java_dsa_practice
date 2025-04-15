import java.util.Arrays;
import java.util.Scanner;

public class internal_sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] array = new int[num];
        for(int i=0;i<num;i++){
            array[i]=scn.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
