package wiederholungsaufgaben;

public class Aufgabe02 {

	public static void main(String[] args) {
		double k = 0;//Anzahl 0
		for (double i = 1; i <= 10000; i++) {//M�nzwurf wird 1000 mal wiederholt
			double j = 0;//Anzahl der W�rfe
			int r = (int) (Math.random() * 2);//0 oder 1 wird gezogen
			if (r == 0) {//schaun ob zufallszahl null ist
				k++;//Anzahl Kopf erh�hen
			}
			if (i %10 == 0) {//Relativit�t ausrechnen
				j = k/i;
				System.out.printf("%10.0f       %10.0f        %.5f \n", i, k, j);
			}
		}
	}
}