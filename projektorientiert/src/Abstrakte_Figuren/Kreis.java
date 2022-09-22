package Abstrakte_Figuren;

public class Kreis extends Figuren {

    private double radius;

    //Konstrucktor
    public Kreis(double radius) {
        this.radius = radius;
    }

    //Getter
    public double getRadius() {
        return radius;
    }

    //Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double umfang() {
        return 2 * radius * 3.141;
    }


    public double flaeche() {
        return radius * radius * 3.141;
    }

    public String toString() {
        return super.ausgabe() + "Radius: " + radius;

    }

}
