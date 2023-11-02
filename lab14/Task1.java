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

        String targetElement = "Shakib";
        int firstIndex = arrL.indexOf(targetElement);
            int secondIndex = arrL.subList(firstIndex + 1, arrL.size()).indexOf(targetElement);
            if (secondIndex != -1) {
                secondIndex += firstIndex + 1;
                System.out.println("Index of the second occurrence of " + targetElement + " is " + secondIndex);
            } else {
                System.out.println("Second occurrence of " + targetElement + " not found in the ArrayList");
            }
        }
        
    }
