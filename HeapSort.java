
public class HeapSort {
	static int compare = 0;
	static int move = 0;


	// public static <E extends Comparable<E>> void heapSort(E[] list) {
	// 	//	Create a Heap of integers
	// 	Heap<E> heap = new Heap<>();
		
	// 	//	Add elements to the heap
	// 	for (int i = 0; i < list.length; i++)
	// 		heap.add(list[i]);
		
	// 	//	Remove elements from the heap
	// 	for (int i = list.length -1; i >= 0; i--)
	// 		list[i] = heap.remove();
	// }



	/** Heap sort method */
	public static <E extends Comparable<E>> void heapSort(E[] list) {
		//	Create a Heap of integers
		Heap<E> heap = new Heap<>();		
		//	Add elements to the heap
		for (int i = 0; i < list.length; i++)
			heap.add(list[i]);
		
		//	Remove elements from the heap
		for (int i = list.length -1; i >= 0; i--){
			list[i] = heap.remove();
		}
	

		compare = Heap.countcom;
		move = Heap.countmove;
		 
		
	}
	
	
	public static void main(String[] args) {
		Integer[] list = {0,1,2,3,4,5,6,7,8,9};
		heapSort(list);
		for(int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
		System.out.println("Number of Comparison: " + Heap.countcom);
		System.out.println("Number of Movement: " + Heap.countmove);
	}


   


	
}