package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertOpretion {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	try
	{
	System.out.println("Enter the UserId");	
	String user_id=sc.nextLine();
	System.out.println("Enter full name");	
	String name=sc.nextLine();
	System.out.println("Enter Date of Birth");	
	String dob=sc.nextLine();
	System.out.println("Enter EmailId");	
	String email=sc.nextLine();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false","root","Ramya@2000");
	PreparedStatement pst = connect.prepareStatement( " insert into User(user_id,fullname,dob,email)values(?,?,?,?)");
	
	pst.setString(1, user_id);
	pst.setString(2, name);
	pst.setString(3, dob);
	pst.setString(4, email);
	int i=pst.executeUpdate();
	System.out.println( i+"rows affected");
			if(i!=0)
			{
				System.out.println("record successfully added");
			}
			else
			{
				System.out.println("failed");
		
			}
	}
	catch(Exception e)
	{
		System.out.println(e);
		
	}

}
}
