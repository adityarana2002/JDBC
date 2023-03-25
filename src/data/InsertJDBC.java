package data;
import java.sql.*;

public class InsertJDBC  {
	public static void main(String args[]) throws Exception
	{
      try {
    	    Class.forName("com.mysql.jdbc.Driver");
    	    
    	    String url = "jdbc:mysql://localhost:3306/inserjdbc";
    	    String username = "root";
    	    String password = "Aditya@8126";
    	    Connection  con = DriverManager.getConnection(url,username,password);
    	    // create a Query--->>
    	    String query  = "desc table1;";  
    	    // Create a Statment --->>
    	    Statement stmt = con.createStatement();
    	    stmt.executeQuery(query);
    	    System.out.print("Table created in Databases ....");
    	    System.out.print(query);
    	    con.close();
      }   
      catch(Exception e)
      {
    	  e.printStackTrace();
      }
	}

}
