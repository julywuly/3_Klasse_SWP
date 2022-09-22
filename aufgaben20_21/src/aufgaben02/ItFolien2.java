package aufgaben02;
//IT Folien S. 12
public class ItFolien2 {

	public static void main(String[] args) {
		fakul(20);

	}

	public static double fakul(int d) {
		double fakultaet = 1;
		for (double i = 1; i <= d; i++) {
			fakultaet = fakultaet * i;
			System.out.printf("%.2f\n", fakultaet);

		}
		return fakultaet;

	}
}
