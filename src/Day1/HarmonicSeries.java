package Day1;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Digits");

		int num = sc.nextInt();
		int i = 1;
		double sum = 0;
		while (i <= num) {
			System.out.print("1/" + i+ " + ");
			sum = sum +(double)1 / i;
			i++;
		}
		System.out.println();
		System.out.println("Harmonic Series: " + sum);
	}
}
