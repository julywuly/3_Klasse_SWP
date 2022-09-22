package Klassen;

public class Personen {

    String vorName;

    public Personen() {
    }

    String nachName;

    public Personen(int alter) {
        this.alter = alter;
    }

    int alter;

    public Personen(String vorName, String nachName, int alter) {
        this.nachName = nachName;
        this.vorName = vorName;
        this.alter = alter;
    }


    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public String getNachName() {
        return nachName;
    }


    public String getVorName() {
        return vorName;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }


    void ausgabe() {
        System.out.println(vorName);
        System.out.println(nachName);
        System.out.println(alter);
    }

}