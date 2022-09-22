package wiederholungsaufgaben;

public class Aufgabe01 {
    public static void main(String[] args) {

        double k = 2;
        for (long i = 1; i < 63; i++) { //Schachbrett ist 64Felder groß
            k = k * 2;//es werden auf dem nächsten Feld immer doppelt so viele Körner wie davor hingelegt
        }
        System.out.println(k);
    }
}
