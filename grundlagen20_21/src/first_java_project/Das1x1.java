package first_java_project;

public class Das1x1 {
	static void einmaleins(int grenze) {
		for (int i = 1; i <= grenze; i++) {
			for (int j = 1; j <= grenze; j++) {
				System.out.print(i * j + "");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		einmaleins(10);
	}

}
