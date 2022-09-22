package aufgabenVerschachtelteSchleifen;

public class Aufgabe06 {

	public static void main(String[] args) throws InterruptedException {
		for (int stunde = 17; stunde <= 23; stunde++) {
			for (int minute = 15; minute <= 59; minute++) {
				for (int sekunde = 0; sekunde <= 59; sekunde++) {
					Thread.sleep(1000);
					System.out.printf("%d : %d Sek: %2d\n", stunde, minute, sekunde);
				}
			}
		}
	}
}
