package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.EmployeeModel;
import model.EmployeeShiftInfoModel;
import model.Shift_desired_templateModel;

public class Person_info_changeDao {
	Connection con;
	DBconnectionDao dbc=new DBconnectionDao();
	  public EmployeeShiftInfoModel getEmployeeShiftInfo(String employeeId) {
		  final String QUERY = 
			        "SELECT e.employee_name, e.furigana, e.birthdate, e.address, e.postal_code, " +
			        "e.email_address, e.phone_number, s.weekday, s.start_time, s.end_time " +
			        "FROM employee e " +
			        "JOIN shift_desired_template s ON e.employee_id = s.employee_id " +
			        "WHERE e.employee_id = ?";  
		  EmployeeShiftInfoModel employeeShiftInfo = null;

	        try (Connection conn = dbc.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(QUERY)) {

	            pstmt.setString(1, employeeId);

	            try (ResultSet rs = pstmt.executeQuery()) {
	                if (rs.next()) {
	                	 EmployeeModel employee = new EmployeeModel(
	                             rs.getString("employee_name"),
	                             rs.getString("furigana"),
	                             rs.getString("birthdate"),
	                             rs.getString("address"),
	                             rs.getString("postal_code"),
	                             rs.getString("email_address"),
	                             rs.getString("phone_number")
	                         );

	                         Shift_desired_templateModel shift = new Shift_desired_templateModel(
	                             rs.getString("weekday"),
	                             rs.getTime("start_time"),
	                             rs.getTime("end_time")
	                         );

	                         employeeShiftInfo = new EmployeeShiftInfoModel(employee, shift);
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }


        return employeeShiftInfo;
    }

}
