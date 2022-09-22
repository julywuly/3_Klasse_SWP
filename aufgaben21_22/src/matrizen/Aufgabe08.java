package matrizen;

import java.lang.Math;

public class Aufgabe08 {

    public static void main(String[] args) {
        char[][] mat = spielfeld();
        if (gewonnen(mat)) {
            System.out.print("Gewonnen");
        } else System.out.print("Verloren");

    }

    private static char[][] spielfeld() {
        char[][] mat = new char[4][4];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                char g;
                if (Math.random() >= 0.5) {
                    g = 'x';
                } else g = 'O';
                mat[i][j] = g;
            }
        }
        return mat;
    }


    static boolean gewonnen(char[][] mat) {
        String s = "";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                s += mat[i][j];
            }
            s += ",";
        }
        for (int j = 0; j < mat.length; j++) {
            for (int i = 0; i < mat[j].length; i++) {
                s += mat[i][j];
            }
            s += ",";
        }
        return s.contains("xxxx") || s.contains("OOOO");
    }

}

