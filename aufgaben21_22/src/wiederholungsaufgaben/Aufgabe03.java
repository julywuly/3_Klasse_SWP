package wiederholungsaufgaben;

public class Aufgabe03 {
	public static void main(String[] args) {
		wurf(100, 1);//Schritte= wann soll ausgegeben werden?
	}

	public static void wurf(int wiederholungen, int schritte) {//Gleich wie nr 2 nur parameter
		double k = 0;
		for (double i = 1; i <= wiederholungen; i++) {
			double j = 0;
			int r = (int) (Math.random() * 2);
			if (r == 0) {
				k++;
			}
			if (i % schritte == 0) {
				j = k / i;
				System.out.printf("%10.0f  %10.0f  %.5f \n", i, k, j);
			}
		}
	}
}