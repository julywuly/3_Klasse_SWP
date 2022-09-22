package wiederholungsaufgaben;

public class Aufgabe07 {

	public static double durchschnitt(int[] werte) {//gefahrene kilometer angeben
		int summe = 0;
		int divisor = 0;

		for (int k = werte.length - 1; k >= 0; k--) {//Kilometer durchgehen
			summe = summe + werte[k];
			divisor++;

		}
		double durchschnitt = summe / divisor;
		System.out.print(durchschnitt);
		return durchschnitt;
	}

	public static void main(String[] args) {
		durchschnitt(new int[] { 231, 212, 197, 243, 220, 195, 234 });

	}

}
