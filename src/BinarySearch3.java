import java.util.Scanner;

public class BinarySearch3 {
    public static int binarysearch(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;

            }
            else {
                high=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n= sc.nextInt();

        System.out.println("Enter element in arrya: ");
        int [] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter targeted element: ");
        int x= sc.nextInt();

            //function calling
        int result= binarysearch(arr,x);

        if(result==0){
            System.out.println("Element Not found in array: ");

        }
        else{
            System.out.println("Element Is Accassed: "+result);
            }
        }
    }

