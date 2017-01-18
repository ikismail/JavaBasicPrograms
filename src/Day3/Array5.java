package Day3;

public class Array5 {

	private static void sum(int[] arr1, int[] arr2) {
		int len = 0;
		if (arr1.length > arr2.length)
			len = arr1.length;
		else {
			len = arr2.length;
		}

		System.out.println("Length: " + len);
		int[] sum = new int[len];
		for (int i = 0; i < len; i++) {
			sum[i] = arr1[i] + arr2[i];
		}

		System.out.println("Sum of two Arrays");
		for (int i : sum) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 1, 3, 5, 7,8 };
		try {
			sum(arr1, arr2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Please choose exact length");
		}
	}
}
