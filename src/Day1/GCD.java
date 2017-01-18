package Day1;

public class GCD {

	private static int GCD1(int a, int b) {
		if (b == 0)
			return a;
		else
			return GCD1(b, a % b);
	}

	public static void main(String[] args) {

		// System.out.println(GCD1(20, 20));
		// System.out.println(GCD1(25, 20));

		int a = 5;
		int b = 10;
		System.out.println(a % b);
		while (a != 0 && b != 0) {
			int c = b;
			b = a % b;

			a = c;
		}
		System.out.println(a + b);

	}

}
