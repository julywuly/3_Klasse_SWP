package Vererbung;

import java.util.ArrayList;

public class Kunde extends Person {


    public String toString() {
        return Person.Name + ' ' + Person.alter + ' ' + "(KNr.:" + Kundennummer + ")";
    }


    static int Kundennummer;

    public Kunde(String Name, int alter, int Kundennummer) {
        super(Name, alter);
        this.Kundennummer = Kundennummer;
    }

    public Kunde(String lens, int alter) {
        super(lens, alter);
    }

    public int getKundennummer() {
        return Kundennummer;
    }

    public void setKundennummer(int Kundennummer) {
        this.Kundennummer = Kundennummer;
    }

    public void ausgabe() {
        super.ausgabe();
        System.out.println(Kundennummer);

    }
}
