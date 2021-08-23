
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {15,24,-6,54,-33,-85,-5,4,20,89,45};
		for(int i = arr.length - 1; i>0; i--) { 
			int largest = 0; 
			for(int j = 1; j<= i; j++) { 
				if(arr[j] > arr[largest]) {
					largest = j;
				}
			}
			swap(arr, largest, i);
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void swap(int[] arr, int largest, int i) {
		if(largest == i) {
			return;
		}
		int temp = arr[largest];
		arr[largest] = arr[i];
		arr[i] = temp;
	}
}
