package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {
	public static void main(String[] args) 
		 throws SQLException {
        try {
	    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Dhiva@chain");
	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");

	    while (rs.next()) {
	        String x = rs.getString("first_name");
	        String s = rs.getString("last_name");
//	        float f = rs.getFloat("c");
	        System.out.println(x+" "+s);
	    }
	   
	    }
        catch(Exception e) {
        	System.out.println(e.toString());
        }
	}
}
