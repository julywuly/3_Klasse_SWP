package first_java_project;

public class Uebung {

	public static void computerArt(int grenze) {
		for (int i = 0; i <= grenze; i++) {
			for (int j = 0; j <= grenze; j++) {
				if (i % 2 == 1) {
					System.out.printf("#");
				} else {
					System.out.printf("*");
				}
			}
			System.out.println();
		}

	}

	public static void einmaleins(int grenze) {
		for (int i = 0; i <= grenze; i++) {
			for (int j = 0; j <= grenze; j++) {
				System.out.printf("%2d * %2d = %4d\n", i, j, i * j);
			}
			System.out.println();
		}
	}

	static int min(int a[]) {
		int min = 10;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	static double mittelwert(int[] a) {
		int divisor = 0;
		int summe = 0;
		for (int nummer : a) {
			summe += nummer;
			divisor++;
		}
		System.out.println(summe);

		double mittelwert = summe / divisor;
		System.out.printf("Mittelwert = " + mittelwert);
		return mittelwert;
	}

	static int[] umdrehen(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.printf("%d", arr[i]);
		}
		return arr;
	}

	static int[] geradeMinusEins(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				a[i] = -1;
			}
			System.out.printf("%d ", a[i]);
		}
		return a;
	}

	static int[] erstenFuenf(int[] a) {
		int[] a1 = new int[5];
		for (int i = 0; i < 5; i++) {
			a1[i] = a[i];

			System.out.printf("%d", a1[i]);
		}
		return a1;
	}

	static void computerArt() {

		for (int zeile = 10; zeile <= 20; zeile++) {

			for (int spalte = 10; spalte <= 20; spalte++) {

				if (zeile == spalte) {

					System.out.printf("****");

				} else {
					System.out.printf("%4d", zeile * spalte);
				}

			}

			System.out.println();

		}

	}

	static int[] zufallszahlen(int x) {

		int[] z = new int[x];

		for (int i = 0; i <= x; i++) {

			z[i] = (int) (Math.random() * 100) + 1;

			if (z[i]<10) {

				z[i] = 0;

			}

			if (z[i]>90) {

				z[i] = 100;

			}

		}

		return z;

	}

	public static void main(String[] args) {
		computerArt(20);

		einmaleins(15);

		int m = min(new int[] { 1, 2, 3, 4, 5 });
		System.out.print(m);
		mittelwert(new int[] { 2, 4, 6, 8 });

		umdrehen(new int[] { 2, 4, 5, 2, 6 });

		geradeMinusEins(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });

		erstenFuenf(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });

		computerArt();
	}

}
