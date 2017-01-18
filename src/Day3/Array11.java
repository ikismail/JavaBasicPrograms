package Day3;

import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row and column");
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Enter the element of matrix");
		double[][] mat = new double[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Double Matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		int[] sum = new int[col];
		int add = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				add += mat[j][i];
				sum[i] = add;
			}
			add = 0;
		}
		
		for (int i : sum) {
			System.out.println("\nSum of Column: " + i);
		}
	}
}
