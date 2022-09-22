package jdbc_tmp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMain {
	Connection conn;
	
	public JDBCMain() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		conn = 
				DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "root");
	
	}
	public void ausgabe() throws SQLException
	{
		Statement stmt = conn.createStatement();
		ResultSet rs =  stmt.executeQuery("SELECT * FROM employees LIMIT 20");
		while (rs.next())
		{
			String firstName = rs.getString("first_name");
			String birthDate = rs.getString("birth_date");
			System.out.printf("%15s | %s \n",firstName, birthDate);
		}
		rs.close();
		stmt.close();
	}
	
	public void aendernEmployee(String name, String empNo) throws SQLException
	{
		Statement stmt2 = conn.createStatement();
		String sql = "UPDATE employees SET first_name = '" + name + "' WHERE emp_no = '" + empNo+ "'";
		System.out.println(sql);
		//stmt2.executeUpdate(sql);
		stmt2.close();

//		String sql = "UPDATE employees SET first_name = ? WHERE emp_no = ?";		
//		PreparedStatement stmt = conn.prepareStatement(sql);
//		stmt.setString(1, name);
//		stmt.setString(2, empNo);
//		stmt.executeUpdate();
//		stmt.close();
	}
	public void hinzufuegenEmployee(Employee e) throws SQLException
	{
		String sql = "INSERT INTO employees(emp_no, birth_date,first_name, last_name, gender,hire_date) "
				+ " VALUES (?,?,?,?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, e.getEmpNo());
		stmt.setString(2, e.getBirthDate());
		stmt.setString(3, e.getFirstName());
		stmt.setString(4, e.getLastName());
		stmt.setString(5, e.getGender());
		stmt.setString(6, e.getHireDate());
		stmt.executeUpdate();
		stmt.close();
	}
	public void close() throws SQLException
	{
		conn.close();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		JDBCMain m = new JDBCMain();
		//m.ausgabe();
		//m.aendernEmployee("Kristian", "';DELETE FROM employees WHERE '1' = '1");
		
		Employee e = new Employee("-1", "Hubert", "von Goisern", "M","1952-01-10", "2022-03-10");
		m.hinzufuegenEmployee(e);
		m.close();	
	}

}

