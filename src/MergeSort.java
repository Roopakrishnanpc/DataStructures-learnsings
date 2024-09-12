public class MergeSort {

    public static void main(String[] args) {
        int[] a = {12, 167, 31, 82, 2};

        System.out.println("Before sorting:");
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();

        mergeSort(a, 0, a.length - 1);

        System.out.println("After sorting:");
        for (int n : a) {
            System.out.print(n + " ");
        }
    }

    private static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int median = (left + right) / 2;
            System.out.println("median = (left + right) / 2="+((left + right) / 2));
            System.out.println("median="+median+" left="+left+" right="+right);
            // Recursively sort the two halves
            System.out.println("First will check for left<right condition and goes inside started mergeSort(a, left, median); median="+median+", left="+left+", right here wil be median ="+median);
            mergeSort(a, left, median);
            System.out.println("Completed first mergeSort(a, left, median); median="+median+", left="+left+", right here will be median="+median);
            System.out.println("Second merge sort will check for left<right condition and goes inside started mergeSort(a, median+1,right); median="+(median)+", left here will be median +1="+(median+1)+", right="+right);
            mergeSort(a, median + 1, right);
            System.out.println("Completed Second mergeSort(a, median+1,right); median="+(median)+", left here will be median +1="+(median+1)+", right="+right);
            // Merge the sorted halves
            merge(a, left, median, right);
            System.out.println("Mege completed");
        }
    }

    private static void merge(int[] a, int left, int median, int right) {
    	//lets say [12 34 21 87 2]
    	//0+4/2=2 is median for first time 
    	//2-0+1=3 -> [12 34 21] -> median is 1 here and n1 is 2 -> [12 34] and n2 is 2-1 =1 -> [21] -> median=1 left=0 right=2 n1=2 n2=1
    	//[12 34] -> 0+1/2= 0 median is 0 left is 0 right is 1 median=0 left=0 right=1 so n1 will be n1=1 and n2=1 12 34 will remain same
    	//4-2=2 -> [87 2] -> now median will be 3,  left will be 3 and right will be 4 n1=1(3-3+1), n2=1(4-3) left array will be 87 and right will be 2 the comparision so result sent is 2 87 sorted
    	
        int n1 = median - left + 1;
        int n2 = right - median;
        System.out.println("median="+median+" left="+left+" right="+right+" n1="+n1+" n2="+n2);
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = a[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = a[median + 1 + j];
        }
        System.out.println("left array ");
        for(int i:leftArr)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("right array ");
        for(int i:rightArr)
        {
        	System.out.print(i+" ");
        }
        // Merge the temporary arrays back into the main array
        int i = 0, j = 0, k = left;
        System.out.println();
        
        while (i < n1 && j < n2) {
        	System.out.println("i="+i+" j="+j+" n1="+n1+" n2="+n2+" left="+left+" i<n1 ="+i+"<"+n1+ " && j<n2 ="+j+"<"+n2+" k="+k);
        	System.out.println("leftArr[i] <= rightArr[j] "+leftArr[i] +"<="+ rightArr[j]);
            if (leftArr[i] <= rightArr[j]) {//if error include i<=0
            	System.out.println("a[k] = leftArr[i]; a[k]="+a[k] +" leftArr[i]= "+leftArr[i]+" i="+i);
            	a[k] = leftArr[i];
                System.out.println("a[k] = leftArr[i]; a[k]="+a[k] +" leftArr[i]= "+leftArr[i]+" i="+i);
                i++;
                System.out.print(" i++ ="+(i));
            } else {
            	System.out.println("a[k] = rightArr[j]; a[k]="+a[k] +" rightArr[j]= "+rightArr[j]+" j="+j);
                a[k] = rightArr[j];
                System.out.println("a[k] = rightArr[j]; a[k]="+a[k] +" rightArr[j]= "+rightArr[j]+" j="+j);
                j++;
                System.out.print(" j++ ="+(j));
            }
            k++;
            System.out.println(" k="+k);
        }
        System.out.println();
        System.out.println("orginal array before copy of left elements ");
        for(int result:a)
        {
        	System.out.print(result +" ");
        }
        System.out.println();
        // Copy remaining elements of leftArr[], if any
        while (i < n1) {
        	System.out.println(" k="+k+" a[k]="+a[k] +" leftArr[i]= "+leftArr[i]+ " i="+i);
            a[k] = leftArr[i];
            System.out.println(" k="+k+" a[k]="+a[k] +" leftArr[i]= "+leftArr[i]+ " i="+i);
            i++;
            k++;
            System.out.println(" i="+i+" k="+k+" i<n1="+i+"<"+n1);
        }

        // Copy remaining elements of rightArr[], if any
        while (j < n2) {
        	System.out.println(" k="+k+" a[k]="+a[k] +" rightArr[j]= "+rightArr[j]+" j="+j);
            a[k] = rightArr[j];
            System.out.println(" k="+k+" a[k]="+a[k] +" rightArr[j]= "+rightArr[j]+" j="+j);
            j++;
            k++;
            System.out.println(" j="+j+" k="+k+" j<n2="+j+"<"+n2);
        }
        
        System.out.println();
        System.out.println("orginal array ");
        for(int result:a)
        {
        	System.out.print(result +" ");
        }
        System.out.println();
    }
}
