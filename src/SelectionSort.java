
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a
		= {12,78,23,67,22};
		for(int n:a)
		{
			System.out.println(n);
		}
		System.out.println("After sorting");
		selectionSort(a);
	}

	private static void selectionSort(int[] a) {
		// TODO Auto-generated method stub
		int minIndex; //maxIndex;
		for(int i=0;i<a.length-1;i++)
		{
			minIndex=i;
			for(int j=i+1;j<a.length;j++)
			{
				//if(a[maxIndex]<a[j]) -> for descending
				if(a[minIndex]>a[j])
				{
					minIndex=j;
				}
			}
			int temp=a[minIndex];
			a[minIndex]=a[i];//a[a.length-1];
			a[i]=temp;//a[a.length-1]=temp;
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
