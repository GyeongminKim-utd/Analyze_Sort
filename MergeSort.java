
public class MergeSort {
	static int countcom = 0;
	static int countmove = 0;
	/**	The method for sorting the numbers */
	public static void mergeSort(int[] list) {
		if (list.length > 1) {
			//	Merge sort the first half
			int [] firstHalf = new int[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);

			mergeSort(firstHalf); //[2,3] [2] [5]
			//[2,3,2,5,6]
			//Merge sort the second half  [2,5,6]
			int secondHalfLength = list.length - list.length / 2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list, list.length / 2, 
				secondHalf, 0, secondHalfLength);

			mergeSort(secondHalf);		//[2,5,6] [5,6] [6]
			
			//	Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, list);
		}
	}
	
	/** Merge two sorted list */
	public static void merge(int[] list1, int[] list2, int[] temp) {
		int current1 = 0; // Current index in list1
		int current2 = 0; // Current index in list2
		int current3 = 0; // Current index in temp
		
		while (current1 < list1.length && current2 < list2.length) {
			countcom++;
			if (list1[current1] < list2[current2]){
				temp[current3++] = list1[current1++];
				countmove++;
			}
			else{
				temp[current3++] = list2[current2++];
				countmove++;
			}
		}
		while (current1 < list1.length){
			temp[current3++] = list1[current1++];
			countmove++;
		}
		
		while (current2 < list2.length){
			temp[current3++] = list2[current2++];
			countmove++;
		}	
	}
	
	
	public static void main(String[] args) {
		
		int[] list = new int[50000];
		for(int i = 0; i < list.length;i++)
		{
			list[i] = i;
		}		
		
		mergeSort(list);
		
		System.out.println();
		System.out.println("Number of Comparison: " + countcom);
		System.out.println("Number of Movement: " + countmove);
	}
	
}

/*
mergesort first half and when it gets the point where first half cant not be run anymore, then go to second half 
then do the merge 

only # of comparison will change  and movement will remain same in any order because no matter the array is in inorder or reversed order, the mergesort function
will divides array until the size is equal to 1 and merge function will do the movement.
*/