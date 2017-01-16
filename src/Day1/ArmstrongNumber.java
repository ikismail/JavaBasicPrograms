package Day1;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n = 153;
		int temp = n;
		int r;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + (r * r * r);
			System.out.println(sum);
		}
		if(temp == sum){
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not Armstrong Number");
		}
	}
}
