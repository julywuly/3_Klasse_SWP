package aufgabenVerschachtelteSchleifen;

public class Aufgabe09 {

	public static void main(String[] args) {
		for (int zeile = 0; zeile < 5; zeile++) {
			for (int j = 0; j < 26; j++) {
				char ch = (char) ('A' + j);
				System.out.printf("%s", ch);
			}
			System.out.println(' ');
		}

	}
}
