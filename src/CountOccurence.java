public class CountOccurence {
    public static int countOccurance(int arr[],int x){
        int res=0;
        for(int i=0;i<arr.length;i++) {
            if (x == arr[i]) {
                res++;

            }
        }
        return res;
    }
    public static void main(String[] args) {
     int arr[]={1,2,2,4,4,4,4,4,6,7};
     int x=4;
        System.out.println("Occurance is count:= "+countOccurance(arr,x));

    }
}
