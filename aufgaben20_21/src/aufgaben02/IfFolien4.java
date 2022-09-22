package aufgaben02;
//IT Folien S. 12

public class IfFolien4 {

	public static void main(String[] args) {
		wachstum();

	}

	public static void wachstum() {
		int jahr = 2006;
		double indien = 1095;
		for (double china = 1314;china>indien;) {
			indien = indien * 1.0138;
			china = china * 1.0059;
			jahr++;
			System.out.printf("%d\n", jahr);
			System.out.printf("China: %15f\n", china);
			System.out.printf("Indien: %14f\n", indien);
		}
	}
}
