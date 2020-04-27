package com.cg.mysqljdbc;
import java.sql.*;

public class StatementPro 
{
	  
	public static void main(String args[])throws Exception{  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","adnan");  
	Statement stmt=con.createStatement();  
	  
	stmt.executeUpdate("insert into employee values(33,'Irfan',50000)");  
	int result=stmt.executeUpdate("update employee set name='Vimal',salary=10000 where id=33");  
	int result1=stmt.executeUpdate("delete from employee where id=33");  
	System.out.println(result1+" records affected");  
	con.close();  
	}
}  

