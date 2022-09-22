package AufgabeJDBC;

import java.sql.*;

public class Departments {

    static String name;
    static String nummer;

    static Connection conn;

    public Departments() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root", "root");
        ;
    }

    public static void ausgabe() throws SQLException {
        System.out.println(name);
        System.out.println(nummer);

    }


    public static void holeDepartments1() throws SQLException {
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select dept_no from departments limit 5");
        while (rs.next()) {
            nummer = rs.getString("dept_no");


        }
        stm.close();
        rs.close();
    }

    public static void holeDepartments2() throws SQLException {
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select dept_name from departments limit 5");
        while (rs.next()) {
            name = rs.getString("dept_name");


        }
        stm.close();
        rs.close();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Departments m = new Departments();
        holeDepartments1();
        holeDepartments2();
        ausgabe();
        conn.close();
    }
}

