package aufgabenStringmitForSchleifen;

public class Aufgabe08 {

	public static void main(String[] args) {
		int dezimalzahl = 19;
		String binaerzahl = "";
		while (dezimalzahl > 0) {
			binaerzahl += dezimalzahl % 2;
			dezimalzahl = dezimalzahl / 2;
		}
		for (int i = binaerzahl.length() - 1; i >= 0; i--) {
			System.out.print(binaerzahl.charAt(i));

		}
	}
}
