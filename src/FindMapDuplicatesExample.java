import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMapDuplicatesExample {
    public static void main(String[] args) {
        // Initialize a map with some values
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 2); // Duplicate value
        map.put("e", 3); // Duplicate value

        // Create a map to track occurrences of each value
        Map<Integer, Integer> valueCountMap = new HashMap<>();

        // Populate the valueCountMap with counts of each value
//        for (Integer value : map.values()) {
//            valueCountMap.put(value, valueCountMap.getOrDefault(value, 0) + 1);
//        }
//        System.out.println(valueCountMap);
        // Create a set to store duplicate values
        Set<Integer> duplicates = new HashSet<>();

        // Identify duplicates by checking if the count is greater than 1
//        for (Map.Entry<Integer, Integer> entry : valueCountMap.entrySet()) {
//            if (entry.getValue() > 1) {
//                duplicates.add(entry.getKey());
//            }
//        }
        for (Integer value : map.values()) {
            int count = valueCountMap.getOrDefault(value, 0) + 1;
            valueCountMap.put(value, count);

            // Check if the value is a duplicate
            if (count > 1) {
                duplicates.add(value);
            }
        }



        // Output the duplicates
        System.out.println("Duplicate values: " + duplicates);
    }
}
