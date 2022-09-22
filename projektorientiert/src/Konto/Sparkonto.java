package Konto;

public class Sparkonto extends Konto {
    private final double zins = 1.85;


    public Sparkonto(int nummer, double saldo) {
        super(nummer, saldo);
    }


    void abheben(double betrag) {
        super.auszahlen(betrag);
    }

    void jahresZinsenAddieren() {
        setSaldo(getSaldo() * zins / 100);
    }

    void ausgabe() {
        super.ausgabe();
        System.out.println("Zinssatz: " + zins);
    }

}
