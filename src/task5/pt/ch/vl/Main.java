package task5.pt.ch.vl;

public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		a = 1.2;
		b = 2.5;
		c = -1.5;

		if (a < 0) {
			a = Math.pow(a, 4);
		} else if (a > 0) {
			a = Math.pow(a, 2);
		}
		System.out.println("a = " + a);

		if (b < 0) {
			b = Math.pow(b, 4);
		} else if (b > 0) {
			b = Math.pow(b, 2);
		}
		System.out.println("b = " + b);

		if (c < 0) {
			c = Math.pow(c, 4);
		} else if (c > 0) {
			c = Math.pow(c, 2);
		}
		System.out.println("c = " + c);

	}
}
