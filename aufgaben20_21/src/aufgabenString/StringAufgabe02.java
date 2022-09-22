package aufgabenString;
//IT Folien Seite 20

public class StringAufgabe02 {

	public static void main(String[] args) {
		String s = "HTL Anichstraﬂe";

		s = s.toUpperCase();

		int pos = s.indexOf('H');
		System.out.printf("Position: %d\n", pos);
		pos = s.indexOf('H', pos + 1);
		System.out.printf("Position: %d\n", pos);

	}

}
