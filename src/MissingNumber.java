public class MissingNumber {
    public static void main(String[]args){
        int[]a={1,2,3,4,6,7};
        int n=a.length;
        // Sum of Natural number is
        int sum_natural  = ((n+1)*(n+2))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int missing=0;
        missing=sum_natural-sum;
        System.out.println( "missing :"+missing);
    }
}
