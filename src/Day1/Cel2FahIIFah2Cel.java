package Day1;

public class Cel2FahIIFah2Cel {

	public static void main(String[] args) {

		// Celcius to Fahrenheit

		int celcius = 60;

		double fah = celcius * 1.8 + 32;

		System.out.println("Fahrenheit: " + fah);

		// Fahrenheit to celcius

		int fahr = 60;

		double cel = (fahr - 32) / 1.8;

		System.out.println("Celcius: " + cel);
	}

}
