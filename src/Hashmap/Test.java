package Hashmap;

import java.util.HashMap;

public class Test {
    public static void main (String[]args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Monu sharma",53 );
        hm.put("Yogesh sharma",14 );
        hm.put("Jitendra sharma",23 );
        hm.put("Himanshu sharma",5 );
        hm.put("Shivam sharma",30 );
        System.out.println(hm);
        System.out.println(hm.putIfAbsent("Pulkit sharma",34));
        System.out.println(hm);
        System.out.println(hm.size());
     }
}
