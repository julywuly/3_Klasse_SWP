package wiederholungsaufgaben;

import java.util.Scanner;

public class Aufgaben08091011 {

    static Scanner s = new Scanner(System.in);

    static void ausgabe(int[] arr) {
        for (int j : arr) {
            System.out.printf("%3d", j);
        }
        System.out.println();
    }

    static boolean kommtVor(int[] a, int z) {
        for (int j : a) {
            if (j == z) {
                return true;
            }
        }
        return false;
    }

    static int[] lottoZahlen() {
        int[] zahlen = new int[7];
        for (int i = 0; i < zahlen.length; i++) {
            int x = (int) (Math.random() * 49) + 1;
            boolean drinnen = false;
            for (int k : zahlen) {
                if (k == x) {
                    drinnen = true;
                    break;
                }
            }
            if (!drinnen || x < 45) {
                zahlen[i] = x;
            } else {
                i--;
            }
        }

        return zahlen;
    }

    static int[] lottoTip() {
        int[] lt = new int[7];
        for (int i = 0; i < lt.length; i++) {
            System.out.printf("Bitte die Zahl %d eingeben:", (i + 1));
            int l = Integer.parseInt(s.nextLine());
            boolean drinnen = false;
            for (int k : lt) {
                if (k == l) {
                    drinnen = true;
                    break;
                }
            }
            if (!drinnen) {
                lt[i] = l;
            } else {
                i--;
            }
        }
        return lt;
    }

    static int anzahlGleiche(int[] a1, int[] a2) {
        int gleiche = 0;
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = 0; j < a2.length - 1; j++) {
                if (a1[i] == a2[j]) {
                    gleiche++;
                }
            }
        }
        return gleiche;
    }

    static boolean zusatzZahlRichtig(int[] arr1, int[] arr2) {

        if (arr2[6] == arr1[6]) {
            System.out.println("Zusatzzahl übereinstimmung: JA");
            return true;

        } else {
            System.out.println("Zusatzzahl übereinstimmung: NEIN");
        }
        return false;
    }

    static String spielernamen() {
        System.out.println("Bitte Spieleramen hier eingeben: ");
        return s.nextLine();
    }

    static String wiederholen() {
        System.out.println("Spiel wiederholen?: Ja/Nein");
        return s.nextLine();
    }

    public static void main(String[] args) {
        String st = spielernamen();
        int[] lt = lottoTip();
        ausgabe(lt);
        int[] lz = lottoZahlen();
        ausgabe(lz);
        int gleiche = anzahlGleiche(lz, lt);
        System.out.printf("%s's Lottoergebnis: ", st);
        System.out.println(gleiche);
        boolean zusatzZahlRichtig = zusatzZahlRichtig(lz, lt);
        String str = wiederholen();
        if (str.equals("Ja")) {
            main(args);
        } else {
            System.exit(0);
        }

        s.close();

    }
}
