package bit.myapp.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJdbcSelectOne {
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String user = "comstudy21";
	static String password = "comstudy21";

	static Connection conn;
	static PreparedStatement pstmt;
	static ResultSet rs;

	static final String SELECT_ONE = "SELECT * FROM SARAM WHERE ID=?"; // ID로 검색

	static Scanner scan = new Scanner(System.in);
	static String id;
	static int age;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		// System.out.println("드라이버 검색완료!");
		conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(SELECT_ONE);
		System.out.print("검색할 아이디 입력>> ");
		String id = scan.next();
		pstmt.setString(1, id);

		rs = pstmt.executeQuery();
		while (rs.next()) {
			String name = rs.getString("name");
			int age = rs.getInt("age");
			System.out.printf("%-10s%-20s%d\n", id, name, age);
		}

		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
