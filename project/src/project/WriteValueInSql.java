package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class WriteValueInSql {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter number :");
		int num=sc.nextInt();
		System.out.println("Enter the name :");
		String name=sc.next();
		String sql="insert into filetable values(?,?)";
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			Connection con=DriverManager.getConnection(url,"system","Dhiva@chain");
			Statement st=con.createStatement();
			int m=st.executeUpdate(sql);
			if(m==1)
				System.out.println("inserted successfully"+sql);
			else
				System.out.println("insertion failed");
			con.close();
		}
			catch(Exception ex) {
				System.out.println(ex);
			}finally {
				sc.close();
			}
		
	}
}
