package Klassen;

public class LandTest {

    public static void main(String[] args) {
        Land indien = new Land(1095000000, 0.0138, "Indien");
        Land china = new Land();
        china.setBevölkerungszahl(1314000000);
        china.setLand("China");
        china.setWachstum(0.0059);

        while (indien.bevölkerungszahl < china.bevölkerungszahl) {
            china.neuesJahr();
            indien.neuesJahr();
        }

    }

}