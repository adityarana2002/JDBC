package data;
import java.sql.*;
public class fun {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/inserjdbc";
			String username = "root";
			String pass = "Aditya@8126";
			
			Connection con = DriverManager.getConnection(url,username,pass);
			
			// Create a Query .....
			String q = "insert into table1(tName,tCity) values (?,?)";
			// Get the Prepared object .....
			PreparedStatement ptsmt = con.prepareStatement(q);
            //  Set the values of Query ......
			ptsmt.setString(1,"Mayank");
			ptsmt.setString(2, "Uttrakhand");
			
			
			ptsmt.executeUpdate();
			
			System.out.println("Inserted ........");
			
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
