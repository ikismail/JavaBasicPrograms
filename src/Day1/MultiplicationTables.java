package Day1;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {

		
		
		//int a = 5;
		//int b = 7;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range");
		System.out.println("From");
		int a = sc.nextInt();
		System.out.println("To");
		int b = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			System.out.println("Multiplication table of " + i);
			int j = 1;
			while (j <= 10) {
				System.out.println(j + " * " + i + " = " + j * i);
				j++;
			}
		}
	}
}
