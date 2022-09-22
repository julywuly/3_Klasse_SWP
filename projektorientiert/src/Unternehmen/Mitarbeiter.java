package Unternehmen;

import java.util.Scanner;

public class Mitarbeiter {
    private String vorName;
    private String nachName;
    private String abteilung;
    private int monate;

    enum STELLUNG {LAGERIST, LEITER, WISSENSCHAFTLER}

    private STELLUNG stellung;


    public String getVorName() {
        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public int getMonate() {
        return monate;
    }

    public  STELLUNG getStellung() {
        return stellung;
    }

    public  void setStellung(STELLUNG stellung) {
        this.stellung = stellung;
    }

    public void setMonate(int monate) {
        monateE();
    }

    public void setAbteilung(String abteilung) {
        abteilungE();
    }

    public void setNachName(String nachName) {
        nachNameE();
    }

    public void setVorName(String vorName) {
        vorNameE();
    }

    public void ausgabe() {
        System.out.printf("%10s %10s: %10s, %15s, %5d\n", vorName, nachName, abteilung, stellung, monate);
    }


    Scanner s = new Scanner(System.in);

    public void stellungE() {
        System.out.println("Bitte die Stellung eingeben (LEITER, LAGERIST, WISSENSCHAFTLER)");
        stellung = STELLUNG.valueOf(s.nextLine().toUpperCase());
    }

    public void vorNameE() {
        System.out.println("Bitte den Vornamen eingeben:");
        String str = s.nextLine();
        vorName = str;
    }

    public void nachNameE() {
        System.out.println("Bitte den Nachnamen eingeben:");
        String str = s.nextLine();
        nachName = str;
    }

    public void monateE() {
        System.out.println("Bitte die Monate seit Anstellung eingeben:");
        String str = s.nextLine();
        monate = Integer.parseInt(str);
    }

    public void abteilungE() {
        System.out.println("Bitte die Abteilung eingeben:");
        String str = s.nextLine();
        abteilung = str;
    }

    public void benutzerEingabe() {
        vorNameE();
        nachNameE();
        abteilungE();
        monateE();
        stellungE();
    }
}

