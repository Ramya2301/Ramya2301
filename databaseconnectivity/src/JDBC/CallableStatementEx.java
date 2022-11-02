package JDBC;


import java.sql.*;


public class CallableStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false","root","Ramya@2000");
		   Statement s=con.createStatement();
		   CallableStatement cs=con.prepareCall( "{call get_subjects(?)}");
		   cs.setString(1, "chemistry");
		   cs.execute();
		   ResultSet result=cs.executeQuery();
		   while(result.next())
		   {
		   System.out.println("stud_id: "+result.getInt(1)+"   stud_code: "+result.getInt(2)+"  stud_name: "+result.getString(3));
		   }

}
	catch (SQLException e)
	{
		System.out.println(e);
	}
	catch (ClassNotFoundException e)
		{
		e.printStackTrace();
		
		}
	
		
	}
		
	}
