package Vererbung;

import java.util.ArrayList;

public class VererbungTest {

    public static void main(String[] args) {

        Firmenkunde f1 = new Firmenkunde("Huber", 34, 1, "AMEC");
        f1.ausgabe();

        Firmenkunde f2 = new Firmenkunde("Staller", 23, 2, "MTECH");
        f1.ausgabe();

        Firmenkunde f3 = new Firmenkunde("Müller", 19, 3, "UFW");
        f1.ausgabe();

        AussendienstMA a1 = new AussendienstMA("Peters", 55, "Kufstein");

        Kunde k1 = new Kunde("Schmid", 25, 122);

        ArrayList<Person> pers1 = new ArrayList<Person>();
        pers1.add(f1);
        pers1.add(f2);
        pers1.add(f3);
        pers1.add(a1);
        pers1.add(k1);

        for (int i = 0; i < pers1.size(); i++) {
            pers1.get(i).ausgabe();

            ArrayList<Firmenkunde> fKunden = new ArrayList<Firmenkunde>();

            fKunden.add(f1);
            fKunden.add(f3);
            fKunden.add(f3);

            for (int i1 = 0; i1 < fKunden.size(); i1++) {
                fKunden.get(i1).ausgabe();

            }
        }

    }
}
