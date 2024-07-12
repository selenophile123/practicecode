public class Dup {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3, 2, 3};
        int n = arr.length;
        boolean isDuplicate;

        for (int i = 0; i < n; i++) {
            isDuplicate = false; // Reset flag for each element
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break; // No need to continue checking if duplicate is found
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
