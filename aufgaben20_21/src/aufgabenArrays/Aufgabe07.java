package aufgabenArrays;

public class Aufgabe07 {
	static int[] zufallszahlen() {
		int z[] = new int[20];
		for (int i = 0; i < z.length; i++) {
			z[i] = (int) (Math.random() * 100) + 1;
		}
		return z;

	}

	public static void main(String[] args) {
		Aufgabe02.ausgabe(zufallszahlen());
	}
}
