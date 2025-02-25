package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class MenuDao {
		Connection con;
		DBconnectionDao dbc=new DBconnectionDao();
    public boolean getDesiredShifts(String employeeId) {
    	con=dbc.getConnection();
        boolean menu = false;
        String sql = "SELECT COUNT(*) AS count FROM shift_desired WHERE employee_id = ? AND attendance_date >= ? AND attendance_date < ? AND desiredFrag = 0";

        // 先月の19日と今月の18日を計算
        LocalDate today = LocalDate.now();
        LocalDate startDate = today.minusMonths(1).withDayOfMonth(19);
        LocalDate endDate = today.withDayOfMonth(19);

        try (Connection connection = con;
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
        	System.out.println( String.format("%07d", Integer.parseInt(employeeId)));
        	pstmt.setString(1, String.format("%07d", Integer.parseInt(employeeId)));
            pstmt.setDate(2, Date.valueOf(startDate));
            pstmt.setDate(3, Date.valueOf(endDate));

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);  // カラム名を指定せずインデックスで取得
                System.out.println("取得した COUNT(*) の値: " + count);
                menu = count > 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        DBconnectionDao.delconnection();
        System.out.println(menu);
        return menu;
    }
    
    public int getreplacement_request(String employeeId) {
    	con=dbc.getConnection();
        int request = 0;
        String sql = "SELECT COUNT(*) AS count FROM shift_replacement_request WHERE employee_id_2 = ? AND answer_flag = 1 ";
        try (Connection connection = con;
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

        	pstmt.setString(1, String.format("%07d", Integer.parseInt(employeeId)));

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
            	int count = rs.getInt(1);  // カラム名を指定せずインデックスで取得
                System.out.println("取得した COUNT(*) の値: " + count);
                request = count;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DBconnectionDao.delconnection();
        System.out.println(request);
        return request;
    }
}

