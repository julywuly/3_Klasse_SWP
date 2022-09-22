package aufgabenArrays;

public class Aufgabe05 {

	static int[] umdrehen(int arr[]) {
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.printf("%d ", arr[j]);
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		umdrehen(arr);

	}
}
