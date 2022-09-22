package aufgabenMethoden;

public class Aufgabe05 {

	public static void main(String[] args) {
		System.out.print(potenzBerechnen(2, 3));

	}

	public static double potenzBerechnen(double d, int i) {
		double e = d;
		for (int j = 1; j < i; j++) {
			e *= d;
		}
		return e;
	}

}
