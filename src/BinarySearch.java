import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a
		= {12,78,23,67,22};
		//new int[10000];
		Arrays.sort(a);
		int target = 78;
		int result = binarysearch(a, target);
        
        // Output the result
        if (result == -1) {
            System.out.println("The given element is not in the array.");
        } else {
            System.out.println("The target is in index " + result);
        }
        int resultRecursive = binarysearch(a, target, 0, a.length - 1);
        
        // Output the result
        if (resultRecursive == -1) {
            System.out.println("The given element is not in the array.");
        } else {
            System.out.println("The target is in index " + resultRecursive);
        }
        int result1 = binarySearchUsingStream(a, target);
        
        // Output the result
        if (result1 == -1) {
            System.out.println("The given element is not in the array.");
        } else {
            System.out.println("The target is in index " + result1);
        }
	}





    // Recursive binary search method
    public static int binarysearch(int[] a, int target, int left, int right) {
        if (left <= right) {
            int middle = (left + right) / 2;
            
            if (a[middle] == target) {
                return middle;
            } else if (a[middle] < target) {
                return binarysearch(a, target, middle + 1, right);
            } else {
                return binarysearch(a, target, left, middle - 1);
            }
        }
        return -1; // Target not found
    }
	public static int binarysearch(int[] a,int target)
	{	
		int steps=0;
		int left=0;
		int right=(a.length-1);
		int middle=(left+right)/2;
		while (left <=right)
		{
			steps++;
			middle=(left+right)/2;
			if(a[middle]==target)
			{
				System.out.println("Number of stepts taken"+steps);
				return middle;
			}//14<78
			else if(a[middle]<target)
			{
				left=middle+1;
			}
			else
			{
				right=middle -1;
			}
		}
		System.out.println("Number of stepts taken"+steps);
		return -1;
	}
    public static int binarySearchUsingStream(int[] a, int target) {
    	//below will not work
        int left = 0;
        int right = a.length - 1;

        OptionalInt result = IntStream.range(0, a.length)
                                      .filter(i -> {
                                          int mid = (left + right) / 2;
                                          return a[mid] == target;
                                      })
                                      .findFirst();

        return result.orElse(-1);
    }
}
