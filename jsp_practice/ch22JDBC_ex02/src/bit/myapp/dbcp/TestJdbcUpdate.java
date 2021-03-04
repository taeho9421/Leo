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

	static final String SELECT_ONE = "SELECT * FROM SARAM WHERE ID=?"; // ID�� �˻�
	static final String UPDATE = "UPDATA SARAM SET NAME=?, AGE=? WHERE ID=?"; // �̸������̸�
																				// ������
																				// ������
	static Scanner scan = new Scanner(System.in);
	static String id, name;
	static int age;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		// System.out.println("����̹� �˻��Ϸ�!");
		conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(SELECT_ONE);
		System.out.print("�˻��� ���̵� �Է�>> ");
		id = scan.next();
		pstmt.setString(1, id);

		rs = pstmt.executeQuery();
		if (rs.next()) {
			String name = rs.getString("name");
			int age = rs.getInt("age");
			System.out.printf("%-10s%-20s%d\n", id, name, age);
		} else {
			System.out.println("�˻� ����� �����ϴ�!");
			return;
		}

		System.out.print("�� �̸� �Է�>> ");
		name = scan.next();
		System.out.print("�� ���� �Է�>> ");
		age = scan.nextInt();
		pstmt = conn.prepareStatement(UPDATE);
		pstmt.setString(1, name);
		pstmt.setInt(2, age);
		pstmt.setString(3, id);

		int cnt = pstmt.executeUpdate();
		if (cnt != 0) {
			System.out.println("�����Ϸ�!");
			conn.commit();
		} else {
			System.out.println("��������!");
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
