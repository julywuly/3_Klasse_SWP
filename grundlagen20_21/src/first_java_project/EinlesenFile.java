package first_java_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EinlesenFile {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("text.txt"));
		while (s.hasNextLine()) {
			String l = s.nextLine();
			System.out.println(l);
		}

		s.close();
	}

}
