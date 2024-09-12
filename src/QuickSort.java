
public class QuickSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a
		= {12,167,82,2};
		//= {12,78,23,67,2};
		for(int n:a)
		{
			System.out.print(n+ " ");
		}
		System.out.println();

		quickSort(a,0,a.length-1);
		System.out.println("After sorting");
		for(int n:a)
		{
			System.out.print(n+" ");
		}
	}

	private static void quickSort(int[] a,int low, int high) {
		
		//pivot can be anything pivot=a[a.length-1];
		//int i;
		if(low<high)
		{

			int pivot=partition(a,low,high);
			System.out.println("pivot = "+pivot );
			//since breaking into two parts
			System.out.println("Started first quick sort with left<right= "+low+"<"+(pivot-1)+ " pivot="+pivot+" low = "+low+" pivot-1 as high= "+(pivot-1)+" high=" +high );
			quickSort(a,low,pivot-1);//always low for first array
			System.out.println("Complted first quick sort pivot = "+pivot+" low = "+low+" pivot-1 as high= "+(pivot-1)+" high=" +high );
			//System.out.println("low = "+low+" pivot = "+(pivot-1) );
			for(int n:a)
			{
				System.out.print(n + " ");
			}
			System.out.println();
			System.out.println("Started second quick sort with left<right="+(pivot+1)+"<"+high+" pivot = "+pivot+"(pivot+1) as low "+(pivot+1)+" high = "+high+" low="+low );
			quickSort(a,pivot+1,high);//always high for second array
			System.out.println("Complted second quick sort pivot = "+pivot+" (pivot+1) as low "+(pivot+1)+" high = "+high+" low="+low );
			
			for(int n:a)
			{
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
	}

	private static int partition(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int pivot=a[high];//a[a.length-1]
		System.out.println("a[high]= "+a[high]+ " pivot="+pivot+" high="+high+" low="+low+" i=low-1 which is "+(low-1));
		int i=low-1;
		for(int j=low;j<=high;j++)
		{
			if(a[j]<pivot)
			{			
				i++;
				swap(a, i,j);
				System.out.println("i "+i+ " j "+j);
			}
		}
		System.out.println("i="+i+" high="+high+" i+1="+(i+1));
		swap(a, i+1,high);
		System.out.println("sorting debug ");
		for(int n:a)
		{
			System.out.print(n + " ");
		}
		System.out.println();
		return i+1;
	}

	private static void swap(int[] a,int i, int j) {
		// TODO Auto-generated method stub
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	
}
