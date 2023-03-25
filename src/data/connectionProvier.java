package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionProvier {
	private static Connection con;
	
	public static Connection getConnection() {
try {
			if(con == null) {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/inserjdbc";
			String username = "root";
			String pass = "Aditya@8126";
			
			Connection con = DriverManager.getConnection(url,username,pass);
			}
     }
       catch(Exception e) {
    	   e.printStackTrace();
       }
return con;
	}

}
