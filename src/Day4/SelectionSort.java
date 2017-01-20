package Day4;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 6, 1, 9, 7 };
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int iMin = i;
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[iMin])
					iMin = j;
				int temp = arr[i];
				arr[i] = arr[iMin];
				arr[iMin] = temp;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
