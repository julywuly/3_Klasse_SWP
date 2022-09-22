package aufgabenStringmitForSchleifen;

public class Aufgabe03 {

	public static void main(String[] args) {
		String str = "h2aw85tb09";
		String str2 = "";
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			if (Character.isDigit(c)) {
				str2 += c;
			}

		}
		System.out.printf(str2);

	}
}
