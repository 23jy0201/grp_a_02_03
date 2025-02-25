package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.EmployeeModel;

public class EmployeeDao{
	DBconnectionDao dbc=new DBconnectionDao();
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	public EmployeeDao(){
		
	}
	
    // Create: 新しいEmployeeをデータベースに追加
    public boolean create(EmployeeModel employee) {
        String query = "INSERT INTO employee (employee_id, store_id, employee_name, furigana, birthdate, address, postal_code, email_address, phone_number, employee_password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        con=dbc.getConnection();
        try{
            stmt = con.prepareStatement(query);
            stmt.setString(1, employee.getEmployee_id());
            stmt.setString(2, employee.getStore_id());
            stmt.setString(3, employee.getEmployee_name());
            stmt.setString(4, employee.getFurigana());
            stmt.setString(5, employee.getBirthdate());
            stmt.setString(6, employee.getAddress());
            stmt.setString(7, employee.getPostal_code());
            stmt.setString(8, employee.getEmail_address());
            stmt.setString(9, employee.getPhone_number());

            int rowsAffected = stmt.executeUpdate();
            endcon();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        endcon();
        return false;
    }

    // Read: employee_idでEmployeeを取得
    public EmployeeModel read(String employeeId) {
        String query = "SELECT * FROM employee WHERE employee_id = ?";
        EmployeeModel employee = null;
        con=dbc.getConnection();
        try {
        	stmt = con.prepareStatement(query);
            stmt.setString(1, employeeId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                employee = new EmployeeModel(
                        rs.getString("employee_id"),
                        rs.getString("store_id"),
                        rs.getString("employee_name"),
                        rs.getString("furigana"),
                        rs.getString("birthdate"),
                        rs.getString("address"),
                        rs.getString("postal_code"),
                        rs.getString("email_address"),
                        rs.getString("phone_number"),
                        rs.getString("employee_password")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        endcon();
        return employee;
    }

    // Read: 全てのEmployeeを取得
    public List<EmployeeModel> readAll() {
        String query = "SELECT * FROM employee";
        List<EmployeeModel> employees = new ArrayList<>();
        con=dbc.getConnection();
        try {
        	stmt = (PreparedStatement) con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                EmployeeModel employee = new EmployeeModel(
                        rs.getString("employee_id"),
                        rs.getString("store_id"),
                        rs.getString("employee_name"),
                        rs.getString("furigana"),
                        rs.getString("birthdate"),
                        rs.getString("address"),
                        rs.getString("postal_code"),
                        rs.getString("email_address"),
                        rs.getString("phone_number"),
                        rs.getString("employee_password")
                );
                employees.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        endcon();
        return employees;
    }

    // Update: Employeeの情報を更新
    public boolean update(EmployeeModel employee) {
        String query = "UPDATE employee SET store_id = ?, employee_name = ?, furigana = ?, birthdate = ?, address = ?, postal_code = ?, email_address = ?, phone_number = ?, employee_password = ? WHERE employee_id = ?";
        con=dbc.getConnection();
        try {
        	stmt = con.prepareStatement(query);
            stmt.setString(1, employee.getStore_id());
            stmt.setString(2, employee.getEmployee_name());
            stmt.setString(3, employee.getFurigana());
            stmt.setString(4, employee.getBirthdate());
            stmt.setString(5, employee.getAddress());
            stmt.setString(6, employee.getPostal_code());
            stmt.setString(7, employee.getEmail_address());
            stmt.setString(8, employee.getPhone_number());
            stmt.setString(10, employee.getEmployee_id());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Delete: Employeeを削除
    public boolean delete(String employeeId) {
        String query = "DELETE FROM employee WHERE employee_id = ?";
        con=dbc.getConnection();
        try {
        	stmt = con.prepareStatement(query);
            stmt.setString(1, employeeId);

            int rowsAffected = stmt.executeUpdate();
            endcon();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        endcon();
        return false;
    }
    
    public String user_decision(String id) {
        String table_name = null;
        String query = "SELECT 'shift_manager' AS table_name WHERE EXISTS (SELECT 1 FROM shift_manager WHERE employee_id = ?)\n"
                + "UNION ALL\n"
                + "SELECT 'headquarters' AS table_name WHERE EXISTS (SELECT 1 FROM headquarters WHERE employee_id = ?)\n"
                + "UNION ALL\n"
                + "SELECT 'part_timer_albite' AS table_name WHERE EXISTS (SELECT 1 FROM part_timer_albite WHERE employee_id = ?);";
        con=dbc.getConnection();
        try {
        	stmt=con.prepareStatement(query);
            stmt.setString(1, id); // 各プレースホルダーに値を設定
            stmt.setString(2, id);
            stmt.setString(3, id);

            try (ResultSet resultSet = stmt.executeQuery()) {
                StringBuilder sb = new StringBuilder(); // 複数のテーブル名を格納する場合
                while (resultSet.next()) {
                    sb.append(resultSet.getString("table_name")).append(",");
                }
                if (sb.length() > 0) {
                    table_name = sb.substring(0, sb.length() - 1); // 最後のカンマを削除
                }
            }

        } catch (SQLException e) {
            e.printStackTrace(); // エラーメッセージを出力 (ログに記録するなど、より適切な処理を)
            // 必要であれば、例外を再スロー
            throw new RuntimeException("Database error", e); // 例: RuntimeExceptionでラップして再スロー
        }
        endcon();
        System.out.println(table_name);
        return table_name;
    }
    
    void endcon() {
    	if(rs !=null) {
    		try {
				rs.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
    	}
    	if(stmt!=null) {
    		try {
				stmt.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
    	}
        if (con != null) {
        	dbc.delconnection();
        }
    }
    
}
