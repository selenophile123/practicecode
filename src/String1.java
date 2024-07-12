public class String1 {
    public static String reverseChar(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {  // Append space if not the last word
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Monu Sharma is my name";
        System.out.println(reverseChar(str));
    }
}
