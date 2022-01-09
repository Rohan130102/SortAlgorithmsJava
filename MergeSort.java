
public class MergeSort {

	public static void mergeSort(int[] inputArray) {
		int inputArrayLength = inputArray.length;
		if (inputArrayLength < 2) {
			return;
		}
		int mid = inputArrayLength / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[inputArrayLength - mid];
		for (int i = 0; i < mid; i++) {
			leftArray[i] = inputArray[i];
		}
		for (int i = mid; i < inputArrayLength; i++) {
			rightArray[i - mid] = inputArray[i];
		}

		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, inputArray); //merge left and right array into the input array
	}

	public static void merge(int[] leftArray, int[] rightArray, int[] inputArray) {

		int leftArrayIndex = 0;
		int rightArrayIndex = 0;
		int inputArrayIndex = 0;
		
		while(leftArrayIndex < leftArray.length  &&  rightArrayIndex < rightArray.length) {
			if(leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]) {
				inputArray[inputArrayIndex] = leftArray[leftArrayIndex];
				leftArrayIndex++;
				inputArrayIndex++;
			}else {
				inputArray[inputArrayIndex] = rightArray[rightArrayIndex];
				rightArrayIndex++;
				inputArrayIndex++;
			}
		}
		
		while(leftArrayIndex < leftArray.length) {
			inputArray[inputArrayIndex] = leftArray[leftArrayIndex];
			leftArrayIndex++;
			inputArrayIndex++;
		}
		
		while(rightArrayIndex < rightArray.length) {
			inputArray[inputArrayIndex] = rightArray[rightArrayIndex];
			rightArrayIndex++;
			inputArrayIndex++;
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 4, 5, 8, 6, 49, 16 };
		
		mergeSort(a);
		
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}
