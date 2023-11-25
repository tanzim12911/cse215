package xEXERCISE_FINAL.ArrayList.ArrayListExp;

import java.util.ArrayList;

public class ArrayListExp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("London");
        list.add("Denver");
        list.add("Paris");
        list.add("Miami");
        list.add("Seoul");

        System.out.println(list.toString());
        
        System.out.println("Contains Paris: " + list.contains("Paris"));

        list.add(1, "Dhaka");

        System.out.println(list.toString());

        list.remove(1);

        System.out.println(list.toString());

        //list.clear();
        //System.out.println(list.toString());

        System.out.println("Size: "+ list.size());

        System.out.println(list.get(2));


    }
}
