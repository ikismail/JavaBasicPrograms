package Day3;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Rows");
		int row = sc.nextInt();
		System.out.println("Enter Number of Columns");
		int col = sc.nextInt();

		int[][] m1 = new int[row][col];
		int[][] m2 = new int[row][col];
		int[][] m3 = new int[row][col];

		System.out.println("Enter the values");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.println("First Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter the values");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Second Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		System.out.println("Addition of 2 Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(m3[i][j] +" ");
			}
			System.out.println();
		}

	}
}
