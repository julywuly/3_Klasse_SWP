package Konto;

public class KontenTest {

    public static void main(String[] args) {

        Konto k1 = new Konto(1234, 2700);
        Konto k2 = new Konto(1235, 200);

        Sparkonto s1 = new Sparkonto(1236, 4000);
        Sparkonto s2 = new Sparkonto(1237, 360);

        Girokonto g1 = new Girokonto(1238, 20000);
        Girokonto g2 = new Girokonto(1239, 45);

        k1.ausgabe();
        g2.ausgabe();

        g2.ueberweisen(k1, 40);  //Ich überweise 40€ an mein Girokonto

        k1.ausgabe();
        g2.ausgabe();
    }
}
