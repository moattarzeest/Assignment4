package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VoteRetrivel {
	
	Results objResult=new Results();
	int count1=0;
	int count2=0;
	int count3=0;
	public void Pti() throws ClassNotFoundException 
	{
		// TODO Auto-generated method stub 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			java.sql.Statement st=con.createStatement();
			st.execute ("use mysql");
			
			ResultSet rs= st.executeQuery("select * from pti");
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				int integer=rs.getInt("vote");
				count1++;
				
			}
			System.out.println("Number of votes is" + count1);
			//objResult.displayResults(count1);
	
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
	
	
	public void Pmln() throws ClassNotFoundException 
	{
		// TODO Auto-generated method stub 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			java.sql.Statement st=con.createStatement();
			st.execute ("use mysql");
			
			ResultSet rs= st.executeQuery("select * from pmln");
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				int integer=rs.getInt("vote");
				count2++;
				
			}
			System.out.println("Number of votes for "+count2);
			//objResult.displayResults(count2);
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
	
	public void Ppp() throws ClassNotFoundException 
	{
		// TODO Auto-generated method stub 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			java.sql.Statement st=con.createStatement();
			st.execute ("use mysql");
			
			ResultSet rs= st.executeQuery("select * from ppp");
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				int integer=rs.getInt("vote");
				count3++;
			}
			System.out.println("Number of votes for "+count3);
			//objResult.displayResults(count3);
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
