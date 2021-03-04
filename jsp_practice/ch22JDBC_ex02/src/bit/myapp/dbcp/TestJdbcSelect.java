package bit.myapp.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcSelect {
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String user = "comstudy21";
	static String password = "comstudy21";

	static Connection conn;
	static Statement stmt;
	static ResultSet rs;

	static final String SELECT = "SELECT * FROM SARAM";

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// System.out.println("드라이버 검색완료!");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT);
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.printf("%-10s%-20s%d\n", id, name, age);
			}
		} catch (SQLException e) {
			System.out.println("DB접속실패!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 검색 실패!");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
