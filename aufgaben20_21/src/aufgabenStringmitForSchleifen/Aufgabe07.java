package aufgabenStringmitForSchleifen;

public class Aufgabe07 {

	public static void main(String[] args) {
		String binaerzahl = "1011";
		int wertigkeit = 1;
		int ergebnis = 0;
		for (int i = binaerzahl.length() - 1; i >= 0; i--) {
			char c = binaerzahl.charAt(i);
			if (c == '1') {
				ergebnis += wertigkeit;
			}
			wertigkeit = wertigkeit * 2;
		}
		System.out.print(ergebnis);

	}

}
