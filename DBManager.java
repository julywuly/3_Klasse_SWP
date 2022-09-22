package jdbc2a_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	private Connection con;
	public DBManager() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"root", "root");

	}
	
	public void ausgabeEmployees() throws SQLException
	{
		Statement stmt =  con.createStatement();
		ResultSet rs =  stmt.executeQuery("SELECT * FROM employees LIMIT 20");
		while (rs.next())
		{
			String emp_no = rs.getString("emp_no");
			String birth_date = rs.getString("birth_date");
			String first_name = rs.getString("first_name");
			String last_name = rs.getString("last_name");
			String gender = rs.getString("gender");
			String hire_date = rs.getString("hire_date");
			System.out.printf("%-8s|%s|%10s|%12s|%s|%s|\n", emp_no, birth_date, first_name, last_name, gender, hire_date);
		}
		rs.close();
		stmt.close();
	}
	
	public void close() throws SQLException
	{
		con.close();
	}
}
