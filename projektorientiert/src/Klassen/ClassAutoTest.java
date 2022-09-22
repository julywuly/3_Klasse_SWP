package Klassen;

public class ClassAutoTest {
    public ClassAutoTest() {
    }

    public static void main(String[] args) {
        ClassAuto a3 = new ClassAuto(6,100);
        ClassAuto a1 = new ClassAuto();
        a1.beschleunige(10);
        a1.ausgabe();

        ClassAuto a2 = new ClassAuto();
        a2.beschleunige(40);
        a2.ausgabe();

        a1.setGeschwindigkeit(200);
        a1.getGeschwindigkeit(200);







    }
}
