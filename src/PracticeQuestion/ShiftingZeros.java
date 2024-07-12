package PracticeQuestion;

public class ShiftingZeros {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4, 5, -6, 7, -8};
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (arr[i] <= 0) {
                i++;
            }
            while (arr[j] >= 0) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        for ( i = 0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
}
