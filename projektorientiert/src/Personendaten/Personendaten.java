package Personendaten;

public class Personendaten {

    String vorName;
    int alter;
    String nachName;

    //Wohnort
    PersonenAdresse personenAdresse;

    public PersonenAdresse getPersonenAdresse() {
        return personenAdresse;
    }

    public void setPersonenAdresse(String strasse, int hnr, int plz, String ort) {
    }

    public Personendaten() {
    }

    //Getter
    public String getNachName() {
        return nachName;
    }

    public String getVorName() {
        return vorName;
    }

    public int getAlter() {
        return alter;
    }


    //Setter
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }


    public Personendaten(int alter) {
        this.alter = alter;
    }

    public Personendaten(String vorName, String nachName, int alter) {
        this.nachName = nachName;
        this.vorName = vorName;
        this.alter = alter;
    }


    void ausgabe() {
        System.out.println(vorName);
        System.out.println(nachName);
        System.out.println(alter);
    }


}

