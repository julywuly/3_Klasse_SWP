package aufgabenStringmitForSchleifen;

public class Aufgabe02 {

	public static void main(String[] args) {
		String text = "Dieser Text ist von Punkten getrennt. Genauso, wie von Beistrichen und Leerzeichen.";
		int anzahl = 0;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			System.out.println(c);
			if (c == ' ' || c == '.' || c == ',') {
				anzahl++;

			}
		}
		System.out.printf("Anzahl: %d", anzahl);
	}

}
