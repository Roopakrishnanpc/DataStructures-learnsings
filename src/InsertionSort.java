
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a
		= {12,78,23,67,2};
		for(int n:a)
		{
			System.out.println(n);
		}
		System.out.println("After sorting");
		insertionSort(a);
	}

	private static void insertionSort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=1;i<a.length;i++)
		{		
			int key=a[i];//eg i=3
			int j=i-1;// then j=2
			//why i =1 because assumption that 0 is always sorted and comparing through 0 only
				//values = 12 23 78 67 2
				//a[2]=78>67, yes
				//now 78 will go to a[j+1]
				//and 78 place will be empty which is 2
				//again 67 is compared to j-1 value which is 1, is a[1]>67. No so 67 is placed in the index 2 where 78th place was empty through a[j+1]=the key.
				//now key is 22 because i is 4
				//12 23 67 78 2
				//j will be 3 now is a[3]>2 yes 78 is greater so 78 is shifted to ith position 4 or j+1.
				//now comparing with j-1 which is 3-1=2, is a[2]=67>2 no it is less so a[2+1=3], which is 67 is shifted to a[j].
				//j will be 1 now, comparing with 23>2 again 23 shifted to j+1 =2 position
				//j will become 0 now, comparing 12>2 again 12 will be shifted to j+1 position
				//j will become
				while(j >= 0 && a[j]>key)
				{
					//here moving greater value to the next empty space
					a[j+1]=a[j];
					//now j will be subracted which is from 1 to 0 or 2 to 1
					j=j-1;

				}
				//now the j+1 is added to orginal key
			System.out.println(j+" j");
			a[j+1]=key;
			System.out.println("a[j+1] & j+1 = "+(j+1)+" key "+ key);
			System.out.println("Just for debugging purpose to know how it works ");
			for(int n:a)
			{
				System.out.print(n+" ");
			}
		
		
		}
		System.out.println();
		System.out.println("Sorted final Op:");
		for(int n:a)
		{
			System.out.println(n);
		}
	}

}
