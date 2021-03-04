package bit.myapp.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJdbcUpdate {

	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String user = "comstudy21";
	static String password = "comstudy21";

	static Connection conn;
	static PreparedStatement pstmt;
	static ResultSet rs;

	static final String SELECT_ONE = "SELECT * FROM SARAM WHERE ID=?"; // ID로 검색
	static final String UPDATE = "UPDATA SARAM SET NAME=?, AGE=? WHERE ID=?"; // 이름과나이만
																				// 수정이
																				// 가능함
	static Scanner scan = new Scanner(System.in);
	static String id, name;
	static int age;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		// System.out.println("드라이버 검색완료!");
		conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(SELECT_ONE);
		System.out.print("검색할 아이디 입력>> ");
		id = scan.next();
		pstmt.setString(1, id);

		rs = pstmt.executeQuery();
		if (rs.next()) {
			String name = rs.getString("name");
			int age = rs.getInt("age");
			System.out.printf("%-10s%-20s%d\n", id, name, age);
		} else {
			System.out.println("검색 결과가 없습니다!");
			return;
		}

		System.out.print("새 이름 입력>> ");
		name = scan.next();
		System.out.print("새 나이 입력>> ");
		age = scan.nextInt();
		pstmt = conn.prepareStatement(UPDATE);
		pstmt.setString(1, name);
		pstmt.setInt(2, age);
		pstmt.setString(3, id);

		int cnt = pstmt.executeUpdate();
		if (cnt != 0) {
			System.out.println("수정완료!");
			conn.commit();
		} else {
			System.out.println("수정실패!");
			conn.rollback();
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
