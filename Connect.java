import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect

{
	 public static void main(String[] args) {
		    
		   String url="jdbc:sqlserver://192.168.1.232:1433;databaseName=cherrypick";
		   String user="sa";
		   String password="P@ssw0rd";
		   
		   try {
			Connection con=DriverManager.getConnection(url, user, password);
			
			System.out.println("Connected.....");
		} catch (SQLException e) {
			System.out.println("Error...!!");
			e.printStackTrace();
		}
		  }
}
