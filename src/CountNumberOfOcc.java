import java.util.HashMap;
import java.util.Map;

public class CountNumberOfOcc {
    static void CharcterCount(String str){
        HashMap<Character, Integer> hp = new HashMap<>();
        char[] chars = str.toCharArray();

        for(char ch : chars) {
            if(hp.containsKey(ch)) {
                hp.put(ch, hp.get(ch) + 1);
            } else {
                hp.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : hp.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args){
        String str = "HIMANSHUSHARMA";
        CharcterCount(str);
    }
}
