package Day2;

public class pattern6 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k > i; k--) {
				System.out.print("* ");
			}

			System.out.println(" ");
		}
	}
}
