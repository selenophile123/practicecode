
import java.util.HashMap;

public class Monu {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "xyz";

        HashMap<Character, Character> mapping = mapStrings(str1, str2);
        System.out.println("Character mapping:");
        for (char key : mapping.keySet()) {
            System.out.println(key + " -> " + mapping.get(key));
        }
    }

    public static HashMap<Character, Character> mapStrings(String str1, String str2) {
        HashMap<Character, Character> mapping = new HashMap<>();

        // Ensure both strings are of equal length
        if (str1.length() != str2.length()) {
            System.out.println("Strings must be of equal length for mapping.");
            return mapping;
        }

        // Map characters from str1 to characters from str2
        for (int i = 0; i < str1.length(); i++) {
            char charFromStr1 = str1.charAt(i);
            char charFromStr2 = str2.charAt(i);
            mapping.put(charFromStr1, charFromStr2);
        }

        return mapping;
    }
}
