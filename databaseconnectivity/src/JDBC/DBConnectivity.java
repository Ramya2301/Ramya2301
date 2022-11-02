package JDBC;
import java.sql.Connection;
import java .sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
public class DBConnectivity
{
private static final String CREATE_TABLE="CREATE TABLE USER("+" USER_ID INT(10) NOT NULL PRIMARY KEY ,"+" FULLNAME VARCHAR(20) NOT NULL ,"+" DOB DATE,"+"EMAIL VARCHAR(50))";
	
public static void main(String [] args) throws ClassNotFoundException
	{
		String url="jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false";
        String username="root";
		String  password="Ramya@2000";
		Connection connect =null;
		PreparedStatement statement= null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connect =DriverManager.getConnection(url,username,password);
			statement=connect.prepareStatement(CREATE_TABLE);
			statement.executeUpdate();
			System.out.println("Table created");
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(statement!=null) 
				{
				statement.close();	
				}
				if(connect!=null)
				{
					connect.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
}
}