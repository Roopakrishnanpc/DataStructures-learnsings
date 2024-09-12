
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a
		= {12,78,23,67,22};
		for(int n:a)
		{
			System.out.println(n);
		}
		System.out.println("After sorting");
		bubbleSort(a);
	}

	private static void bubbleSort(int[] a) {
		// TODO Auto-generated method stub
		for(int k=0;k<a.length;k++)
		{
			//for(int i=0;i<(a.length-1);i++) //it will still work below is correct because it will not iterate the sorted value again and again
			for(int i=0;i<(a.length-1-k);i++)
			{
			///	if(a[i]>a[i+i])
				if(a[i] > a[i + 1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
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
