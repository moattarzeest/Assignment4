package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLCredentials
{
	String admin;
	String pass;
	
	public void Admin() throws ClassNotFoundException
	{
		// TODO Auto-generated method stub 
		AdminCredentials objCred=new AdminCredentials();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			java.sql.Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from AdminCredentials");
			while(rs.next())
			{
		     	//int  id=rs.getInt(1);
		     	
				String adminName=rs.getString("Name");
				String adminPass=rs.getString("Password");
				
				//System.out.println(id + " "+ adminName +" "+adminPass);
			}
			con.close();
		}
		 catch (SQLException e) 
		{
				// TODO: handle exception
				System.out.print("Driver not found\n");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

}
}
