package db;

import java.sql.*;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Pstm {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","123");
		Statement stmt=con.createStatement();
		//ResultSet rs1=stmt.executeQuery("create table studetails(roll int,name varchar(50),class varchar(50))");
		PreparedStatement pstmt=con.prepareStatement("insert into studetails(roll,name,class) values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num of students:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter student roll:");
			int roll=sc.nextInt();
			System.out.println("Enter student name:");
			String name=sc.next();
			System.out.println("Enter student class:");
			String cla=sc.next();
			pstmt.setInt(1,roll);
			pstmt.setString(2,name);
			pstmt.setString(3,cla);
			pstmt.executeUpdate();
		}
		ResultSet rs=stmt.executeQuery("select * from studetails");
		while(rs.next()) {
			System.out.println("student= "+"roll:"+rs.getInt(1)+" name:"+rs.getString(2)+" class:"+rs.getString(3));
		}
		
	}
}
