package Klassen;

public class Land {

    String land;
    double bevölkerungszahl;
    double wachstum;

    public Land() {
    }

    public Land(double bevölkerungszahl, double wachstum, String land) {
    }


    //Getter
    public String getLand() {
        return land;
    }

    public double getBevölkerungszahl() {
        return bevölkerungszahl;
    }

    public double getWachstum() {
        return wachstum;
    }


    //Setter
    public void setWachstum(double wachstum) {
        this.wachstum = wachstum;
    }

    public void setBevölkerungszahl(double bevölkerungszahl) {
        this.bevölkerungszahl = bevölkerungszahl;
    }

    public void setLand(String land) {
        this.land = land;
    }


    public void neuesJahr() {
        bevölkerungszahl += bevölkerungszahl * wachstum;
        System.out.println(bevölkerungszahl);
    }
}

