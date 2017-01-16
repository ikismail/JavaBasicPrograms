package Day1;

public class MeanCalculate {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 1 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double mean = sum / arr.length;
		System.out.println("Number of Digits: " + arr.length);
		System.out.println("Sum of Digits: " + sum);
		System.out.println("The mean average is: " + mean);
	}
}
