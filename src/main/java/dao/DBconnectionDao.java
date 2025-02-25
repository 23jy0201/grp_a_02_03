package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnectionDao {
	private static Connection con;


	public Connection getConnection() {
		con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String url = "jdbc:mysql://10.42.129.142:3306/23jygr03";
		try {
			con = DriverManager.getConnection(url, "23jygr03", "23jygr03");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void delconnection() {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}