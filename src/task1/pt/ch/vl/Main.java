package task1.pt.ch.vl;

public class Main {

	public static void main(String[] args) {
		int n = 2314;
		int a;
		int b;
		int c;
		int d;

		a = n % 10; // 4
		n = n / 10; // n = 231
		b = n % 10; // 1
		n = n / 10; // n = 23
		c = n % 10; // 3
		n = n / 10; // 2
		d = n % 10; // n = 2

		if ((a + b) > (c + d)) {
			System.out.println("false.");
		} else if ((a + b) < (c + d)) {
			System.out.println("false.");
		} else if ((a + b) == (c + d)) {
			System.out.println("true.");
		}

	}

}
