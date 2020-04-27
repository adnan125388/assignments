package com.cg.mysqljdbc;
import java.sql.*;

public class TranMang
{
	public static void main(String args[])throws Exception{  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
	con.setAutoCommit(false);  
	  
	Statement stmt=con.createStatement();  
	stmt.executeUpdate("insert into user420 values(190,'abhi',40000)");  
	stmt.executeUpdate("insert into user420 values(191,'umesh',50000)");  
	  
	con.commit();  
	con.close();  
	}
}  

