import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList and fill it with 10 items
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Item1");
        myList.add("Item2");
        myList.add("Item3");
        myList.add("Item4");
        myList.add("Item5");
        myList.add("Item2"); // Adding a duplicate item for the second occurrence
        myList.add("Item6");
        myList.add("Item7");
        myList.add("Item8");
        myList.add("Item9");

        // Check if the ArrayList contains a given element
        String searchElement = "Item3";
        if (myList.contains(searchElement)) {
            System.out.println("ArrayList contains " + searchElement);
        } else {
            System.out.println("ArrayList does not contain " + searchElement);
        }

        // Find the index of the second occurrence of an element in the ArrayList
        String targetElement = "Item2";
        int firstIndex = myList.indexOf(targetElement);
        if (firstIndex != -1) {
            int secondIndex = myList.subList(firstIndex + 1, myList.size()).indexOf(targetElement);
            if (secondIndex != -1) {
                // Adjust the index to account for the sublist's offset
                secondIndex += firstIndex + 1;
                System.out.println("Index of the second occurrence of " + targetElement + " is " + secondIndex);
            } else {
                System.out.println("Second occurrence of " + targetElement + " not found in the ArrayList");
            }
        } else {
            System.out.println(targetElement + " not found in the ArrayList");
        }
    }
}
