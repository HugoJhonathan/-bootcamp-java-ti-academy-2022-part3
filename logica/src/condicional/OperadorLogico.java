package condicional;

public class OperadorLogico {

	public static void main(String[] args) {

		int x = 5;

		System.out.println(x <= 15 && x == 10); // false
		System.out.println(x >= 0 && x != 6); // true
		System.out.println(x <= 15 && x == 10 && x != 6); // false
		System.out.println(x <= 15 || x == 10); // true
		System.out.println(x <= 0 || x != 5); // false
		System.out.println(x <= 0 || x != 5 || x > 3); // true
		System.out.println(!(x == 15)); // true
		System.out.println(!(x < 5)); // true
		System.out.println(!(x < 0 || x != 5)); // true

	}

}
