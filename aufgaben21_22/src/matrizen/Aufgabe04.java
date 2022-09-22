package matrizen;

import java.util.Random;

public class Aufgabe04 {

    private static int[][] zzMatrix(int groesse, int obergrenze) {
        int[][] mat = new int[groesse][obergrenze];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                int k = (int) (Math.random() * (groesse + 1));
                System.out.printf("%02d ", k);
                mat[i][j] = k;
            }
            System.out.println();
        }
        System.out.println(groesse);
        return mat;
    }

    public static void main(String[] args) {
        int obergrenze = 10;
        int groesse = (int) (Math.random() * obergrenze + 1);

        zzMatrix(groesse, obergrenze);
    }
}
