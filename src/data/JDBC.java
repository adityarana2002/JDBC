package data;
import java.sql.*;
public class JDBC
{
	public static void main(String[] args) throws Exception
	{
		// Load the Driver ::
		Class.forName("com.mysql.jdbc.Driver");
		// Creating a Connection -->>>
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","Aditya@8126");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select *from data  ");	
		 
		while(rs.next())
		{
			int roll = rs.getInt("RollNo");
			String name = rs.getString("Name");
			String city = rs.getString("city");
			System.out.print("  "+roll+" ");
			System.out.print("\t"+name);
			System.out.print("\t"+city);
			System.out.println();		
		}
//		int roll = rs.getInt("RollNo");
//		String name = rs.getString("Name");
//		String city = rs.getString("city");
//		int val = rs.getInt("RollNo");
//		System.out.print(val);
//		System.out.print(roll+" "+name+" "+city);
		st.close();
		con.close();
	}
}