public class ThirdLargest {
    public static void main(String[] args) {
        int arr[]={1,5,3,7,9,10};

        int max1=arr[0];
        int max2=arr[0];
        int max3=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max3=max2;
                max2=arr[i];



            }
            else if(arr[i]>max3){
                max3=arr[i];
            }

        }
        System.out.println(max3);
    }
}
