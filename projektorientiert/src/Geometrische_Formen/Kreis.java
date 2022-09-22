package Geometrische_Formen;

public class Kreis {

    int radius;

    public double umfang() {
        return (2 * 3.141 * radius);
    }

    public double flaeche() {
        return radius * radius * 3.141;
    }

    public Kreis(int radius) {
        this.radius = radius;
    }

    void ausgabe() {
        System.out.println(umfang());
        System.out.println(flaeche());
    }
}