import java.util.Scanner;

public class linearSearch {
    private static int Searchpannalam(int[] array,int target,int index){
        if(index==array.length)return -1;
        if(array[index]==target)return index;
        return Searchpannalam(array,target,index+1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int sizeOfArray=scn.nextInt();
        System.out.println("Enter those "+sizeOfArray+" elements");
        int[] array = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            array[i]=scn.nextInt();
        }
        System.out.println("Successfully entered the elements in the array of size "+sizeOfArray);
        System.out.println("Now, Enter the target element to be searched in the array:");
        int target=scn.nextInt();
        int result=Searchpannalam(array,target,0);
        if(result==-1){
            System.out.println("Entered elements isn't in this Array.");
        }else{
            System.out.println("The element "+target+" is in the index of "+result+" in the array.");
        }
    }
}
