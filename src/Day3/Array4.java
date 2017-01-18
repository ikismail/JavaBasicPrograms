package Day3;

public class Array4 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 4, 1, 9, 6, 2, 0 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println(min);
	}
}
