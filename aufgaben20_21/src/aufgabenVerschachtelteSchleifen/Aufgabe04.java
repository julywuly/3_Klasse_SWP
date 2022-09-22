package aufgabenVerschachtelteSchleifen;

public class Aufgabe04 {

	public static void main(String[] args) {
		for (int z1 = 1; z1 < 100; z1++) {
			boolean divisionOhneRestGefunden = false;
			for (int z2 = 2; z2 <= z1 - 1; z2++) {
				if (z1 % z2 == 0) {
					divisionOhneRestGefunden = true;
					break;
				}
			}
			if (!divisionOhneRestGefunden) {
				System.out.println(z1);
			}
		}
	}
}
