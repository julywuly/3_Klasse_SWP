package wiederholungsaufgaben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe12 {
    static void Zahleneinlesen() throws FileNotFoundException {

        Scanner s = new Scanner(new File("C:\\Users\\Juliana\\workspace\\aufgaben21_22\\src\\Lottozahlen einlesen Aufgabe12"));
        while (s.hasNextLine()) {

            String l = s.nextLine();
            System.out.println(l);
            String[] st = l.split(" ");
            int[] lz = new int[8];
            for (int i = 0; i < st.length; i++) {
                String part = st[i];
                int j = Integer.parseInt(part);
                lz[i] = j;
                System.out.println(lz[j]);

            }
        }
        s.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Zahleneinlesen();
    }
}