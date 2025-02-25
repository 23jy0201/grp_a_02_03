package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Hourly_wagesModel;

public class hourly_wagesDAO {
	private static final String URL = "jdbc:mysql://10.42.129.142:3306/23jygr03";
	private static final String USER = "23jygr03";
	private static final String PASSWORD = "23jygr03";

	// データベース接続の取得
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	public Hourly_wagesModel getWageById(String employeeId) {
	        String query = "SELECT * FROM hourly_wages WHERE employee_id = ?"
	        		+ "AND hourly_wage_start_date < CURDATE()"
	        		+ "AND CURDATE() < hourly_wage_end_date";
	        Hourly_wagesModel horlywage = null;

	        try (Connection connection = getConnection();
	             PreparedStatement statement = connection.prepareStatement(query)) {

	            statement.setString(1, employeeId);
	            ResultSet resultSet = statement.executeQuery();
	            if (resultSet.next()) {
	                horlywage = new Hourly_wagesModel(
	                        resultSet.getString("employee_id"),
	                        resultSet.getDate("hourly_wage_start_date"),
	                        resultSet.getInt("hourly_wage"),
	                        resultSet.getDate("hourly_wage_end_date")
	                );
                }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return horlywage;
	    }
}