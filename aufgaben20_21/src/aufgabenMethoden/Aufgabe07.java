package aufgabenMethoden;

public class Aufgabe07 {

	public static void main(String[] args) {
		System.out.print(zeichenberechnen("Das ist ein Text"));

	}

	static int zeichenberechnen(String str) {
		int laengeString = str.length();
		return laengeString;
	}
}