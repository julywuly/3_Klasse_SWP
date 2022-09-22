package aufgabenVerschachtelteSchleifen;

public class Aufgabe01_d {

	public static void main(String[] args) {
		for (int zeile = 0; zeile <= 10; zeile++) {
			for (int spalte = 0; spalte <= 10; spalte++) {
				if (zeile % 2 == 0) {
					System.out.printf("#");
				} else {
					System.out.printf("*");
				}

			}
			System.out.println();
		}

	}

}
