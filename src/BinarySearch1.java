import java.util.*;

public class BinarySearch1 {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Return -1 when the element is not found
    }

    public static void main(String[] args) {
        // Predefined array and target element
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        // Function calling of binarySearch
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Searched element is not found in the array");
        } else {
            System.out.println("Searched element is found at the location: " + result);
        }
    }
}
