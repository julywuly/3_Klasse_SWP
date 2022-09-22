package matrizen;

public class Aufgabe06 {

    static int sum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
        }
        System.out.println(sum);
        return sum;
    }


    public static void main(String[] args) {
        sum(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}});
    }
}
