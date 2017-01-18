package Day3;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int len = sc.nextInt();
		int[] arr = new int[len];

		System.out.println("Enter the Values");

		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Please check the Values: ");
		for (int i : arr) {

			System.out.print(i);
		}
	}

}
