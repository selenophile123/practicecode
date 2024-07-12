package PracticeQuestion;

public class MaximumNum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 46, 7, 9, 5};
        int n = arr.length - 1;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Number in Array: "+max);
    }
}
