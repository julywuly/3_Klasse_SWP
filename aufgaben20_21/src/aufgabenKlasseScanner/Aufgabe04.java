package aufgabenKlasseScanner;

import java.util.Scanner;

public class Aufgabe04 {
	static Scanner s;

	static int lottoTip(int[] lottoTip, int[] lottoZiehung) {

		int cnt = 0;
		for (int i = 0; i < lottoTip.length; i++) {
			for (int j = 0; j < lottoZiehung.length; j++) {
				if (lottoTip[i] == lottoZiehung[j]) {
					cnt++;
				}
			}
		}

		return cnt;

	}

	static int[] lottoTipScanner() {
		int arr[] = new int[6];
		int z1 = -1;
		for (int i = 0; i < 5; i++) {
			System.out.println("Bitte eine Ganzzahl eingeben:");
			z1 = s.nextInt();
			arr[i] = z1;
		}
		return arr;
	}

	static int[] lottoZiehungScanner() {
		int ar[] = new int[6];
		int z1 = -1;
		for (int i = 0; i < 5; i++) {
			System.out.println("Bitte eine Ganzzahl eingeben:");
			z1 = s.nextInt();
			ar[i] = z1;
		}
		return ar;
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);

		int[] lottoZiehung = lottoZiehungScanner();

		int[] lottoTip = lottoTipScanner();

		int cnt = lottoTip(lottoTip, lottoZiehung);

		System.out.printf("Anzahl gleiche: %d", cnt);

	}

}
