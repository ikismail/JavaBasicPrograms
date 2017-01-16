package Day1;

public class primeNumbers {

	public static void main(String[] args) {

		// factors of Prime Numbers between 100
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (i == j) {
					System.out.println(i);
				}
				if (i % j == 0) {
					break;
				}
			}
		}
	}
}
