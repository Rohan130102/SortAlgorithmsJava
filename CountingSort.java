public class CountingSort {
	
	public static void main(String[] args) {
		int[] arr = {1,4,5,2,7,3,5,6,2,4,2,1,10,4,2,6,10};
		countingSort(arr,1,10);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void countingSort(int[] input, int min, int max) {
		int[] countArray = new int[(max-min)+1];
		for(int i = 0; i < input.length; i++) {
			countArray[input[i] - min]++;
		}
		int j = 0;
		for(int i = min; i <= max; i++) {
			while(countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;
			}
		}
	}
}
