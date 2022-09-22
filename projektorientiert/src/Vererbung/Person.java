package Vererbung;

public class Person {
    static String Name;
    static int alter;

    public String toString() {
        return Name + ' ' + alter;
    }

    public Person(String Name, int alter) {

        this.Name = Name;
        this.alter = alter;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getalter() {
        return alter;
    }

    public void setalter(int alter) {
        this.alter = alter;
    }

    public void ausgabe() {
        System.out.println(Name);
        System.out.println(alter);

    }
}

