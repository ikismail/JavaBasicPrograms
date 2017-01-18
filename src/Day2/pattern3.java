package Day2;

public class pattern3 {

	/*1  2  3  4  5
	  6  7  8  9  10
	  11 12 13 14 15	
	*/
	public static void main(String[] args) {

		int n = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print(n + " ");
				n++;
			}

			System.out.println();
		}
		
		/*1  1  1  1 
		 *2  2  2  2
		  3  3  3  3 	
		*/
		System.out.println("*************");
		int a =1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print(a + " ");
				
			}
			a++;
			System.out.println();
		}
	}
}
