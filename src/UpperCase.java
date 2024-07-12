public class UpperCase {
    public static String ToUpperFisrt(String str) {
        StringBuilder sb = new StringBuilder();
        boolean CapitalNext = true;
        for (char c : str.toCharArray()) {

            if (Character.isWhitespace(c)) {
                CapitalNext = true;
                sb.append(c);
            } else if (CapitalNext) {
                sb.append(Character.toUpperCase(c));
                CapitalNext = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1="monu sharma ji";
        String Capital=ToUpperFisrt(str1);
        System.out.print(Capital+" ");

    }
}
