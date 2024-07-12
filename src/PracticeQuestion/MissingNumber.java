package PracticeQuestion;

public class MissingNumber {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 6};
        int n = arr.length;
        int sum_of_naturalNum = ((n + 1) * (n + 2)) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];


        }
        int missing_number_is=sum_of_naturalNum-sum;
        System.out.println(missing_number_is);
    }
}
