package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CandidateSQL {
	public void candidate(String s1 , String s2 ,String p1) throws ClassNotFoundException 
	{
		// TODO Auto-generated method stub 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			java.sql.Statement st=con.createStatement();
			st.execute ("use mysql");
			String sql="INSERT INTO vote VALUES (?,?,?)";
			PreparedStatement stat=con.prepareStatement(sql);
			stat.setString(1,s1);
			stat.setString(2,s2);
     		stat.setString(3,p1);

     		
			int a=stat.executeUpdate();
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
