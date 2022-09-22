package Vererbung;

public class AussendienstMA extends Person {

    String Bezirk;

    public AussendienstMA(String Name, int alter, String Bezirk) {
        super(Name, alter);
        this.Bezirk = Bezirk;
    }


    public String getBezirk() {
        return Bezirk;
    }

    public void setBezirk(String Bezirk) {
        this.Bezirk = Bezirk;
    }

    public void ausgabe() {
        super.ausgabe();
        System.out.println(Bezirk);

    }

}
