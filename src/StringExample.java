import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj1="Hello";
		obj1=obj1.concat(" Yes");
		System.out.println(obj1);
		System.out.println(obj1.concat(" Yes"));
		System.out.println(obj1.substring(1,3));
		StringBuffer buff=new StringBuffer();
		List<Integer> obj3 = Arrays.asList(1, 2, 3, 4, 5);// List.of(0, 1, 2, 3, 4); 
		IntStream.range(0, 5).allMatch(i -> obj3.contains(i));
		
        List<String> stringList = Arrays.asList("hello", "world", "java", "streams");// List.of("hello", "world", "java", "streams");

        boolean allNonEmpty = IntStream.range(0, stringList.size())
            .allMatch(i -> !stringList.get(i).isEmpty());
		//buff.
		
		buff.append("Hello");
        buff.append(" World");
        
        // Print the contents of the buffer
        System.out.println("StringBuffer content: " + buff.toString()); // Output: Hello World
        
        // Modify the buffer content
        buff.insert(6, "Java ");
        System.out.println("After insert: " + buff.toString()); // Output: Hello Java World
        
        // Reverse the buffer content
        buff.reverse();
        System.out.println("After reverse: " + buff.toString()); // Output: dlroW avaJ olleH
        
        // Replace part of the buffer
        buff.reverse(); // Reversing again to get original content
        buff.replace(6, 10, "Beautiful");
        System.out.println("After replace: " + buff.toString()); // Output: Hello Beautiful World
        
        // Delete part of the buffer
        buff.delete(6, 16);
        System.out.println("After delete: " + buff.toString());
	}

}
