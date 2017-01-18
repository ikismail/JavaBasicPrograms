package Day3;

import java.util.Arrays;

public class Array9 {

	// Array Copy
	public static void main(String[] args) {

		char[] copyFrom = { 's', 'a', 'j', 'j', 'i', 's', 'm', 'a', 'i', 'l', 's', 'a' };
		char[] copyTo = new char[6];
		// System.out.println(Arrays.copyOfRange(copyFrom, 4, 10));
		// System.arraycopy(copyFrom, 4, copyTo, 0, 6);
		// System.out.println(new String(copyTo));

		String name = "Hello Ismail";
		char[] nameA = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			nameA[i] = name.charAt(i);
		}
		System.out.println(Arrays.copyOfRange(nameA, 6, nameA.length));
	}
}
