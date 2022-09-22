package aufgabenString;
//IT Folien Seite 20
public class StringAufgabe03 {

	public static void main(String[] args) {
		String s = "das ist ein text";

		String szwei = s.replace("a", "A");

		String sdrei = szwei.replace("e", "E");

		String svier = sdrei.replace("i", "I");

		String sfuenf = svier.replace("o", "O");

		String ssechs = sfuenf.replace("u", "U");

		System.out.printf(ssechs);

	}

}
