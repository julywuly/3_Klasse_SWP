package Personendaten;

public class PersonenAdresse {

    String ort;
    String straße;
    int hausnummer;
    int plz;

    public PersonenAdresse(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public PersonenAdresse(String straße) {
        this.straße = straße;
    }

    //Setter
    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }


    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }


    //Getter
    public String getOrt() {
        return ort;
    }

    public String getStraße() {
        return straße;
    }

    public int getPlz() {
        return plz;
    }

    public int getHausnummer() {
        return hausnummer;
    }

}

