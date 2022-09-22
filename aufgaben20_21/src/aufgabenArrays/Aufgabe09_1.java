package aufgabenArrays;

public class Aufgabe09_1 {
	
	static int[] lottoZahlen() {
		int z[] = new int[6];
		for (int i = 0; i < z.length; i++) {
			z[i] = (int) (Math.random() * 45) + 1;
		}
		return z;

	}

	public static void main(String[] args) {
		int z2[] = lottoZahlen();
		Aufgabe02.ausgabe(z2);
	}
}
