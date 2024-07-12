
// Example  of compile Time polymorphism
//Method overloading


package Oops;


public class Polymorphism {

    public static int Add(int x,int y){
        return x+y;
    }
    public static int  Add(int x,int y,int z) {
        return x + y + z;
    }

    public static void main(String [] args){

        System.out.println(Add(10, 20 ,30));
       System.out.println(Add(10,20));

    }
}
