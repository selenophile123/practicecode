import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public static void count(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);

            } else {
                map.put(ch, 1);
            }
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
        public static void main(String[]args){
         String str="MONUSHARAMA";
         count(str);

        }
        }


