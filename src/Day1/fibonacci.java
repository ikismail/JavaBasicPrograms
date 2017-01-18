package Day1;

public class fibonacci {

	public static void main(String[] args) {

		// 1 1 2 3 5 8 13 21 34 55

		int a = 1, b = 1, n = 0;
		System.out.print("1 1 ");
		while (n < 50) {

			n = a + b;
			if (n > 50) {
				break;
			}
			System.out.print(n + " ");
			a = b;
			b = n;
		}
	}
}
