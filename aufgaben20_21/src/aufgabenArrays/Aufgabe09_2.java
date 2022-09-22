package aufgabenArrays;

public class Aufgabe09_2 {

	static int[] lottoZahlen() {
		int[] zahlen = new int[6];
		int x = 0;

		for (int i = 0; i < zahlen.length; i++) {
			x = (int) (Math.random() * 49) + 1;
			boolean drinnen = false;
			for (int j = 0; j < zahlen.length; j++) {
				if (zahlen[j] == x) {
					drinnen = true;
					break;
				}
			}
			if (!drinnen) {
				zahlen[i] = x;
			} else {
				i--;
			}
		}

		return zahlen;

	}

	public static void main(String[] args) {
		int zahlen[] = lottoZahlen();
		Aufgabe02.ausgabe(zahlen);
	}
}
