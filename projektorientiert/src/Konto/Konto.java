package Konto;

public class Konto {

    private double saldo;
    private int nummer;

    public Konto(int nummer, double saldo) {

        this.nummer = nummer;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    void einzahlen(double betrag) {
        setSaldo(saldo + betrag);
    }

    void auszahlen(double betrag) {
        setSaldo(saldo - betrag);

    }


    void ausgabe() {
        System.out.printf("Konto Nummer: %d ", nummer);
        System.out.println("Konto Saldo: "+ saldo);

    }

}



