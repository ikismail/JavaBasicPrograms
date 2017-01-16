package Day1;

public class Vol2AreaOFCylinder {

	public static void main(String[] args) {

		int r = 5;
		int h = 20;
		System.out.println("Volume: " + Math.PI * r * r * h);
		double a =  (2 * Math.PI * r * h);
		double b =  (2 * Math.PI * r * r);
		System.out.println("Area: " + a + b);
	}
}
