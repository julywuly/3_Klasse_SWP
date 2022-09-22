package aufgabenStringmitForSchleifen;

public class Aufgabe09 {

	public static void main(String[] args) {
		String str = "Das ist ein Text";
		String strNeu = "";
		for (int i = 0; i < str.length(); i++) {
			String lower = str.toLowerCase();
			char ch = lower.charAt(i);
			char chNeu = (char) (ch + 1);
			strNeu += chNeu;
		}
		System.out.println(strNeu);
	}
}
