package xEXERCISE_FINAL.ArrayList.ArrayListConversionExp;

import java.util.ArrayList;

public class ArrayListConversionExp2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Van Dijk");
        list.add("Alisson Becker");
        list.add("Mo Salah");

        System.out.println(list.toString());

        String[] arr = new String[list.size()];

        list.toArray(arr);

        for(String i : arr) {
            System.out.println(i);
        }
    }
}
