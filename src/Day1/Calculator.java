package Day1;

import java.util.Scanner;

public class Calculator {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter Value 1: ");
		int a = sc.nextInt();
		System.out.println("Enter Value 2: ");
		int b = sc.nextInt();

		System.out.println("Please choose the option: ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");

		int option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("Addition");
			sum(a, b);
			break;
		case 2:
			System.out.println("Subtraction");
			sub(a, b);
			break;
		case 3:
			System.out.println("Multiplication");
			mul(a, b);
			break;
		case 4:
			System.out.println("Division");
			div(a, b);
			break;
		case 5:
			System.out.println("Modulus");
			mod(a, b);
			break;
		default:
			System.out.println("Please choose correct option");
			break;
		}

	}

	static void sum(int a, int b) {
		int sum = a + b;
		System.out.println("Addition: " + sum);
	}

	static void sub(int a, int b) {
		int sum = a - b;
		System.out.println("Subraction: " + sum);
	}

	static void mul(int a, int b) {
		int sum = a * b;
		System.out.println("Multiplication: " + sum);
	}

	static void div(int a, int b) {
		int sum = a / b;
		System.out.println("Divition: " + sum);
	}

	static void mod(int a, int b) {
		int sum = a % b;
		System.out.println("Modulus: " + sum);
	}

}
