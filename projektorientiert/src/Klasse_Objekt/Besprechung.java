package Klasse_Objekt;

public class Besprechung {

    ////////////////////////////////////////////////////////////////////////////
// Die Klasse Lehrer
////////////////////////////////////////////////////////////////////////////



    public class Lehrer extends Person {
        private String kuerzel;

        public Lehrer(String name, int alter, String kuerzel) {
            super(name, alter);
            this.kuerzel = kuerzel;
        }

        @Override
        public String toString() {
            return super.toString() + " " + kuerzel;
        }

        @Override
        public boolean equals(Object obj) {
            Lehrer l = (Lehrer)obj;
            return super.equals(obj) && kuerzel.equals(l.kuerzel);
        }

    }


////////////////////////////////////////////////////////////////////////////
// Die Klasse Person
////////////////////////////////////////////////////////////////////////////



    public static class Person {
        private String name;
        private int alter;

        public Person(String name, int alter) {
            super();
            this.name = name;
            this.alter = alter;
        }

        @Override
        public String toString() {
            return String.format("%s ( %d )\n", name, alter);
        }

        @Override
        public boolean equals(Object obj) {
            Person p = (Person)obj;
            return alter == p.alter && name.equals(p.name);
        }
    }


////////////////////////////////////////////////////////////////////////////
// Die Klasse PersonTest
////////////////////////////////////////////////////////////////////////////


    public static class PersonTest {

        public static void main(String[] args) {
            Person p1 = new Person("Hubert", 40);
            Person p2 = new Person("Hubert", 41);
            if (p1.equals(p2))
            {
                System.out.println("ist gleich!");
            } else
            {
                System.out.println("ist NICHT gleich!");
            }

        }

    }


}
