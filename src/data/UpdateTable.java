package data;
import java.sql.*;
import java.util.Scanner;
public class UpdateTable {

	public static void main(String args[]) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/inserjdbc";
			String username = "root";
			String pass = "Aditya@8126";
			
			Connection con = DriverManager.getConnection(url,username,pass);
			Scanner sc = new Scanner(System.in);
			String query = 	"update table1 set tName = ?  , tCity = ?  where tID =? ";
			  
			System.out.println("Enter Name : ");
			String name = sc.next();
			
			System.out.println("Enter City :: ");
			String city  = sc.next();
			
			
		    System.out.println("Enter Id :: ");	
		    int id = Integer.parseInt(sc.next());
		     
		     PreparedStatement pstmt = con.prepareStatement(query);
		     
		     pstmt.setString(1, name);
		     pstmt.setString(2,city);
		     pstmt.setInt(3, id);
		     
		     pstmt.executeUpdate();
		    System.out.print("Tables Updated ............"); 
		     con.close();
			  
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
