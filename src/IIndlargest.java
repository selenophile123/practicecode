public class IIndlargest {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,8,9};
        int max1=arr[0];
        int max2=arr[0];

        for(int i=0; i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];

            }
            else if(arr[i]>max2){
                max2=arr[i];
            }

        }
        System.out.println(max2);
    }
}
