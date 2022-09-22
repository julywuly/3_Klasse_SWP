package Vererbung;

public class Angestellter extends Person {

    String Abteilung;

    public Angestellter(String Name, int alter, String Abteilung) {
        super(Name, alter);
        this.Abteilung = Abteilung;
    }

    public String getAbteilung() {
        return Abteilung;
    }

    public void setAbteilung(String Abteilung) {
        this.Abteilung = Abteilung;
    }

    public void ausgabe() {
        super.ausgabe();
        System.out.println(Abteilung);

    }

}
