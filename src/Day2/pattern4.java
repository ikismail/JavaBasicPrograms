package Day2;

public class pattern4 {

	public static void main(String[] args) {
		int n = 1;
		int num = 5;
		for (int i = 1; i < num; i++) {
			for (int j = num - 1; j > i; j--) {
				System.out.print("* ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
	}
}
