import java.util.*;
public class Insertionsort {
    public static void insertionSort(int[] arr){
        for(int i= 1;i< arr.length;i++){
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
    }
    public static void main(String [] args){
        int arr[]={2,6,4,8,1,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
