
public class ShellSort {

	public static void main(String[] args) {
		int[] arr = {15,24,-6,54,-33,-85,-5,4,20,89,45};
		for(int gap = arr.length/2; gap>0; gap /=2) {
			for(int i = gap; i<arr.length; i++) {
				int newElement = arr[i];
				int j = i;
				while(j>=gap && arr[j-gap]>newElement) {
					arr[j] = arr[j-gap];
					j -= gap;
				}
				arr[j] = newElement;
			}
		}
		
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
