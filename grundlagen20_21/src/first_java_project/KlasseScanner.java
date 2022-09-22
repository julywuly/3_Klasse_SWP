package first_java_project;

import java.util.Scanner;

public class KlasseScanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println("Name: ");
//		String name = s.nextLine();
//		System.out.printf("Hallo %s\n", name);

//		System.out.printf("Bitte Zahl 1 einlesen: ");
//		int z1 = s.nextInt();
//
//		System.out.printf("Bitte Zahl 1 einlesen: ");
//		int z2 = s.nextInt();
//
//		System.out.printf("Summe: %d", z1 + z2);

//		System.out.printf("Bitte Zahl 1 einlesen: ");
//		double z1 = s.nextDouble();
//
//		System.out.printf("Bitte Zahl 2 einlesen: ");
//		double z2 = s.nextDouble();
//
//		System.out.printf("Summe: %f", z1 + z2);
		
//		s.useDelimiter("X");
//		System.out.printf("Bitte Vorname(n) einlesen: ");
//		String vorname = s.nextLine();
//
//		System.out.printf("Bitte Nachnamen einlesen: ");
//		String nachname = s.nextLine();
//
//		System.out.printf("Ihr Name: %s, %s ", z1 , z2);

		
		System.out.printf("Bitte Zahl 1 einlesen: ");
		double z1 = s.nextDouble();

		System.out.printf("Bitte Zahl 2 einlesen: ");
		double z2 = s.nextDouble();

		System.out.printf("Summe: %f", z1 + z2);

		s.close();

	}

}
