package aufgabenVerschachtelteSchleifen;

public class Aufgabe08 {

	public static void main(String[] args) {
		for (int zeile = 0; zeile < 5; zeile++) {
			for (int j = 0; j < 26; j++) {
				char ch = (char) ('a' + j);
				System.out.printf("%s", ch);
			}
			System.out.println(' ');
		}

	}
}
