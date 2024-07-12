public class CountOneBs {
    public static int countones(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                // Move left to count all occurrences of 1
                high = mid - 1;
            } else {
                // Move right
                low = mid + 1;
            }
        }

        // The count is the length of the array minus the low index becoz low pointing to zero
        return arr.length - low;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        int result = countones(arr);
        System.out.println("Total number of ones: " + result);
    }
}
