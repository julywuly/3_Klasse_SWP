package Geometrische_Formen;

public class RechtwinkligesDreieck {

    int seitea;
    int seiteb;
    int hoehe;
    double hypo;


    public double hypo() {
        return hypo = Math.sqrt(seitea * seitea + seiteb * seiteb);
    }

    public double umfang() {
        return (seitea + seiteb + hypo);
    }

    public int flaeche() {
        return (seitea * seiteb) / 2;
    }

    public RechtwinkligesDreieck(int seitea, int seiteb, int hoehe) {
        this.seitea = seitea;
        this.seiteb = seiteb;
        this.hoehe = hoehe;
    }


    void ausgabe() {
        System.out.println(umfang());
        System.out.println(flaeche());
    }
}


