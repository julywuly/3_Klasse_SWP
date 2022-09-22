package aufgabenVerschachtelteSchleifen;

public class Aufgabe02 {

	static void einmaleins(int grenze) {
		for (int i = 1; i < grenze; i++) {
			for (int j = 1; j < grenze; j++) {
				System.out.printf("%3d",(i*j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		einmaleins(10);
	}
}
