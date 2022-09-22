package aufgaben02;
//IT Folien S. 12
public class ItFolien1 {

	public static void main(String[] args) {
		zinsrechnung(25);

	}

	public static double zinsrechnung(int d) {
		double betrag = 2000;
		for (int i = 1; i <= d; i++) {
			betrag = betrag * 1.05;
			System.out.println(betrag);

		}
		return betrag;

	}
}