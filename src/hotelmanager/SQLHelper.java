/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hoang Anh
 */
public class SQLHelper {
	String dbClass = "com.mysql.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/hotelmanager";

	public Connection getConnection(String dbClass, String dbUrl) throws SQLException {
		Connection conn = null;
		try {
			Class.forName(dbClass);
			conn = DriverManager.getConnection(dbUrl, "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return conn;
	}

	public void addRoom(int hotelID, Room r, Connection conn) throws SQLException {
		String sql = "INSERT INTO Room(name, hotelID, type, price, des) VALUES(?,?,?,?,?)";
		PreparedStatement prstm = null;
		try {
			prstm = conn.prepareStatement(sql);
			prstm.setString(1, r.getName());
			prstm.setInt(2, r.getHotelID());
			prstm.setString(3, r.getType());
			prstm.setString(4, r.getDisplayPrice());
			prstm.setString(5, r.getDescription());
			prstm.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			throw e;
		}
	}
}
