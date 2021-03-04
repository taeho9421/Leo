package bit.myapp.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJdbcDelete {
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String user = "comstudy21";
	static String password = "comstudy21";

	static Connection conn;
	static Statement stmt;

	static final String DELETE = "DELETE FROM SARAM WHERE ID=";

	static Scanner scan = new Scanner(System.in);
	static String id;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		TestJdbcSelect.main(null); // 미리보기 ( 목록을 먼저 한번 확인해보기 위해 ) 
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();
		System.out.print("삭제할 레코드의 아이디 입력>> ");
		id = scan.next();
		int cnt = stmt.executeUpdate(DELETE + "'" + id + "'");
		if (cnt != 0) {
			System.out.println("삭제완료!");
			conn.commit();
		} else {
			System.out.println("삭제 실패!");
			conn.rollback();
		}

		// 객체 닫아주기
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();

		// 입력 결과 확인
		TestJdbcSelect.main(null);
	}
}
