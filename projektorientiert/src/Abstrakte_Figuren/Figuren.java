package Abstrakte_Figuren;

public abstract class Figuren {

    abstract double flaeche();

    abstract double umfang();

    public String ausgabe() {
        return getClass().getSimpleName() + " " + "Fläche: " + flaeche()
                + "Umfang: " + umfang();
    }
}
