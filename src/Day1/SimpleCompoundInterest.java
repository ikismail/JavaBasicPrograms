package Day1;

public class SimpleCompoundInterest {

	public static void main(String[] args) {

		int amount = 3000;
		double rate = 5.5;
		int year = 20;

		double sI = (amount * rate * year) / 100;
		double cI = amount * Math.pow(1.0 + rate / 100, year) - amount;
		System.out.println("Simple Interest: " + sI);
		System.out.println("Compound Interest: " + cI);
	}
}
