package matrizen;

public class Aufgabe02 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int i;
        int j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) ;
            System.out.println("Zeile: " + i + " Länge der Zeile: " + j);
        }
    }
}
