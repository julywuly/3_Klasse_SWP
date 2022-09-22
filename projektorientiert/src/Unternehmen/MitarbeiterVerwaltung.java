package Unternehmen;

import java.util.ArrayList;
import java.util.Scanner;

public class MitarbeiterVerwaltung {
    Scanner s = new Scanner(System.in);
    private Mitarbeiter mitarbeiter;
    private ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();

    public MitarbeiterVerwaltung() {
    }

    public MitarbeiterVerwaltung(Mitarbeiter mitarbeiter) {
        super();
        this.mitarbeiter = mitarbeiter;
    }

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterListe.add(mitarbeiter);
    }

    public ArrayList<Mitarbeiter> suche() {
        System.out.print("Welchen Mitarbeiter suchen Sie? Bitte den Nachnamen angeben:");
        String suchStr = s.nextLine().toUpperCase();
        ArrayList<Mitarbeiter> treffer = new ArrayList<Mitarbeiter>();
        for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
            if (mitarbeiter.getNachName().toUpperCase().contains(suchStr)) {
                treffer.add(mitarbeiter);
            }
        }
        for (Mitarbeiter mitarbeiter : treffer) {
            System.out.printf("%10s %10s: %10s, %5d\n", mitarbeiter.getVorName(), mitarbeiter.getNachName().toUpperCase(), mitarbeiter.getAbteilung(), mitarbeiter.getMonate());
        }
        return treffer;
    }

    public ArrayList<Mitarbeiter> removeMitarbeiter() {
        int i = 0;
        System.out.printf("Welchen Mitarbeiter wollen Sie löschen? Bitte Nachnamen angeben: ");
        String str = s.nextLine().toUpperCase();
        for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
            if (mitarbeiter.getNachName().toUpperCase().contains(str)) {
                i = 1;
            } else
                i = 0;
        }
        mitarbeiterListe.remove(0);
        return mitarbeiterListe;
    }


    public ArrayList<Mitarbeiter> sucheLeiter() {
        System.out.println("Diese Mitarbeiter haben die Stellung 'Leiter': ");
        ArrayList<Mitarbeiter> treffer = new ArrayList<Mitarbeiter>();
        for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
            if (mitarbeiter.getStellung() == Mitarbeiter.STELLUNG.LEITER) {
                treffer.add(mitarbeiter);
            }
        }
        for (Mitarbeiter mitarbeiter : treffer) {
            mitarbeiter.ausgabe();
        }
        return mitarbeiterListe;
    }


    public ArrayList<Mitarbeiter> anzahlMitarbeiter() {
        System.out.print("Anzahl der Mitarbeiter: ");
        System.out.println(mitarbeiterListe.size());
        return mitarbeiterListe;
    }

    public void ausgabe() {
        for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
            mitarbeiter.ausgabe();
        }
    }
}
