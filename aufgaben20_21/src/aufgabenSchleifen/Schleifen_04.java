package aufgabenSchleifen;
//IT Folien S.10
public class Schleifen_04 {

	public static void main(String[] args) {
		System.out.print("1*2 = ");
		System.out.println(fakul(2));
		System.out.print("1*2*3 = ");
		System.out.println(fakul(3));
		System.out.print("1*2*3*4 = ");
		System.out.println(fakul(4));
		System.out.print("1*2*3*4*5 = ");
		System.out.println(fakul(5));
		System.out.print("1*2*3*4*5*6 = ");
		System.out.println(fakul(6));
		System.out.print("1*2*3*4*5*6*7 = ");
		System.out.println(fakul(7));
		System.out.print("1*2*3*4*5*6*7*8 = ");
		System.out.println(fakul(8));
		System.out.print("1*2*3*4*5*6*7*8*9 = ");
		System.out.println(fakul(9));
		System.out.print("1*2*3*4*5*6*7*8*9*10 = ");
		System.out.println(fakul(10));

	}

	public static double fakul(int d) {
		double fakultaet = 1;
		for (int i = 1; i < d; i++) {
			fakultaet = fakultaet * i;

		}
		return fakultaet;

	}
}
