package xEXERCISE_FINAL.ArrayList.ArrayListConversionExp;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConversionExp {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list.toString());

        java.util.Collections.shuffle(list);

        System.out.println("Shuffle: " + list.toString());

        java.util.Collections.sort(list);

        System.out.println("Sort: " + list.toString());
    }
}
