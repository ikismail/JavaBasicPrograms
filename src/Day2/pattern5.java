package Day2;

public class pattern5 {

	public static void main(String[] args) {
		int n = 1;
		int num = 5;
		for (int i = 1; i < num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(n+" ");
				n++;
			}
			for (int k = num; k > i; k--) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
