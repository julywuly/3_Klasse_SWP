package aufgabenMethoden;

public class Aufgabe01 {

	public static void main(String[] args) {
		findeGroessereZahl(-21.29, -21.28);
	}

	static void findeGroessereZahl(double d, double e) {
		if (d > e) {
			System.out.println(d);
		} else {
			System.out.println(e);
		}
	}
}
