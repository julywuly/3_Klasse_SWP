package matrizen;

public class Aufgabe03 {

    private static void ausgabe(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (i * 10 + j) + 1;
                System.out.printf("%02d ", mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = new int[10][10];
        ausgabe(mat);
    }

}
