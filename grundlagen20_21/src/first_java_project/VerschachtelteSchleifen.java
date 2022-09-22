package first_java_project;

public class VerschachtelteSchleifen {

	public static void main(String[] args) {
		for (int zeile = 0; zeile <= 10; zeile++) {
			for (int spalte = 0; spalte <= 10; spalte++) {
				System.out.printf("(" + zeile + "," + spalte + ")");
			}
			System.out.println();
		}

	}
}
