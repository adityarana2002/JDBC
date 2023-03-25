package data;
import java.sql.*;
import java.util.*;


public class insertData {
   
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);
			try
			{
				int n =0;
				System.out.println("Enter how Many Data you want Insert :: ");
				 n = sc.nextInt();
				
				Class.forName("com.mysql.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost:3306/inserjdbc";
				String username = "root";
				String pass = "Aditya@8126";
				
				Connection con = DriverManager.getConnection(url,username,pass);
				
				// Create a Query .....
				for(int i =0;i<n;i++) {
				
			    String q = "insert into table1(tName,tCity) values (?,?)";
				// Get the Prepared object .....
				PreparedStatement ptsmt = con.prepareStatement(q);
	            //  Set the values of Query ......
				System.out.println("Enter Name :: ");
				String name = sc.next();
				System.out.println("Enter City :: ");
				String city = sc.next();
				ptsmt.setString(1,name);
				ptsmt.setString(2,city);
				
				ptsmt.executeUpdate();
				
				System.out.println("Inserted ........");
				}
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}


