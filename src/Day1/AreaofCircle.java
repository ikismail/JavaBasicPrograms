package Day1;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {

		System.out.println("Enter the radius of Circle");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		double form = Math.PI * radius * radius;
		System.out.println("Area of Circle is: " + form);
	}
}
