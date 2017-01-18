package Day3;

public class Array10 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 7, 6, 9, 1 };
		int sum = 0;
		int mul = 1;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			mul *= arr[i];
		}
		System.out.println("Array List \n");
		for (int i : arr) {
			System.out.print(i);
		}
		System.out.println("Maximum Number in Integer");
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println("Maximum Number in the list: " + max);
		System.out.println("\nAddition of Integers: " + sum);

		System.out.println("Multiplication of Integers: " + mul);

	}
}
