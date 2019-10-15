
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class database {


	protected static Connection initializeDatabase()
			throws SQLException, ClassNotFoundException
	{
		String dbDriver="com.mysql.jdbc.Driver";
		Class.forName(dbDriver);
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
		return con;
	}
}
