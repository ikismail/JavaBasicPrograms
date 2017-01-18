package Day1;

public class FactorialUsingRecursion {

	private static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return fact(n - 1) * n;
	}

	public static void main(String[] args) {

		// 5! = 1 * 2 * 3 * 4 * 5 = ?
		System.out.println(fact(10));
	}
}
