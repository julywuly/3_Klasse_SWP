package aufgabenArrays;

public class Aufgabe06 {

	static int[] geradeMinusEins(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i] = -1;

			}
			System.out.printf("%d, ", a[i]);
		}
		return a;
	}

	public static void main(String[] args) {
		geradeMinusEins(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });

	}

}
