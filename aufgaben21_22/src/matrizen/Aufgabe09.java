package matrizen;

public class Aufgabe09 {

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][] mat2 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        if (vergleich(mat1, mat2)) {
            System.out.print("True");
        } else System.out.print("False");

    }

    static boolean vergleich(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length) {
            return false;
        } else {
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    if (mat1[i][j] != mat2[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;

    }


}
