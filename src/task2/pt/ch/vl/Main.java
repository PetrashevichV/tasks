package task2.pt.ch.vl;

public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double result;

		a = 1.0;
		b = 2.0;
		c = 3.0;

		d = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a);
		result = d - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println("result = " + result);
	}

}
