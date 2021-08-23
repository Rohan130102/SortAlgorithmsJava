
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {15,24,-6,54,-33,-85,-5,4,20,89,45};
		for(int i = 1; i<arr.length; i++) {
			int newElement = arr[i]; 
			int j;
			for(j = i; j>0 && arr[j-1] > newElement; j--) { 
				arr[j] = arr[j-1];
			}
			arr[j] = newElement;
		}
		
		for(int z : arr) {
			System.out.print(z + " ");
		}
	}
}
