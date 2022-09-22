package aufgabenStringmitForSchleifen;

public class Aufgabe04 {

	public static void main(String[] args) {
		ersetzen("Aal", 'a', 'x');

	}

	static String ersetzen(String str, char von, char nach) {
		String str2 = "";
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			if (c == von) {
				str2 += nach;
			} else
				str2 += c;
		}
		System.out.printf(str2);
		return str2;

	}
}
