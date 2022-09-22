package first_java_project;

public class Ausgabe {

	public static void main(String[] args) {
//		
//		//System.out.printf("Name: %10s", "Jana");
//		//System.out.printf("Name: %10s", "Juliana");
//		int i=0;
//		while (i<=200) {
//			System.out.printf("%3d\n",i);
//			i++;
//		}
//		String s = "Dieser Text ist einer von 123 anderen Texten";
//
//		int anzahlZahlen = 0;
//
//		int anzahlGrossbuchstaben = 0;
//
//		for (int i = 0; i < s.length(); i++) {
//
//			char c = s.charAt(i);
//
//			if (Character.isDigit(c) == true) {
//
//				anzahlZahlen++;
//
//			} // Klammer ifBefehl2
//
//			if (Character.isUpperCase(c) == true) {
//
//				anzahlGrossbuchstaben++;

		// KLammer ifBefehl3

// Klammer forSchleife

//		System.out.printf("gross : zahl = %d : %d", anzahlGrossbuchstaben, anzahlZahlen);
		for (int i = 20; i > 0; i--) {
			if (i % 2 == 0) {
				if (i % 10 == 0) {
					System.out.printf("%2d ...Die Hälfte erreicht", i);

				}
			} else {
				System.out.print(i);
			}
			if (i % 2 != 0) {

				i += 1;

			}

		}

	}
}
