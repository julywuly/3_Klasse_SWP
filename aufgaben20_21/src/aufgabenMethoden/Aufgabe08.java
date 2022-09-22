package aufgabenMethoden;

public class Aufgabe08 {

	public static void main(String[] args) {
		findeGroessereZahl(-22.29, -1.28, -10.3);
	}

	static void findeGroessereZahl(double d, double e, double f) {
		if (d > e) {
			if (d > f) {
				System.out.println(d);
			} else
				System.out.println(f);
		} else {
			if (e > f) {
				System.out.println(e);
			} else
				System.out.println(f);
		}

	}

}
