package wiederholungsaufgaben;

public class Aufgabe04 {

    public static void main(String[] args) {
        for (int i = 0; i <= 9999; i++) {//Weil ein pin nur 4 stellen hat bis 9999
            System.out.printf("%04d\n", i);
        }
    }
}

