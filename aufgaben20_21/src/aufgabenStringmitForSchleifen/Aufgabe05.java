package aufgabenStringmitForSchleifen;

public class Aufgabe05 {

	public static void main(String[] args) {
		String s = "Dieser Text enthaelt viele Vokale";
		String s2 = "";
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {

			} else
				s2 += c;

		}
		System.out.printf(s2);

	}

}
