public class test1 {
    public static void main(String[]args){
        String str= "my name is monu sharma";//o/p:Monu sharma is my name
        String rev="";

        for(int i=str.length()-1;i>0;i--){
            rev=rev+str.charAt(i);

        }
        System.out.print(rev);

    }
}

