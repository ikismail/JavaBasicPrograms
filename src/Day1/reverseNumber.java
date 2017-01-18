package Day1;

public class reverseNumber {

	public static void main(String[] args) {

		int n = 456;
		int temp, r, s = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			s = s * 10 + r;
			System.out.println(s);
		}

	}
}
