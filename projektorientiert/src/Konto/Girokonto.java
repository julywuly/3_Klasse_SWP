package Konto;

public class Girokonto extends Konto {

    public Girokonto(int nummer, double saldo) {
        super(nummer, saldo);
    }


    int ueberziehungsrahmen = 2000;

    void ueberweisen(Konto k, double betrag) {
        k.setSaldo(k.getSaldo() + betrag);
        setSaldo(getSaldo() - betrag);

        System.out.printf("Konto " + k.getNummer() + " wurde Geld gutgeschrieben\n");

    }

    void abheben(double betrag) {
        if (getSaldo() - betrag > -ueberziehungsrahmen) {
            super.auszahlen(betrag);
        }
    }

    void ausgabe() {
        super.ausgabe();
        System.out.println("Rahmen zu Überziehen: " + ueberziehungsrahmen);
    }
}

