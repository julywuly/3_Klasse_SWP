package Klasse_Objekt;


import Vererbung.Firmenkunde;
import Vererbung.Kunde;
import Vererbung.Person;

import java.util.ArrayList;

public class Aufgabe01 {
    ArrayList<Person> Premiumkunden = new ArrayList<Person>();


    public static void main(String[] args) {
        Firmenkunde f1 = new Firmenkunde("Huber", 34, 1, "AMEC");
        f1.ausgabe();

        Firmenkunde f2 = new Firmenkunde("Staller", 23, 2, "MTECH");
        f1.ausgabe();

        Firmenkunde f3 = new Firmenkunde("Müller", 19, 3, "UFW");
        f1.ausgabe();


        Kunde k1 = new Kunde("Schmid", 25, 122);

        ArrayList<Person> pers1 = new ArrayList<Person>();

        pers1.add(f1);
        pers1.add(f2);
        pers1.add(f3);
        pers1.add(k1);

        ArrayList<Firmenkunde> fKunden = new ArrayList<Firmenkunde>();

        fKunden.add(f1);


        System.out.println(k1);


    }

    public void istPremiumkunde(Person Person, Kunde Kunde) {
        if (Person.equals(Kunde)) {
            Premiumkunden.add(Person);
        }
    }
}








