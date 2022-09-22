package aufgabenSchleifen;
//IT Folien S.10

public class Schleifen_02 {

	public static void main(String[] args) {
		int summe = 0;
		int b = 1;
		for (b = 1; b < 19; b += 2) {
			System.out.print(b + " + ");
			summe += b;
		}
		System.out.print(b);
		summe += b;

		System.out.print(" = " + summe);
	}
}
