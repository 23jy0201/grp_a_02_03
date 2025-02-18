package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class employeeDao{
    public static void main(String[] args) {
        // データベースの接続情報
        String url = "jdbc:mysql://10.42.129.142:3306/23jygr03"; // データベースのURL
        String username = "23jygr03"; // ユーザー名
        String password = "23jygr03"; // パスワード

        // 接続を取得する
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // 接続成功時
            System.out.println("データベース接続に成功しました！");
            String sql = "SELECT * FROM employee";  // 'your_table' を実際のテーブル名に変更

            // ステートメントの作成
            try (Statement statement = connection.createStatement()) {

                // クエリの実行
                ResultSet resultSet = statement.executeQuery(sql);

                // 結果の処理
                while (resultSet.next()) {
                    // 各カラムを取得
                    String id = resultSet.getString("employee_id");  // idカラムの値を取得（カラム名を指定）
                    String name = resultSet.getString("employee_name");  // nameカラムの値を取得（カラム名を指定）

                    // 必要に応じて他のカラムも取得
                    System.out.println("ID: " + id + ", Name: " + name);  // 取得したデータを表示
                }
            }
        } catch (SQLException e) {
            // 接続失敗時
            System.out.println("データベース接続に失敗しました！");
            e.printStackTrace();
        }
    }
}
