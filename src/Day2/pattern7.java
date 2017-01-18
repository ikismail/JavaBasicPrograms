package Day2;

public class pattern7 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print("-");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("-");
			}
			for (int k = 3; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
