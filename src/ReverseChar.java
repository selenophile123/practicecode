public class ReverseChar {
    public static String reverseCharWithoutSplitt(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = str.length()-1;i>=0;i--) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                sb.append(word.reverse()).append(" ");
                word.setLength(0);
            } else {
                word.append(ch);
            }
        }

        sb.append(word.reverse());

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Monu Sharma is my name";
        System.out.println(reverseCharWithoutSplitt(str));
    }
}


