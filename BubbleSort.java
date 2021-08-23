public class BubbleSort {
	public static void main(String[] args) {

		int[] a = { 20, 35, -15, 7, 55, 1, -22 };

		for (int j = a.length - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static void swap(int[] array, int i, int j) {

		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}
