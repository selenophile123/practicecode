public class PascalTriangle {
        public static void main(String[] args) {
            int numRows = 5; // Change this value to generate Pascal's triangle with different number of rows
            generatePascalTriangle(numRows);
        }

        public static void generatePascalTriangle(int numRows) {
            int[][] triangle = new int[numRows][];

            // Populate the triangle with values
            for (int i = 0; i < numRows; i++) {
                triangle[i] = new int[i + 1];
                triangle[i][0] = 1; // First element of each row is always 1
                triangle[i][i] = 1; // Last element of each row is always 1

                // Calculate the middle elements of the row
                for (int j = 1; j < i; j++) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }

            // Print the triangle
            for (int i = 0; i < numRows; i++) {
                // Adding spaces for formatting
                for (int k = numRows - i; k > 0; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

