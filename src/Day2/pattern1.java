package Day2;

public class pattern1 {

	public static void main(String[] args) {

		int n = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(n + " ");
				n++;
			}
			
			System.out.println();
		}
	}
}
