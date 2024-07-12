import java.util.Scanner;

public class FirstOccurance {
    public static int firstoccurence(int arr[],int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = 0;
        while (low < high) {
            //Here we are calculating mid
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;      
                high = mid - 1;
            }
            else if (arr[mid] > target) {
                high = mid - 1;

            }
            else {
                low = mid + 1;
            }
        }
        return result;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A size of array; ");
        int n=sc.nextInt();

        int arr []=new int[n];

        System.out.println("Enter a element in array");

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter targeted element: ");
        int x= sc.nextInt();
        //function calling
        int result=firstoccurence(arr,x);
        if(result==-1){
            System.out.println("Target element not present:");
        }
        else{
            System.out.println("Target element found: "+result);
        }
    }
}
