public class StringToggle {
    public static String toggleCase(String str) {

        char[] chars = str.toCharArray();


        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {

                chars[i] = Character.toLowerCase(chars[i]);

            } else if (Character.isLowerCase(chars[i])) {

                chars[i] = Character.toUpperCase(chars[i]);
            }
        }


        return new String(chars);
    }

    public static void main(String[] args) {
        String str = " HeLlo WorLd";
        String result = toggleCase(str);
        System.out.println(result);
    }
}
