package Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class hello implements Comparable<hello> {
	private int id;
	private String name;

	public hello(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(hello o) {
		return id - o.getId();
	}

}

class compareName implements Comparator<hello> {

	@Override
	public int compare(hello h1, hello h2) {
		return h1.getName().compareTo(h2.getName());
	}

}

public class Array12 {

	public static void main(String[] args) {

		ArrayList<hello> arr = new ArrayList<hello>();

		hello h1 = new hello(1, "Ismail");
		hello h2 = new hello(3, "Mohammed");
		hello h3 = new hello(2, "Kumar");

		arr.add(h1);
		arr.add(h2);
		arr.add(h3);

		// Collections.sort(arr, new compareName());

		Collections.sort(arr);
		for (hello h : arr) {
			System.out.println(h.getId() + " " + h.getName());
		}
	}
}
