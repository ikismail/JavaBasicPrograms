package Day4;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 4, 1, 5, 3 };
		int i, d, temp;
		for (i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int k : arr) {
			System.out.print(k + " ");
		}
	}
}
