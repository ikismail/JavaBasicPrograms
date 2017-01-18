package Day3;

public class Array7 {

	public static void main(String[] args) {

		int[][] m1 = { { 1, 2, 3 }, { 2, 3, 4 } };
		int[][] m2 = { { 2, 4, 5 }, { 3, 5, 7 } };
		int[][] m3 = new int[2][3];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < 3; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(m3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
