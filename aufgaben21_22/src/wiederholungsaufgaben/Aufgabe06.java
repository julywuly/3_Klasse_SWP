package wiederholungsaufgaben;

public class Aufgabe06 {

	public static void main(String[] args) {
		boolean[] wahr;
		wahr = new boolean[30];//Größe festlegen
		double[] values;
		values = new double[30];//Größe festlegen
		int anzahlTrue = 0;

		for (int j = values.length - 1; j >= 0; j--) {//[]mit zufalsszahlen füllen
			values[j] = Math.random();
		}
		for (int i = wahr.length - 1; i >= 0; i--) {//wenn der wert größer 0.5 ist array wahr mit wahr füllen
			if (values[i] > 0.5) {
				wahr[i] = true;
			} else {
				wahr[i] = false;
			}

			if (wahr[i]) {//Anzahl der wahr werte zählen
				anzahlTrue++;
			}
		}

		System.out.print(anzahlTrue);
	}
}
