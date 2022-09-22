package aufgabenString;
//IT Folien Seite 20
public class StringAufgabe04 {

	public static void main(String[] args) {
		// 0 4 8 12
		String stext = "Das ist ein Text";

		int pos = stext.indexOf("D");
		System.out.printf("%d, ", pos);

		int leerzeichen = stext.indexOf(" ");
		System.out.printf("%d, ", leerzeichen + 1);

		int leerzeichen2 = stext.indexOf(" ", 4);
		System.out.printf("%d, ", leerzeichen2 + 1);

		int leerzeichen3 = stext.indexOf(" ", 8);
		System.out.printf("%d", leerzeichen3 + 1);

	}

}
