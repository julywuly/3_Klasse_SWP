package aufgabenKlasseScanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe02 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("ScannerAufgabe01");
		try (Scanner sc = new Scanner(new FileInputStream(file))) {
			int count = 0;
			while (sc.hasNext()) {
				sc.next();
				count++;
			}
			sc.close();
			System.out.println("Number of words: " + count);
		}

	}

}
