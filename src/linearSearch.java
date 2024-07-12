public class linearSearch {
    public static void main(String [] args){
        int arr [] = {5,3,4,1,2,7};
         int target=2;
         for(int i=0;i<arr.length;i++){
             if(arr[i] == target){
                 System.out.println(i);
             }
         }
    }
}
