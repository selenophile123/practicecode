public class ReveseArray {
    public static void main(String[] args){
        int a[]={1,2,4,8,10,14};
        int n= a.length;
        for(int i=0;i<n/2;i++){
            //swaping
            int temp =a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        System.out.println("Reverseal of an arrya;");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" , ");
        }
        System.out.print("");
    }
}
