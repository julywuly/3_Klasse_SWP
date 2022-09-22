package aufgabenVerschachtelteSchleifen;

public class Aufgabe05 {

	public static void main(String[] args) {
		
		String str = "Das ist ein Text";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			int anzahl = 0;
			char c = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				char h = str.charAt(j);
				if (c==h) {
					anzahl++;
				}
			}
			System.out.printf("Anzahl %s: %d\n", c, anzahl);
		}
	}
}
