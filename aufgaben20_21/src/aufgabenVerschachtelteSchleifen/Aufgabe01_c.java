package aufgabenVerschachtelteSchleifen;

public class Aufgabe01_c {

	public static void main(String[] args) {
		for (int zeile = 0; zeile <= 10; zeile++) {
			for (int spalte = 0; spalte <= 10; spalte++) {
				if (zeile== spalte || zeile+spalte==10) {
					System.out.printf("#");
				} else {
					System.out.printf("*");
				}

			}
			System.out.println();
		}
	}

}
