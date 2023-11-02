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

        int secondOccurrenceIndex = arrL.indexOf("Shakib");

    // If the second occurrence index is not equal to -1, then the element occurs twice in the list.
        if (secondOccurrenceIndex != -1) {
            System.out.println("The index of the second occurrence of the element 'Shakib' in the list is " + secondOccurrenceIndex);
        } else {
            System.out.println("The element 'Shakib' does not occur twice in the list.");
        }   
    }
}
