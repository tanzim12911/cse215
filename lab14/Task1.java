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

        // check if Tamim is in the list

        System.out.println("Is Tamim in the list? " + arrL.contains("Tamim"));
    }
}
