public class Swaptwonumbers {
    static void swap(int a,int b){
        System.out .println("original no.before swap");
        System.out .println("a :"+a);
        System.out .println("b :"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out .println("original no.after swap");
        System.out .println("a :"+a);
        System.out .println("b :"+b);
    }
    public static void main(String[]args){
        int a=9;
        int b=11;
        swap(a,b);
    }
}
