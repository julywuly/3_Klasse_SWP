package Klassen;

public class PersonenTest {

    public PersonenTest() {
    }

    public static void main(String[] args) {
        Personen a = new Personen("Juliana", "Rössler", 15);
        Personen b = new Personen("Alisia", "Rössler", 13);
        Personen c = new Personen();

        c.setAlter(9);
        c.setNachName("Rössler");
        c.setVorName("Larissa");

        a.ausgabe();
        b.ausgabe();
        c.ausgabe();

    }

}
