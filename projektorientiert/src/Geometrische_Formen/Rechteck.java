package Geometrische_Formen;

public class Rechteck {

    int seitea;
    int seiteb;
    int hoehe;

    public double umfang() {
        return 2 * (seitea + seiteb);
    }

    public double flaeche() {
        return seitea * seiteb;
    }

    public double volumen() {
        return seitea * seiteb * hoehe;
    }


    public Rechteck(int seitea, int seiteb, int hoehe) {
        this.seitea = seitea;
        this.seiteb = seiteb;
        this.hoehe = hoehe;
    }


    void ausgabe() {
        System.out.println(umfang());
        System.out.println(flaeche());
        System.out.println(volumen());
    }
}
