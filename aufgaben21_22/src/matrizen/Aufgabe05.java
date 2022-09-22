package matrizen;

public class Aufgabe05 {

    private static int matrixNull() {
        int[][] mat = {{1, 2, 3, 4}, {5, 0, 0, 8}};
        int anzahlNull = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                if (mat[i][j] == 0) {
                    anzahlNull++;
                }

        }
        System.out.println(anzahlNull);

        return anzahlNull;
    }

    public static void main(String[] args) {
        matrixNull();
    }
}
