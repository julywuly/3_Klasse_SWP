package aufgabenArrays;

public class Aufgabe04 {

	static int summe(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		summe(new int[] { 1, 3, 5, 7, 9 });

	}
}
