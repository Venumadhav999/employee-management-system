package crudDemo;
import java.sql.*;
public class connectEstablishment {
	
	private static final String URL="jdbc:mysql://localhost:3306/Schoo16";

	private static final String username="root";

	private static final String password= "Venu@533";
	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection (URL, username, password);
	





	
	}
}
