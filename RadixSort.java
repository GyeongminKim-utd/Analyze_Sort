import java.util.*;

class RadixSort {
	static int countcom = 0;
	static int countmove = 0;
	static int getMax(int arr[], int n) {
		int mx = arr[0];
		for (int i = 1; i < n; i++)
			if (arr[i] > mx)
				mx = arr[i];
		return mx;
	}

	static void countSort(int arr[], int n, int exp) {
		int output[] = new int[n];
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);
		for (i = 0; i < n; i++)
			count[(arr[i] / exp) % 10]++;
		// Change count[i] so that count[i] now contains
		// actual position of this digit in output[]
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];
		// Build the output array
		for (i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
			countcom++;
		}
		for (i = 0; i < n; i++){
			arr[i] = output[i];
			countmove++;
		}
	}

	static void radixsort(int arr[], int n) { // Find the maximum number to know number of digits
		int m = getMax(arr, n);
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(arr, n, exp);
	}

	static void print(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		int arr[] = { 5,6,7,8,9,0,1,2,3,4};
		int n = arr.length;
		print(arr, n);
		radixsort(arr, n);
		print(arr, n);
		System.out.println("Number of Comparison: " + countcom);
	 	System.out.println("Number of Movement: " + countmove);
	}
	
}