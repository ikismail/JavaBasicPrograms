package Day1;

public class QuadricEquation {

	public static void main(String[] args) {

		int a = 2;
		int b = 6;
		int c = 4;

		String eqn = a + "x2 + " + b + "x + " + c;

		double value = Math.sqrt(b * b - 4 * a * c);
		System.out.println(value);

		double value1 = (-b + value) / (2 * a);

		double value2 = (-b - value) / (2 * a);

		System.out.println("Value of " + eqn + " is " + value1 + " " + value2);
	}
}
