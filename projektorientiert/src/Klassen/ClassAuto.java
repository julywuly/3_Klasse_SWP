package Klassen;

public class ClassAuto {
    private float spritverbrauch;
    private float geschwindigkeit;

    public ClassAuto(int i, float spritverbrauch) {
        this.spritverbrauch = spritverbrauch;
    }

    public ClassAuto() {
    }


    public void beschleunige(float geschw) {
        geschwindigkeit += geschw;
        spritverbrauch += geschw * 0.1;
    }

    public float getSpritverbrauch() {
        return spritverbrauch;
    }

    public void setSpritverbrauch(float spritverbrauch) {
        this.spritverbrauch = spritverbrauch;
    }

    public float getGeschwindigkeit(int i) {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(float geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public void bremse(float geschw) {
        geschwindigkeit -= geschw;
        spritverbrauch -= geschw * 0.1;
    }

    public void anhalten() {
        geschwindigkeit = 0;
        spritverbrauch = 0;
    }

    void ausgabe() {
        System.out.println(geschwindigkeit);
        System.out.println(spritverbrauch);
    }


}
