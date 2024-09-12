import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a//new int[5];
		= {12,78,23,67,22};
		Arrays.sort(a);
		int result=linearSearch(a,78);
		
		if(result==-1)
		{
			System.out.println("The gien element is not in the array");
		}
		else
		{
			System.out.println("The target is in index "+result);
		}
        int target = 78;
        int resulta = findIndexUsingStreams(a, target);
        
        // Output the result
        if (result == -1) {
            System.out.println("The given element is not in the array.");
        } else {
            System.out.println("The target is in index " + resulta);
        }

        int result1 = findIndexUsingStreams(a, target);

        // Output the result
        if (result1 == -1) {
            System.out.println("The given element is not in the array.");
        } else {
            System.out.println("The target is in index " + result1);
        }
	}
    public static int findIndexUsingStreams(int[] array, int target) {
        OptionalInt indexOpt = IntStream.range(0, array.length)
                                        .filter(i -> array[i] == target)
                                        .findFirst(); // Find the first matching index

        return indexOpt.orElse(-1); // Return -1 if not found
    }
	public static int linearSearch(int[] a, int target)
	{
		int steps=0;
		int num=a.length;
		for(int i=0; i<=num-1;i++)
		{
			
			steps++;
			if(a[i]==target)
			{
				System.out.println("Number of stepts taken"+steps);
				return i;
				//System.out.print(target+" is in the " +i);
				//break;
			}
		}
		System.out.println("Number of stepts taken"+steps);
		return -1;
	}
    public static int findIndexUsingStreamsArray(int[] array, int target) {
        return Arrays.stream(array)
                     .boxed() // Convert int[] to Stream<Integer>
                     .collect(Collectors.toList()) // Collect elements to a List
                     .indexOf(target); // Find index of the target in the List
    }
}
