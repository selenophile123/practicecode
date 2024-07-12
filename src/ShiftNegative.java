public class ShiftNegative {

    public static void main(String[] args) {
        int arr[] = {-1, 2, 3, -4, -5, 7, -8};

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            // Find the first positive number from the left
            while (arr[i] < 0) {
                i++;
            }
            // Find the first negative number from the right
            while (arr[j] >= 0 ) {
                j--;
            }
            // Swap positive and negative elements
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Print the modified array
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
