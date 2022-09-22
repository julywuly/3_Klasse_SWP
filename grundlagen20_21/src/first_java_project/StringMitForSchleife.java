package first_java_project;

public class StringMitForSchleife {

	public static void main(String[] args) {
		int anzahl = 0;
		String str = "Das ist ein Text";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.printf("%d %s\n", i, c);
			if ((c == 'e') || (c == 'i')) {
				anzahl++;

			}

		}
		System.out.println("Anzahl=" + anzahl);

		String str2 = "Das ist ein weiterer etwas längerer Text";
		String str3 = "";
		for (int j = 0; j < str2.length(); j++) {
			char c = str2.charAt(j);
			if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
				str3 += 'x';
			} else
				str3 += c;

		}
		System.out.printf(str3);
	}
}