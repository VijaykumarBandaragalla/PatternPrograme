package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ShivamJdbc {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ptstmt=null;
	Scanner sc=new Scanner(System.in);
	ResultSet rs=null;
	String query="select * from girmiti.emp where empname=?";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		ptstmt=con.prepareStatement(query);
		System.out.println("enter the name");
		String name=sc.next();
		ptstmt.setString(1, name);
		rs=ptstmt.executeQuery();
		if(rs.next()) {
			String names=rs.getString(1);
			System.out.println(names);
		}
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	public static void main(String[] args) {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		String query= "insert into girmiti.emp values(?,?,?,?)";
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
//			pstmt=con.prepareStatement(query);
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter the empno");
//			int empno=sc.nextInt();
//			System.out.println("enter empname");
//			String empname=sc.next();
//			System.out.println("enter sal");
//			int empsal = sc.nextInt();
//			System.out.println("enter eid");
//			int eid = sc.nextInt();
//			
//			pstmt.setInt(1, empno);
//			pstmt.setString(2, empname);
//			pstmt.setInt(3, empsal);
//			pstmt.setInt(4, eid);
//			pstmt.executeUpdate();
//			System.out.println("your data has been recorded succefully");
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//	}
//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Connection con =null;
//		Statement stmt = null;
//		String query="delete from girmiti.emp where empno=12";
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
//			stmt = con.createStatement();
//			int dml=stmt.executeUpdate(query);
//			System.out.println(dml);
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//	}
//}





























//	public static void main(String[] args) {
//		Connection con=null;
//		Statement stmt=null;
//		String query="insert into girmiti.emp where empno = 8";
//		String delQuery="delete from girmiti.emp where empno = 8";
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
//			stmt = con.createStatement();
////			boolean a=stmt.execute("query");
////			System.out.println(a);
////			int b=stmt.executeUpdate("delquery");
////			System.out.println(b);
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//	}
//}
