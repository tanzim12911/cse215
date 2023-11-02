package lab14;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrL = new ArrayList<String>();

        arrL.add("Liton");
        arrL.add("Shanto");
        arrL.add("Mushfiq");
        arrL.add("Mahmudullah");
        arrL.add("Hridoy");
        arrL.add("Shakib");
        arrL.add("Taskin");
        arrL.add("Mostafizur");
        arrL.add("Shakib");
        arrL.add("Shoriful");

        System.out.println("Is Tamim in the list? " + arrL.contains("Tamim"));

        int count = 1;
        int index = 0;

        for (int i = 0; i < arrL.size() - 1; i++) {
            if(arrL.get(i) == arrL.get(i + 1)) {
                count++;
            }
            if(count >= 2) {
                System.out.println("Second ocurrance of " + arrL.get(i) + " is " + (i + 1));
            }
        }

        

    }
}
