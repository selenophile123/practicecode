
    public class SegregateZeros{
        public static void main(String[] args) {
            int[] arr = {0,1,0,3,0,4};
            int i = 0;
            int j = arr.length - 1;

            while (i < j) {

                while (i < j && arr[i] != 0) {
                    i++;
                }

                while (i < j && arr[j] == 0) {
                    j--;
                }

                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }


            for (i =arr.length-1;i>=0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }


