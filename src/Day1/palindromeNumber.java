package Day1;

public class palindromeNumber {

	public static void main(String[] args) {

		int n = 121;
		int r,temp=n, s = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			s = s * 10 + r;
		}
		if(temp==s){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
	}
}
