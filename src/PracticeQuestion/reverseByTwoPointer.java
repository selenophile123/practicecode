package PracticeQuestion;

public class reverseByTwoPointer {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int Start = 0;
        int End = arr.length - 1;
        while (Start < End) {
            int temp = arr[Start];
            arr[Start] = arr[End];
            arr[End] = temp;
            Start++;
            End--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
