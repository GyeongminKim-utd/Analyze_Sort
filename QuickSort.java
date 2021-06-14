public class QuickSort {
	static int countcom = 0;
	static int countmove = 0;

	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length-1);
	}
	
	public static void quickSort(int[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex -1);
			quickSort(list, pivotIndex + 1, last);
			
		}

	}
	
	/** Partition the array list[first..last] */
	public static int partition(int[] list, int first, int last) {
		int pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; //Index for backward search
		
		while (high > low) {
			// Search forward from left
			while (low <= high && list[low] <= pivot){
				countcom++;
				low++;
			}
			
			// Search backward from right
			while (low <= high && list[high] > pivot){
				countcom++;
				high--;
			}
			
			//	Swap two elements in the list
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
				countmove++;
			}
		}
		
		while (high > first && list[high] >= pivot)
			high--;
		
		//	Swap pivot with list[high]
		if (pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot; 
			countmove++;
			return high;
		}
		else {
			return first;
		}
	}

	public static void main(String[] args) {
		int list[] = { 5,6,7,8,9,0,1,2,3,4 };
		quickSort(list);
		quickSort(list, list.length/2, list.length-1);
		for (int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}
			System.out.println();
			System.out.println("Number of Comparison: " + countcom);
			System.out.println("Number of Movement: " + countmove);
	}
	
}