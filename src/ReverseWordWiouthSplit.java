
    public class ReverseWordWiouthSplit {
        public static void main (String[] args) {

            String str= "Geeks for geeks";
            String str1="";
            char ch;

            System.out.print("Original word: ");
            System.out.println("Geeks");

            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i);
                str1= ch+str1;
            }
            System.out.println("Reversed word: "+ str1);
        }
    }

