package xEXERCISE_FINAL.HashMap;

import java.util.HashMap;

public class HashMapExp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Shakib", 80);
        map.put("Tamim", 79);
        map.put("Miraz", 72);

        System.out.println(map.get("Shakib"));

        for(String i : map.keySet()) {
            System.out.println(i + map.get(i));
        }
        for(Integer i : map.values()) {
            System.out.println(i);
        }
    }
}
