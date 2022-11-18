package hotelmanagerment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class connectdb {

	public static Connection getConnection() throws SQLException {
		Connection c = null;
		try {
//			com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url = "jdbc:mySQL//localhost:3306/hotelmanager";
			String user = "root";
			String password = "root";
			c = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return c;
	}

	public static void closeConnection(Connection c) throws SQLException {
		try {
			if (c != null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getInfomation(Connection c) {
		try {
			if (c != null) {
				System.out.println(c.getMetaData().toString());
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
