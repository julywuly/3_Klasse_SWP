package first_java_project;

public class Methoden {

	public static void main(String[] args) {
		findeGroessereZahl(-21.29, -21.28);
	}

	static void findeGroessereZahl(double i, double j) {
		if (i > j) {
			System.out.print(i);
		} else {
			System.out.print(j);
		}
	}
}
