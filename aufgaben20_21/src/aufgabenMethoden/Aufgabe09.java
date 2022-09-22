package aufgabenMethoden;

public class Aufgabe09 {

	public static void main(String[] args) {
		findeGroessereZahl(-22.29, -1.28, -10.3, -23.3);
	}

	static void findeGroessereZahl(double d, double e, double f, double g) {
		if (d > e) {
			if (d > f) {
				System.out.println(d);
			} else
				System.out.println(f);
		} else {
			if (e > f) {
				if (e > g) {
					System.out.println(e);
				} else
					System.out.println(g);
			} else {
				if (f > g) {
					System.out.println(f);
				} else
					System.out.println(g);
			}

		}

	}
}
