public class SelectionSort{
    static int countcom = 0;
	static int countmove = 0;
	/** The method for sorting the numbers */
	public static void selectionSort(int[] list) { //int[] list?
		for (int i = 0; i < list.length -1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i+1; j < list.length; j++) {
                countcom++;
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
                    countmove++;
				}
			}
			
			//	Swap list[i] wiht list[currentMinIndex[ if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				countmove++;

			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,6,7,8,9,0,1,2,3,4};
		
		selectionSort(arr);
		for(int i = 0; i < arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}		
		
	
		System.out.println();
		System.out.println("Number of Comparison: " + countcom);
		System.out.println("Number of Movement: " + countmove);
	}
}
