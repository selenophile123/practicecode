public class PairSumK {
    public static void main(String[] args) {
        int arr[] = {6, 3, 8, 10, 16, 7, 5, 2, 9};
        int k = 7;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Fixed the loop condition
                if (arr[i] + arr[j] == k) {
                    System.out.println("(" + i + ", " + j + ")");
                }

            }
        }
    }
}
