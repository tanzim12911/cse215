import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> hashMap = new HashMap<>();

        // Fill it up with key-value pairs
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");
        hashMap.put("D", "Date");
        hashMap.put("E", "Apple");  // Duplicate value
        hashMap.put("F", "Fig");
        hashMap.put("G", "Grapes");
        hashMap.put("H", "Apple");  // Duplicate value

        // Print the values with duplicate copies
        findAndPrintDuplicates(hashMap);
    }

    private static void findAndPrintDuplicates(Map<String, String> map) {
        Map<String, Integer> countMap = new HashMap<>();

        // Count occurrences of each value
        for (String value : map.values()) {
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        }

        // Print values with duplicate copies
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate value: " + entry.getKey());
            }
        }
    }
}
