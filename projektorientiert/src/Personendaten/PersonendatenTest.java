package Personendaten;

import Klassen.Personen;

public class PersonendatenTest {

    public static void main(String[] args) {
        Personendaten person1 = new Personendaten("Juliana", "Rössler", 15);
        Personendaten person2 = new Personendaten();
        person2.setAlter(12);
        person2.setNachName("Rössler");
        person2.setVorName("Larissa");

        person2.setPersonenAdresse("An der Ache", 17, 6250, "Kundl");
        person1.setPersonenAdresse("Lärchenstraße", 29, 6063, "Rum");

        person2.getPersonenAdresse();
        person1.getAlter();

    }
}
