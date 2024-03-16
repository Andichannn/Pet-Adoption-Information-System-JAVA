package PetAdoption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
		
	public static void main(String[]args) {

	String connectionString = 
			"jdbc:sqlserver://Andi;Database=PetAdoption;IntegratedSecurity=true; encrypt=false;trustServerCertificate=true";
	try {
		try (Connection connection = DriverManager.getConnection(connectionString)) {
			
			System.out.println("Connection established.");
		}
	} catch (SQLException e) {
		
		System.out.println("Error Connecting to the database");
		e.printStackTrace();
		}
	}
}