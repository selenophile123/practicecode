import java.util.Arrays;

public class MergerOf {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {6, 8, 9, 11, 10};
        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;
        int c[] = new int[c1];
        for (int i = 0; i < a1; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b1; i++) {
            c[a1 + i] = b[i];
        }
        System.out.println("Merger of Two Arra: ");
        for (int i = 0; i < c1; i++) {
            System.out.println(c[i] + " ");
            System.out.println(i+ " ");
            System.out.println();


            Arrays.sort(c);

        }
        System.out.println();
        int n = c.length;
        System.out.println("length of the array: " + n);



        }
    }

