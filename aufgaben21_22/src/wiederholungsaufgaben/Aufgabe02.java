package wiederholungsaufgaben;

public class Aufgabe02 {

	public static void main(String[] args) {
		double k = 0;//Anzahl 0
		for (double i = 1; i <= 10000; i++) {//Münzwurf wird 1000 mal wiederholt
			double j = 0;//Anzahl der Würfe
			int r = (int) (Math.random() * 2);//0 oder 1 wird gezogen
			if (r == 0) {//schaun ob zufallszahl null ist
				k++;//Anzahl Kopf erhöhen
			}
			if (i %10 == 0) {//Relativität ausrechnen
				j = k/i;
				System.out.printf("%10.0f       %10.0f        %.5f \n", i, k, j);
			}
		}
	}
}