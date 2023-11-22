package xEXERCISE_FINAL.ArrayList;

import java.util.ArrayList;

public class SecondOcurrance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(10);

        int index = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)) {
                    index = j;
                    break;
                }
            }
        }

        System.out.println("Second Ocurrance Index: " + index);

    }
}
