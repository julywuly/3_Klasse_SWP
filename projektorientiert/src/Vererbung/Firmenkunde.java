package Vererbung;

public class Firmenkunde extends Person {

    public String toString() {
        return Person.Name + ' ' + Person.alter + ' ' + "(KNr.:" + Kunde.Kundennummer + ")" + ' ' + Firma;
    }


    String Firma;
    int Kundennummer;

    public Firmenkunde(String Name, int alter, int Kundennummer, String Firma) {
        super(Name, alter);
        this.Kundennummer = Kundennummer;
        this.Firma = Firma;
    }

    public int getKundennummer() {
        return Kundennummer;
    }

    public void setKundennummer(int Kundennummer) {
        this.Kundennummer = Kundennummer;
    }

    public String getFirma() {
        return Firma;
    }

    public void setFirma(String Firma) {
        this.Firma = Firma;
    }

    public void ausgabe() {
        super.ausgabe();
        System.out.println(Kundennummer);
        System.out.println(Firma);

    }

}
