import java.util.Scanner;

public class BinarySearch4 {
    public static int binarysearch(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;

            } else if (arr[mid]<target) {
                low=mid+1;

            }
            else{
                high=mid-1;
            }

        }
        return 0;

    }

    public static void main(String[]args){
        int [] arr={1,2,3,4,5,6,7};
        int x=7;
        int result= binarysearch(arr,x);


        if(result==0){
            System.out.println("Element Not found in array; ");
        }
        else{
            System.out.println("Element Found : "+result);
        }
    }
}
