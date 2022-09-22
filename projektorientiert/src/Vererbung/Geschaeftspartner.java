package Vererbung;


public class Geschaeftspartner extends Person {


    int Zusammenarbeitszeit;

    public Geschaeftspartner(String Name, int alter, int Zusammenarbeitszeit) {
        super(Name, alter);
        this.Zusammenarbeitszeit = Zusammenarbeitszeit;
    }


    public int getZusammenarbeitszeit() {
        return Zusammenarbeitszeit;
    }

    public void setZusammenarbeitszeit(int Zusammenarbeitszeit) {
        this.Zusammenarbeitszeit = Zusammenarbeitszeit;
    }

    public void ausgabe() {
        super.ausgabe();
        System.out.println(Zusammenarbeitszeit);
    }
}