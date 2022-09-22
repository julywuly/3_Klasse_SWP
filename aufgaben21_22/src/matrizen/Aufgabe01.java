package matrizen;

public class Aufgabe01 {
    public static void main(String[] args) {
        int[][] mat = new int[5][12];
        int i;
        int j = 0;
        for (i = 0; i < mat.length; i++)//Spalten
            for (j = 0; j < mat[0].length; j++) ;//Zeilen
        System.out.println("Anzahl Spalten: " + i + "\n" + "Anzahl Zeilen: " + j);
    }
}

