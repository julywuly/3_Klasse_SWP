package Unternehmen;

public class UnternehmenTest {

    public static void main(String[] args) {
        MitarbeiterVerwaltung mv = new MitarbeiterVerwaltung();

        Mitarbeiter mi1 = new Mitarbeiter();
        Mitarbeiter mi2 = new Mitarbeiter();

        mi1.benutzerEingabe();
        mi2.benutzerEingabe();

        mv.addMitarbeiter(mi1);
        mv.addMitarbeiter(mi2);

        mv.ausgabe();
        mv.anzahlMitarbeiter();
        mv.removeMitarbeiter();
        mv.ausgabe();
        mv.suche();
        mv.sucheLeiter();
    }
}