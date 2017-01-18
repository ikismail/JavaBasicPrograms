package Day2;

public class pattern {

	public static void main(String[] args) {
		
		for (int i = 1; i < 5; i++) {
			for(int j=3; j>= i ; j--){
				System.out.print(" ");
			}
			for(int k=0; k<i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
