
public class InsertionSort {
	static int countcom = 0;
	static int countmove = 0;
	/**The method for sorting the numbers */
	public static void insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			/** Insert list[i] into a sorted sublist list[0..i-1] so that 
			 * 	list[0..i] is sorted
			 */
			int currentElement = list[i];
			int k;
			countcom++;
			for (k = i-1; k>= 0 && list[k] > currentElement; k--) {
				list[k+1] = list[k];
				countmove++;
				countcom++;
			}
			
			
			//insert the current element into list[k + 1]
			list[k + 1] = currentElement;
			
		}
	}
	// public static void main(String[] args) {
		
	// 	int[] list = {5,6,7,8,9,0,1,2,3,4};
			
		
	// 	insertionSort(list);
	// 	for(int i = 0; i < list.length;i++)
	// 	{
	// 		System.out.print(list[i]+ " ");
	// 	}	
		
	// 	System.out.println();
	// 	System.out.println("Number of Comparison: " + countcom);
	// 	System.out.println("Number of Movement: " + countmove);
	// }
	
}
