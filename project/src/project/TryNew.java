package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TryNew {
	public static void main(String[] args) throws SQLException{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter num  :");
//		int num=sc.nextInt();
//		System.out.println("Enter the name :");
//		String name=sc.next();
//		sc.close();
	try1();	
	}
public static void  try1() {		
	try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Dhiva@chain");
//			Statement st=con.createStatement();
			//int result =st.executeUpdate("insert into filetable values(num,name)");
//			String sql="update filetable set name='dhiva' where id=101";
			String sql1="delete filetable where id=3131";
			PreparedStatement st=con.prepareStatement(sql1);
			int rs=st.executeUpdate();
			System.out.println("record affected");
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
	public void try2(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num  :");
		int num=sc.nextInt();
		System.out.println("Enter the name :");
		String name=sc.next();
		sc.close();
		try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Dhiva@chain");
			Statement st=con.createStatement();
			String result =("insert into filetable"+"(num,name)"+" values(?,?)");
			my=myconn.prepareStatement(result);
			result.setString(1,num);
			result.setString(2,name);
			my.executeUpdate();
			System.out.println(result+"record affected");
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
}
