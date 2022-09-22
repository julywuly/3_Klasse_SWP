package aufgabenArrays;

public class Aufgabe03 {
	static int max(int a[]) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int a1[] = { 5, 4, 3, 2, 1 };
		int m = max(a1);
		System.out.print(m);
	}

}
