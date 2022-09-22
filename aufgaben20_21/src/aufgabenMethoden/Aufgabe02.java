package aufgabenMethoden;

public class Aufgabe02 {

	public static void main(String[] args) {
		groessereZahlErkennen(true, 22.25, 24.25);

	}

	static boolean groessereZahlErkennen(boolean erkennen, double d, double e) {
		if (d > e) {
			erkennen = true;
		} else {
			erkennen = false;
		}
		System.out.println(erkennen);
		return erkennen;
	}
}
