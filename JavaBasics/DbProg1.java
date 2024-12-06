package db;
import java.lang.*;
import java.sql.*;
import java.io.*;

public class DbProg1 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee","postgres","123");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp");
		while(rs.next()){
			System.out.println("row="+rs.getInt(1)+rs.getString(2)+rs.getFloat(3));
		}
	}
}
