public class SwapType2 {
    static void swapwiouthtemp(int a,int b){
        System.out.println("Without swaping");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        a=a+b;     //10+20=30
        b=a-b;     // 30-20=10
        a=a-b;     // 10-30=20

        System.out.println("After sawping");
        System.out.println("a  :"+a);
        System.out.println("b:  "+b);


    }

    public static void main(String[]args){
        swapwiouthtemp(10,20);
    }
}
