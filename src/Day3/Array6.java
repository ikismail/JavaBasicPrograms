package Day3;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 5, 7, 9, 4, 6 };

		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
