package aufgabenStringmitForSchleifen;

public class Aufgabe06 {

	public static void main(String[] args) {
		String s = "Das ist";
		int positionS = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 's') {
				positionS = i;
			}
		}
		System.out.printf("Letzte Stelle eines 's': " + positionS);
	}
}
