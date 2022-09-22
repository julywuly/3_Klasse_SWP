package aufgabenArrays;

public class Aufgabe08 {

	static int[] erstenFuenf(int[] a) {
		int a1[] = new int[5];
		for (int i = 0; i < 5; i++) {
			a1[i] = a[i];
			System.out.printf("%d ", a1[i]);
		}

		return a1;

	}

	public static void main(String[] args) {
		erstenFuenf(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });

	}

}
