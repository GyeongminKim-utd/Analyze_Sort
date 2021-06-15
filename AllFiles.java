import java.util.concurrent.TimeUnit;
import java.util.*;

public class AllFiles {
    //----------------Print functions-------------------
    static void insertPrint() {
        System.out.println ("Number of Comparison: " + InsertionSort.countcom);
        System.out.println ("Number of Movement: " + InsertionSort.countmove);
        InsertionSort.countcom = 0;
        InsertionSort.countmove = 0;
    }

    static void selectPrint() {
        System.out.println ("Number of Comparison: " + SelectionSort.countcom);
        System.out.println ("Number of Movement: " + SelectionSort.countmove);
        SelectionSort.countcom = 0;
        SelectionSort.countmove = 0;
    }

    static void heapPrint() {        
        System.out.println ("Number of Comparison: " + HeapSort.compare);
        System.out.println ("Number of Movement: " + HeapSort.move);
        HeapSort.compare = 0;
        HeapSort.move = 0;
    }

    static void radixPrint() {
        System.out.println ("Number of Comparison: " + RadixSort.countcom);
        System.out.println ("Number of Movement: " + RadixSort.countmove);
        RadixSort.countcom = 0;
        RadixSort.countmove = 0;
    }

    static void quickPrint() {
        System.out.println ("Number of Comparison: " + QuickSort.countcom);
        System.out.println ("Number of Movement: " + QuickSort.countmove);
        QuickSort.countcom = 0;
        QuickSort.countmove = 0;
    }

    static void mergePrint() {
        System.out.println ("Number of Comparison: " + MergeSort.countcom);
        System.out.println ("Number of Movement: " + MergeSort.countmove);
        MergeSort.countcom = 0;
        MergeSort.countmove = 0;
    }

    //------------------------set array---------------------------
    static void setReverse(int[]reverse ,int size) {
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            reverse[j++] = i;
        }
    }
    static void setReverseInt(Integer[]reverse ,int size) {
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            reverse[j++] = i;
        }
    }


    static void setRandom(int[]random ,int size) {
        for (int i = 0; i < size; i++) {
            random[i] = (int)(Math.random() * size + 1);
        }
    }
    static void setRandomInt(Integer[] random ,int size) {
        for (int i = 0; i < size; i++) {
            random[i] = (int)(Math.random() * size + 1);
        }
    }
    
    static void setAlmost(int[] almost, int[] inorder, int size) {
        int k = size / 2;
        int s = size / 2;
        for (int i = 0; i < size/2; i++) {
            almost[i] = inorder[k++];
        }
        for(int n =0; n < size/2; n++) {
            almost[s++] = inorder[n];
        }
    }   
    static void setAlmostInt(Integer[] almost, Integer[] inorder, int size) {
        int k = size / 2;
        int s = size / 2;
        for (int i = 0; i < size/2; i++) {
            almost[i] = inorder[k++];
        }
        for(int n =0; n < size/2; n++) {
            almost[s++] = inorder[n];
        }
    }   

    //----------------------Main-----------------------------------
    public static void main (String[] args) {
       
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter the size: ");
        int a = sc.nextInt();
        int[] inorder = new int[a];
        Integer[] inorderInt = new Integer[a];
        Integer[] reverseorderInt = new Integer[a];	
        Integer[] randomorderInt = new Integer[a];
        Integer[] almostorderInt = new Integer[a];	
		int[] reverseorder = new int[a];
		int[] randomorder = new int[a];
		int[] almostorder = new int[a];
        sc.close();

        //set inorder array
        for (int i = 0; i < a; i++) {
            inorder[i] = i;
            inorderInt[i] = i;
        }

        // display inorder result
        System.out.println("----------------SORT IN ORDER----------------");
       
        //Insertion - inorder
        long start = System.nanoTime();
        System.out.println ("Insertion");
		InsertionSort.insertionSort (inorder);
	    long end = System.nanoTime();
        long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);        insertPrint();
		System.out.println ("Time spend in ms: " + timeInMillis);
		System.out.println();

        //selection - inorder
        long start1 = System.nanoTime();
        System.out.println ("Selection");
		SelectionSort.selectionSort (inorder);
	    long end1 = System.nanoTime();
        long timeInMillis1 = TimeUnit.MILLISECONDS.convert(end1 - start1, TimeUnit.NANOSECONDS);        insertPrint();
        selectPrint();
		System.out.println ("Time spend in ms: " + timeInMillis1);
		System.out.println();
        
        //Heap - inorder
        long start2 = System.nanoTime();
        System.out.println ("Heap");
		HeapSort.heapSort(inorderInt);
	    long end2 = System.nanoTime();
		long timeInMillis2 = TimeUnit.MILLISECONDS.convert(end2 - start2, TimeUnit.NANOSECONDS);
        heapPrint();
		System.out.println ("Time spend in ms: " + timeInMillis2);
		System.out.println();

        //Radix - inorder
        long start3 = System.nanoTime();
        System.out.println ("Radix");
		RadixSort.radixsort (inorder, a);
	    long end3 = System.nanoTime();
		long timeInMillis3 = TimeUnit.MILLISECONDS.convert(end3 - start3, TimeUnit.NANOSECONDS);
        radixPrint();
		System.out.println ("Time spend in ms: " + timeInMillis3);
		System.out.println();

        //Quick - inorder
        // long start4 = System.nanoTime();
        // System.out.println ("Quick");
		// QuickSort.quickSort (inorder);
        // QuickSort.quickSort(inorder, a/2, a-1);
	    // long end4 = System.nanoTime();
		// long timeInMillis4 = TimeUnit.MILLISECONDS.convert(end4 - start4, TimeUnit.NANOSECONDS);
        // quickPrint();
		// System.out.println ("Time spend in ms: " + timeInMillis4);
		// System.out.println();

        //display reverseorder result
        System.out.println("-------------------SORT REVERSE ORDER----------------");

        //Insertion - reverseorder
        long start6 = System.nanoTime();
        System.out.println ("Insertion");
        setReverse(reverseorder, a);
		InsertionSort.insertionSort(reverseorder);
	    long end6 = System.nanoTime();
		long timeInMillis6 = TimeUnit.MILLISECONDS.convert(end6 - start6, TimeUnit.NANOSECONDS);
        insertPrint();
		System.out.println ("Time spend in ms: " + timeInMillis6);
		System.out.println();

        //Selection - reverseorder
        long start7 = System.nanoTime();
        System.out.println ("Selection");
        setReverse(reverseorder, a);
		SelectionSort.selectionSort (reverseorder);
	    long end7 = System.nanoTime();
		long timeInMillis7 = TimeUnit.MILLISECONDS.convert(end7 - start7, TimeUnit.NANOSECONDS);
        selectPrint();
		System.out.println ("Time spend in ms: " + timeInMillis7);
		System.out.println();
        
       // Heap - reverseorder
        long start8 = System.nanoTime();
        System.out.println ("Heap");
        setReverseInt(reverseorderInt, a);
		HeapSort.heapSort(reverseorderInt);
	    long end8 = System.nanoTime();
		long timeInMillis8 = TimeUnit.MILLISECONDS.convert(end8 - start8, TimeUnit.NANOSECONDS);
        heapPrint();
		System.out.println ("Time spend in ms: " + timeInMillis8);
		System.out.println();

        //Radix - reverseorder
        long start9 = System.nanoTime();
        System.out.println ("Radix");
        setReverse(reverseorder, a);
		RadixSort.radixsort (reverseorder, a);
	    long end9 = System.nanoTime();
		long timeInMillis9 = TimeUnit.MILLISECONDS.convert(end9 - start9, TimeUnit.NANOSECONDS);
        radixPrint();
		System.out.println ("Time spend in ms: " + timeInMillis9);
		System.out.println();

        //Quick - reverseorder
        // long start10 = System.nanoTime();
        // System.out.println ("Quick");
        // setReverse(reverseorder, a);
		// QuickSort.quickSort (reverseorder);
        // QuickSort.quickSort(reverseorder, a/2, a-1);
	    // long end10 = System.nanoTime();
		// long timeInMillis10 = TimeUnit.MILLISECONDS.convert(end10 - start10, TimeUnit.NANOSECONDS);
        // quickPrint();
		// System.out.println ("Time spend in ms: " + timeInMillis10);
		// System.out.println();

        //display randomorder result
        System.out.println("-------------SORT RANDOM ORDER---------------");

        //Insertion - randomorder
        long start12 = System.nanoTime();
        System.out.println ("Insertion");
        setRandom(randomorder, a);
		InsertionSort.insertionSort(randomorder);
	    long end12 = System.nanoTime();
		long timeInMillis12 = TimeUnit.MILLISECONDS.convert(end12 - start12, TimeUnit.NANOSECONDS);
        insertPrint();
		System.out.println ("Time spend in ms: " + timeInMillis12);
		System.out.println();

        //Selection - randomorder
        long start13 = System.nanoTime();
        System.out.println ("Selection");
        setRandom(randomorder, a);
       	SelectionSort.selectionSort (randomorder);
	    long end13 = System.nanoTime();
		long timeInMillis13 = TimeUnit.MILLISECONDS.convert(end13 - start13, TimeUnit.NANOSECONDS);
        selectPrint();
		System.out.println ("Time spend in ms: " + timeInMillis13);
		System.out.println();

        //Heap - randomorder
        long start14 = System.nanoTime();
        System.out.println ("Heap");
        setRandomInt(randomorderInt, a);
		HeapSort.heapSort(randomorderInt);
	    long end14 = System.nanoTime();
		long timeInMillis14 = TimeUnit.MILLISECONDS.convert(end14 - start14, TimeUnit.NANOSECONDS);
        heapPrint();
		System.out.println ("Time spend in ms: " + timeInMillis14);
		System.out.println();

        //Radix - randomorder
        long start15 = System.nanoTime();
        System.out.println ("Radix");
        setRandom(randomorder, a);
		RadixSort.radixsort (randomorder, a);
	    long end15 = System.nanoTime();
		long timeInMillis15 = TimeUnit.MILLISECONDS.convert(end15 - start15, TimeUnit.NANOSECONDS);
        radixPrint();
		System.out.println ("Time spend in ms: " + timeInMillis15);
		System.out.println();

        //Quick - randomorder
        // long start16 = System.nanoTime();
        // System.out.println ("Quick");
        // setRandom(randomorder, a);
		// QuickSort.quickSort (randomorder);
        // QuickSort.quickSort(randomorder, a/2, a-1);
	    // long end16 = System.nanoTime();
		// long timeInMillis16 = TimeUnit.MILLISECONDS.convert(end16 - start16, TimeUnit.NANOSECONDS);
        // quickPrint();
		// System.out.println ("Time spend in ms: " + timeInMillis16);
		// System.out.println();

        //display almostorder result

        //Insertion - almostorder
        System.out.println("-------------------SORT ALMOST ORDER-----------------");
        long start18 = System.nanoTime();
        System.out.println ("Insertion");
        setAlmost(almostorder, inorder, a);
		InsertionSort.insertionSort(almostorder);
	    long end18 = System.nanoTime();
		long timeInMillis18 = TimeUnit.MILLISECONDS.convert(end18 - start18, TimeUnit.NANOSECONDS);
        insertPrint();
		System.out.println ("Time spend in ms: " + timeInMillis18);
		System.out.println();

        //Selection - almostorder
        long start19 = System.nanoTime();
        System.out.println ("Selection");
        setAlmost(almostorder, inorder, a);
		SelectionSort.selectionSort (almostorder);
	    long end19 = System.nanoTime();
		long timeInMillis19 = TimeUnit.MILLISECONDS.convert(end19 - start19, TimeUnit.NANOSECONDS);
        selectPrint();
		System.out.println ("Time spend in ms: " + timeInMillis19);
		System.out.println();

        //Heap - almostorder
        long start20 = System.nanoTime();
        System.out.println ("Heap");
        setAlmostInt(almostorderInt, inorderInt, a);
		HeapSort.heapSort(almostorderInt);
	    long end20 = System.nanoTime();
		long timeInMillis20 = TimeUnit.MILLISECONDS.convert(end20 - start20, TimeUnit.NANOSECONDS);
        heapPrint();
		System.out.println ("Time spend in ms: " + timeInMillis20);
		System.out.println();

        //Radix - almostorder
        long start21 = System.nanoTime();
        System.out.println ("Radix");
        setAlmost(almostorder, inorder, a);
        RadixSort.radixsort (almostorder, a);
        long end21 = System.nanoTime();
        long timeInMillis21 = TimeUnit.MILLISECONDS.convert(end21 - start21, TimeUnit.NANOSECONDS);
        radixPrint();
        System.out.println ("Time spend in ms: " + timeInMillis21);
        System.out.println();

        //Quick - almostorder
        // long start22 = System.nanoTime();
        // System.out.println ("Quick");
        // setAlmost(almostorder, inorder, a);
		// QuickSort.quickSort (almostorder);
        // QuickSort.quickSort(almostorder, a/2, a-1);
	    // long end22 = System.nanoTime();
		// long timeInMillis22 = TimeUnit.MILLISECONDS.convert(end22 - start22, TimeUnit.NANOSECONDS);
        // quickPrint();
		// System.out.println ("Time spend in ms: " + timeInMillis22);
		// System.out.println();

    }

}
