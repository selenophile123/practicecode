import java.util.Scanner;

public class BinarySearch2 {

    public static int binarysearch(int[]arr,int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid + 1;

            }
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();

        System.out.println("Enter a array element: ");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Targeted Element: ");
        int x = sc.nextInt();

        //Function calling
        int result=binarysearch(arr,x);
        if(result==0){
            System.out.println("Element not present in the array;");

        }
        else{
            System.out.println("Element present in the array: "+ result);
        }
    }
}
