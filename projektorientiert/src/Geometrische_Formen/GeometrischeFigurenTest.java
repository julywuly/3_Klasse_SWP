package Geometrische_Formen;

public class GeometrischeFigurenTest {

    public static void main(String[] args) {

        Kreis[] k = new Kreis[3];
        RechtwinkligesDreieck[] rw = new RechtwinkligesDreieck[3];
        Rechteck[] r = new Rechteck[3];

        k[0] = new Kreis(6);
        rw[0] = new RechtwinkligesDreieck(7, 4, 5);
        r[0] = new Rechteck(5, 9, 4);

        k[1] = new Kreis(7);

        for (int i = 0; i < 3 && k[i] != null && rw[i] != null && r[i] != null; i++) {
            k[i].ausgabe();
            rw[i].ausgabe();
            r[i].ausgabe();
        }
    }
}
