public class Fest {
    public static int[] RedWall(int a[], int n) {
        int p0 = 0, curr = 0, p2 = n - 1;
        while (curr <= p2) {
            if (a[curr] == 0) {
                int temp = a[curr];
                a[curr] = a[p0];
                a[p0] = temp;
                curr++;
                p0++;
            } else if (a[curr] == 2) {
                int temp = a[curr];
                a[curr] = a[p2];
                a[p2] = temp;
                p2--;
            } else {
                curr++;
            }
        }
        return a; // Return the sorted array
    }

    public static void main(String[] args) {
        int a[] = {2, 0, 2, 1, 1, 0};
        int n = a.length;
        int[] sortedArray = RedWall(a, n);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}
