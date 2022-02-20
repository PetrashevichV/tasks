package task9.pt.ch.vl;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 8, 9 };
		int[] b = new int[] { 5, 6, 7 };
		int[] c = new int[a.length + b.length];

		int k = 4;
		int cout = 0;
		for (int i = 0; i < c.length; i++) {
			if (i < k) {
				c[i] = a[i];
			} else if (i >= k && i < b.length + k) {
				c[i] = b[cout];
				cout++;
			} else if (i == b.length + k) {
				c[i] = a[k];
				k++;
			}
			System.out.printf("%3d ", c[i]);
		}
		System.out.println();
	}

}
