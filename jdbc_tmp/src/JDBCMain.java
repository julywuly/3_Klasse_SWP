import java.sql.*;

public class JDBCMain {

    static Connection conn;

    public JDBCMain() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root", "root");
        ;
    }

    public static void ausgabe() throws SQLException {
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select * from employees LIMIT 20");
        while (rs.next() == true) {
            String firstName = rs.getString("first_name");
            System.out.println(firstName);

        }
        stm.close();
        rs.close();

    }

    public static void alter() throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("update employees set first_name = 'Christian' where emp_no = 10004");


        stmt.close();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        JDBCMain m = new JDBCMain();
        alter();
        ausgabe();

        conn.close();
    }
}


