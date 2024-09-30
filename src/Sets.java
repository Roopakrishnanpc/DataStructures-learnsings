import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<>();
		set.add("hey");
		set.add("hey");
		set.add("hey");
		set.add("hey");
		set.forEach(System.out::println);
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	       List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana");
	       List<String> list1 = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana"));
	       list.set(0, "orange");
	       list.get(0);
	      // list.remove("apple");//error
	       list1.remove("apple");
	        // Create a Set to track seen elements
	        Set<String> seen = new HashSet<>();
	        
	        Set<String> duplicates = list.stream()
	            .filter(e -> !seen.add(e)) // `add` returns false if the element was already present
	            .collect(Collectors.toSet());
	        duplicates.forEach(System.out::println);
	        System.out.println("Duplicates: " + duplicates);
	        for (String element : list) {
	            // Add the element to 'seen' set
	            // If 'add' returns false, it means the element was already in the set
	            if (!seen.add(element)) {
	                // If the element was already present in 'seen', it's a duplicate
	                duplicates.add(element);
	            }
	        }
	        System.out.println("Duplicates: " + duplicates);
	        set.addAll(list);
	        System.out.println(set);
	        set.contains("hey");
	        Set<String> seenadddinglist = new HashSet<>(list);
	        seenadddinglist.forEach(System.out::println);
	        
	        Map<String, Integer> map = new LinkedHashMap<>();
	        map.put("apple", 1);
	        map.put("banana", 2);
	        map.put("orange", 3);
	        Integer value = map.get("apple");
	        System.out.println("Value for 'apple': " + value); 
	        System.out.println(map.containsKey("aple"));
	        System.out.println(map.containsKey(1));
	        map.clear();
//	        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//	        for (Map.Entry<String, Integer> entry : entrySet) {
//	            System.out.println(entry.getKey() + ": " + entry.getValue());
//	        }
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        map.entrySet().stream()
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	        
	}

}
