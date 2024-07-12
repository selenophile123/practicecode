public class CountFiveBs {

    public static int countfive(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        // Perform binary search to find the first occurrence of 5
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < 5) {
                low = mid + 1;
            } else if (arr[mid] > 5) {
                high = mid - 1;
            } else {
                // Found 5, now move low to the left to find the first occurrence
                while (low < arr.length && arr[low] != 5) {
                    low++;
                }
                break;
            }
        }

        // If low is out of bounds, there are no occurrences of 5
        if (low >= arr.length || arr[low] != 5) {
            return 0;
        }

        // Return the count of occurrences of 5 by subtracting the index of the first occurrence from the length of the array
        return arr.length - low;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int result = countfive(arr);
        System.out.print("Total number of five: " + result);
    }
}
