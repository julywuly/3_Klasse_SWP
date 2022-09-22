package wiederholungsaufgaben;

public class Aufgabe05 {

	public static void main(String[] args) {

		String s = "Das ist ein Text";

		char[] c = s.toCharArray();

		for (int j = c.length - 1; j >= 0; j--) {
			System.out.print(c[j]);
		}
	}
}
