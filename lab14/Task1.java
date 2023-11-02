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

        for (int i = 0; i < arrL.size(); i++) {
            String element = arrL.get(i);
            int firstOccurrenceIndex = arrL.indexOf(element);
            int secondOccurrenceIndex = arrL.indexOf(element);

            if (secondOccurrenceIndex != -1) {
                System.out.println("Second occurrence of " + element + " is at index " + secondOccurrenceIndex);
            }
        }
        
    }
}
