import java.util.Scanner;
public class SquareRootBs {
    public static int findsquareroot(int num){
        int low=0;
        int high = num;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            long val = mid*mid;
        //Best case ki Square root mil jaye at mid
            if(val==num){
                return mid;

            }
            //in case val is
            else if (val<num) {
                result=mid;
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num= sc.nextInt();

        int result=findsquareroot(num);
        System.out.println("Square root of given number: "+result);
    }
}
