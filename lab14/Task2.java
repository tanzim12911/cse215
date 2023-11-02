package lab14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, String> squad = new HashMap<String, String>();

        squad.put("Tamim", "29");
        squad.put("Shakib", "75");
        squad.put("Mustafizur", "90");
        squad.put("Al Hasan", "75");

        
        Set<String> duplicateValues = new HashSet<>();

        for (Map.Entry<String, String> entry : squad.entrySet()) {
            if (duplicateValues.contains(entry.getValue())) {
                System.out.println("Duplicate value: " + entry.getValue());
            } else {
                duplicateValues.add(entry.getValue());
            }
        }
            
        
    }
}
