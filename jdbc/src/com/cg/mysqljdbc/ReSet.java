package com.cg.mysqljdbc;
import java.sql.*;

public class ReSet 
 
	{
		
		
			public static void main(String[]args) throws SQLException
			{
				Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","adnan");
				System.out.println("got connection");
				PreparedStatement ps=myConn.prepareStatement("select * from books");
				ResultSet rs=ps.executeQuery();
				ResultSetMetaData rsmd=rs.getMetaData();
				
				System.out.println("Total columns:"+rsmd.getColumnCount());
				System.out.println("Column Name of 1st column:"+rsmd.getColumnName(1));
				System.out.println("Column Type Name of 1st column:"+rsmd.getColumnTypeName(1));
				
				
				
			}
		}




