package crudDemo;
import java.sql.*;
public class School6Table2 {
	public static void createTable2 (Connection connect) throws SQLException{

	PreparedStatement ps = connect.prepareStatement ("CREATE TABLE IF NOT EXISTS StudentMarks ("+
			"regno INT PRIMARY KEY, " +
			"subject VARCHAR(10), "+
			"marks INT)");
	ps.executeUpdate();

}
}