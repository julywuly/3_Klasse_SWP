package aufgabenArrays;

public class Aufgabe02 {

	static void ausgabe(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);

		}
	}

	public static void main(String[] args) {
		ausgabe(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 });

	}

}
