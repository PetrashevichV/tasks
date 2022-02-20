package task7.pt.ch.vl;

public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double y;

		a = -1;
		b = 1;
		h = 0.2;

		System.out.println("--------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x ", "y ");
		System.out.println("--------------------------------");
		for (double x = a; x <= b; x = x + h) {
			y = Math.sin(Math.pow(x, 2)) - Math.cos(2 * x);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}

		System.out.println("--------------------------------");
	}

}
