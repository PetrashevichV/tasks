package task8.pt.ch.vl;

public class Main {

	public static void main(String[] args) {
		int[] a;
		int n = 100;
		a = new int[n];
		int k = 8;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		for (int i = 0; i < a.length; i = i + k) {
			sum = sum + a[i];
		}
		System.out.println(" sum = " + sum);
	}
}
