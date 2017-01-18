package Day3;

public class Array1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		int[] arr1 = { 2, 3, 5 };
		int[] sum = new int[3];
		for (int i = 0; i < arr.length; i++) {
			sum[i] = arr[i] + arr1[i];
		}
		for (int i : sum) {
			System.out.print(i +" ");
		}
	}
}
