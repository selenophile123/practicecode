public class CountZeroBs {
    public static int countzero(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 0) {
                low = mid + 1;  // Move right to find the last occurrence of 0
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        int result = countzero(arr);
        System.out.println("Total number of zeros in array: " + result);
    }
}
