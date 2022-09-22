package aufgabenKlasseScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe01 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner s = new Scanner(new File("ScannerAufgabe01"));
		while (s.hasNextLine()) {
			String line = s.nextLine();
			if (!line.startsWith("#")) {
				System.out.println(s);

			}
		}

		s.close();

	}

}
