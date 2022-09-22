package AufgabeJDBC;

import java.sql.*;

public class Employees {
    static Connection conn;

    public Employees() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root", "root");
        ;
    }

    static String vorname;
    static String nachname;
    static String emp_no;
    static String birthdate;
    static String gender;
    static String hiredate;

    public static void ausgabe() throws SQLException {
        System.out.println(vorname);
        System.out.println(nachname);
        System.out.println(emp_no);
        System.out.println(birthdate);
        System.out.println(gender);
        System.out.println(hiredate);
    }


    public static void holeVornamen() throws SQLException {
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select first_name from employees ");
        while (rs.next() == true) {
            vorname = rs.getString("first_name");
        }
        stm.close();
        rs.close();
    }

    public static void holeNachname() throws SQLException {
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select last_name from employees limit 5 ");
        while (rs.next() == true) {
            nachname = rs.getString("last_name");
        }
        stm.close();
        rs.close();
    }

    public static void holeMitarbeiternummer() throws SQLException {
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select emp_no from employees limit 5");
        while (rs.next() == true) {
            emp_no = rs.getString("emp_no");
        }
        stm.close();
        rs.close();
    }

    public static void holeGeburtstag() throws SQLException {
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select birth_date from employees limit 5");
        while (rs.next() == true) {
            birthdate = rs.getString("birth_date");
        }
        stm.close();
        rs.close();
    }


    public static void holeGeschlecht() throws SQLException {
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select gender from employees limit 5 ");
        while (rs.next() == true) {
            gender = rs.getString("gender");
        }
        stm.close();
        rs.close();
    }

    public static void holeAnstellung() throws SQLException {
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select hire_date from employees limit 5 ");
        while (rs.next() == true) {
            hiredate = rs.getString("hire_date");
        }
        stm.close();
        rs.close();
    }


    public static void neuerMitarbeiter() throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("insert into employees (emp_no, birth_date, first_name, last_name, gender, hire_date)VALUES\n" +
                "(2, 08/03/2006,'Juliana', 'Roessler', 'F', 12/03/2022  );");

        stmt.close();
    }

    public static void gehalt() throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("update salaries set salary = 87000 where emp_no = 10001");
        stmt.close();
    }


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Employees m = new Employees();
        gehalt();
        neuerMitarbeiter();
        holeGeschlecht();
        holeAnstellung();
        holeGeburtstag();
        holeMitarbeiternummer();
        holeNachname();
        holeVornamen();
        ausgabe();
        conn.close();
    }
}
