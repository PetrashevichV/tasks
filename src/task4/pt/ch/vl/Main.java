package task4.pt.ch.vl;

public class Main {

	public static void main(String[] args) {
		int x, y;
		int x1, y1; // a
		int x2, y2; // b
		int x3, y3; // c
		int x4, y4; // d
		int x5, y5; // e
		int x6, y6; // f
		int x7, y7; // g
		int x8, y8; // h

		x = 6;
		y = 3;

		x1 = -2;
		y1 = 4;
		x2 = 2;
		y2 = 4;
		x3 = -4;
		y3 = -3;
		x4 = 4;
		y4 = -3;
		x5 = -4;
		y5 = 0;
		x6 = -2;
		y6 = 0;
		x7 = 2;
		y7 = 0;
		x8 = 4;
		y8 = 0;

		if ((x >= x1) & (x <= x2) & (y <= y1) & (y >= y6)) {
			System.out.println("true");
		} else if ((x >= x6) & (x <= x7) & (y <= y2) & (y >= y7)) {
			System.out.println("true");
		} else if ((x >= x5) & (x <= x8) & (y <= y5) & (y >= y3)) {
			System.out.println("true");
		} else if ((x >= x3) & (x <= x4) & (y <= y8) & (y >= y4)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}