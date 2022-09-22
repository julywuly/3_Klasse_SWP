package aufgabenKlasseScanner;

import java.util.Scanner;

public class Aufgabe03 {
	static Scanner s;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int summe = 0;
		int z1 = -1;
		while (z1 != 0) {
			System.out.println("Bitte eine Ganzzahl eingeben:");
			z1 = s.nextInt();
			summe += z1;
		}

		System.out.printf("Summe: %d", summe);
		s.close();
	}

}
