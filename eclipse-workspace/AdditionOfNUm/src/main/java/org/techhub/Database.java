package org.techhub;
import java.sql.*;

public class Database {
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pp50","root","Gokul@6187");
		if(conn!=null)
		{
			System.out.println("connected sucessfully:");
		}
		else
		{
			System.out.println("not connected:");
			
		}
	}

}
