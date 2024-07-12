public class MinElement {

    public static void main(String[] args) {


        int arr[] = {18, 4, 3, 7, 6, 5};
        int min = arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            } else if (arr[i]>max) {
                max=arr[i];

            }

        }
        System.out.println("Minimum Element is:"+min);
        System.out.println("Maximum Element is :"+max);

    }
}