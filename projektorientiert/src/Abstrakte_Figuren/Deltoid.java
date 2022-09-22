package Abstrakte_Figuren;

public class Deltoid extends Figuren {

    private double kurzeS;
    private double langeS;

    public Deltoid(double kurzeS, double langeS) {
        this.kurzeS = kurzeS;
        this.langeS = langeS;
    }

    public double flaeche() {
        return kurzeS * langeS / 2;
    }


    public double umfang() {
        return 2 * (kurzeS + langeS);

    }

    public String toString() {
        return super.ausgabe() + " " + "Kurze Seite:" + " " + kurzeS
                + " " + "Lange Seite:" + " " + langeS;
    }
}


