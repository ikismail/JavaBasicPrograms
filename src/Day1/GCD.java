package Day1;

public class GCD {

	private static int GCD1(int a, int b) {
		if (b == 0)
			return a;
		else
			return GCD1(b, a % b);
	}

	public static void main(String[] args) {

		System.out.println(GCD1(20, 20));
	}
}
