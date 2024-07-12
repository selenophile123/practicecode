public class Test2 {
    public static void main(String[] args) {
      int []arr={1,2,3,4,5,7};
      int n=arr.length;
      int SumOf_naturalNumber=((n+1)*(n+2))/2;
      int sum=0;
      for(int i=0;i< arr.length;i++){
          sum+=arr[i];
      }
      int missing_number=SumOf_naturalNumber-sum;
        System.out.println(missing_number);
    }
}
