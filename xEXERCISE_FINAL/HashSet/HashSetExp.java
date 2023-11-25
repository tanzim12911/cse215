package xEXERCISE_FINAL.HashSet;

import java.util.HashSet;

public class HashSetExp {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("Denver");
        set.add("Seoul");

        System.out.println(set.toString());

        set.remove("Seoul");

        System.out.println(set.toString());
    }
}
