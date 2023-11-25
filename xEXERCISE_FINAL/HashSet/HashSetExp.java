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

        //set.remove("Seoul");

        //System.out.println(set.toString());

        System.out.println(set.contains("Seoul"));

        HashSet<String> set2 = new HashSet<>();

        set2.add("Dhaka");
        set2.add("Seoul");
        set2.add("Dehli");

        System.out.println(set2.toString());

        set.addAll(set2);

        System.out.println(set.toString());

        set.removeAll(set2);

        System.out.println(set.toString());

        set.retainAll(set2);

        System.out.println(set.toString());
    }
}
