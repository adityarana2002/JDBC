package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SelectJDBC {
	public static void main(String args[]) {
		try {
			
Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/inserjdbc";
			String username = "root";
			String pass = "Aditya@8126";
			
			Connection con = DriverManager.getConnection(url,username,pass);
			
			
//			
//			Connection con =ConnectionProvider.getConnection();
//			
			String query = "select * from Table1;";
			
			Statement stmt = con.createStatement();
			 ResultSet set =  stmt.executeQuery(query);
			 
			 System.out.println("ID "+"\t"+"Name"+"\t"+"City");
			 System.out.println();
			 while(set.next())
			 {
				 int id = set.getInt(1);
				 String name = set.getString(2);
				 String city = set.getString(3);
				 
				 System.out.println(id+"\t"+name+"\t"+city);
				
			 }
			 con.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		    e.printStackTrace();
		}
	}

}
