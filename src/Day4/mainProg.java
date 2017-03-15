import java.util.Scanner;

class calcFuncImpl {

	public int addFunc(int i1, int i2) {

		return i1 + i2;
	}

	public int subtFunc(int i1, int i2) {
		return i1 - i2;
	}

	public int multiFunc(int i1, int i2) {
		return i1 * i2;
	}

	public double dividFunc(int i1, int i2) {
		double z = 0;
		try {
			z = i1 / i2;
		} catch (Exception e) {
			System.out.println("Cant Divide a number by 0");
		}
		return z;

	}

	calcFuncImpl(int i1, int i2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("Addition of " + i1 + " + " + i2 + " is " + addFunc(i1, i2));
			break;
		case 2:
			System.out.println("Subtraction of " + i1 + " - " + i2 + " is " + subtFunc(i1, i2));
			break;
		case 3:
			System.out.println("Multiplication of " + i1 + " * " + i2 + " is " + multiFunc(i1, i2));
			break;
		case 4:
			System.out.println("Divisioin of " + i1 + " / " + i2 + " is " + dividFunc(i1, i2));
			break;
		default:
			break;
		}
	}

}

public class mainProg {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please choose the Function");
		System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
		int choice = sc.nextInt();
		System.out.println("Enter Input - 1");
		int input1 = sc.nextInt();
		System.out.println("Enter Input - 2");
		int input2 = sc.nextInt();
		
		new calcFuncImpl(input1, input2, choice);

		sc.close();

	}
}
