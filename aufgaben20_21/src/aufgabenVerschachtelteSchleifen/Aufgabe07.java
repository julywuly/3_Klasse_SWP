package aufgabenVerschachtelteSchleifen;

public class Aufgabe07 {

	public static void main(String[] args) {
		int i = 0;
		for (int zeile = 0; zeile < 5; zeile++) {
			i++;
			for (int spalte = 0; spalte < 5; spalte++) {
				if (zeile + spalte == 4) {
					System.out.print(i);
				}
				if (zeile + spalte < 4) {
					System.out.print('.');
				}

			}
			System.out.println();
		}

	}

}
